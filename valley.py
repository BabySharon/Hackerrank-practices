n = int(input())
hike = input()
valley_count = 0
step_count = 0
valley_flag = 0
mountain_flag = 0
'''for i in hike:
    if i == 'D':
        if valley_step_count == 0:  #sea level
            valley_count = valley_count + 1
            valley_flag = 1
            mountain_flag = 0
            valley_step_count = valley_step_count + 1
        else:
            if(valley_flag):
                valley_step_count = valley_step_count + 1
            
    if i == 'U':
        if mountain_flag:
            mountain_step_count = mountain_step_count +1
if hike[0] == 'D':
    valley_flag = 1
    valley_count = 1
else:
    mountain_flag = 1
'''
for i in hike:
    if step_count == 0 and  i == 'D':
        valley_flag = 1
        mountain_flag = 0
        valley_count = valley_count + 1
    if step_count == 0 and i == 'U':
        mountain_flag = 1
        valley_flag = 0
    if valley_flag :
        if i == 'D':
            step_count = step_count + 1
        elif i == 'U':
            step_count = step_count - 1
        else:
            print("Invalid Character in input")

    if mountain_flag:
        if i == 'U':
            step_count = step_count + 1
        elif i == 'D':
            step_count = step_count - 1
        else:
            print("Invalid Character in input")



print(valley_count)