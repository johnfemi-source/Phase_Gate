def countEvens(numbers_list):
    even_count = 0
    for number in numbers_list:
        if number % 2 == 0:
            even_count += 1
    return even_count


def squares(number):
    square_numbers = []
    for number in range(1, number + 1):
        square_numbers.append(number * number)
    return square_numbers


def arraysEqual(first_list, second_list):
    if len(first_list) != len(second_list):
        return False
    
    for index in range(len(first_list)):
        if first_list[index] != second_list[index]:
            return False
    
    return True


def removeDuplicates(input_list):
    unique_list = []
    for number in input_list:
        if number not in unique_list:
            unique_list.append(number)
    return unique_list
