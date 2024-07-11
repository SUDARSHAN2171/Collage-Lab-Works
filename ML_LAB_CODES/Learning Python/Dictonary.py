#dictionaries are used to stroe data values in key:value pairs
#dictionaries are mutable(changeable) & dont allow duplicate keys
dict={
    "name":"John",
    "age":30,
    "city":"New York",
    "subjects":["pthon","c++","java"],
    "topic":("inheritance","overriding")
}
print(type(dict))
print(dict)
print(dict["city"])
print(dict["age"])
dict["surname"]="patil"
print(dict["name"])
print(dict["surname"])

