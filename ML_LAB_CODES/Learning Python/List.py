#list are mutable this can be changed
#built in data type 
marks=[90.7,97,93.4,93]
print(marks)
print(type(marks))
print(len(marks))
marks.append(66)
print(marks)
marks.append("Sudarshan")
print(marks)

#slicing in list
print(marks[1:3])
print(marks[-4:-1])
print(marks[-5:len(marks)])
