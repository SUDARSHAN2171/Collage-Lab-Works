from datetime import datetime, timedelta

now =datetime.now()
print(now)
date_obj =datetime(2024,9,27,14,30)
print(date_obj)
date_str ='2024-09-27 14:30:00'
date_format= datetime.strptime(date_str, "%Y-%m-%d %H:%M:%S")
print(date_format)
formatted_date= date_obj.strftime("%Y-%m-%d %H:%M:%S")
print(formatted_date)
time_diff =datetime.now()- date_obj
print(time_diff)
