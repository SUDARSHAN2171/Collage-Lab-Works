import pandas as pd
import requests

def get_silver_price_from_api(api_key, date):
    url = (f"https://www.alphavantage.co/query?function=TIME_SERIES_DAILY"
           f"&symbol=XAGUSD&apikey={api_key}")
    
    response = requests.get(url)
    
    print(f"API Response for {date}: {response.json()}")

    data = response.json()

    time_series = data.get('Time Series (Daily)', {})
    
    daily_data = time_series.get(date)
    if daily_data:
        return float(daily_data['4. close'])
    else:
        print(f"No price data available for {date}.")
        return None
def create_silver_price_dataframe():
    api_key = input("Enter your Alpha Vantage API key: ")

    start_date = input("Enter the start date (YYYY-MM-DD): ")
    end_date = input("Enter the end date (YYYY-MM-DD): ")
    
    print("Select the frequency for the data:")
    print("1. Daily (D)")
    print("2. Monthly (M)")
    print("3. Yearly (Y)")
    frequency_choice = input("Select from 1/2/3: ")
    frequency_map = {'1': 'D', '2': 'M', '3': 'Y'}
    frequency = frequency_map.get(frequency_choice, 'D')
    
    date_range = pd.date_range(start=start_date, end=end_date, freq=frequency)
    
    silver_prices = []
    for date in date_range:
        date_str = date.strftime("%Y-%m-%d")
        print(f"Fetching silver price for {date_str}...")
        price = get_silver_price_from_api(api_key, date_str)
        silver_prices.append(price)
    
    df = pd.DataFrame(silver_prices, index=date_range, columns=['Silver Prices'])
    
    file_name = input("Enter the file name to save the data (e.g., silver_prices.csv): ")
    df.to_csv(file_name)
    
    return df

silver_price_df = create_silver_price_dataframe()
print("\nDataFrame:\n", silver_price_df)
