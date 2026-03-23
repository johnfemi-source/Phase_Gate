def numbers_in_a_list(target_length):
    result = list()
    while len(result) < target_length:
        result.append(-1)
    return result



def compress_string(size):
    result = ""
    count = 1

    for  number in range(1, len(size)):
        if size[number] == size[number - 1]:
            count += 1
        else:
            result += size[number - 1] + str(count)
            count = 1

    result += size[-1] + str(count)

    return result

print(compress_string("AaaBBc"))      
print(compress_string("EEEEnnnneee")) 
print(compress_string("ooooooYoo"))
   


