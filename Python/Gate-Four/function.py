def get_primes(numbers):
    primes = []
    for number in numbers:   
        if number > 1:
            for i in range(2, number):
                if number % i == 0:
                    break
            else:
                primes.append(number)
    return primes

print(get_primes([5, 9, 3, 6, 2]))




def remove_negatives(numbers):      
    new_list = []
    for number in numbers:             
        if number < 0:
            new_list.append(0)
        else:
            new_list.append(number)
    return new_list

print(remove_negatives([5, -9, 3, -6, 2, -11]))



def move_zeros(numbers):
    result = []
    zeros = []

    for number in numbers:
        if number == 0:
            zeros.append(number)
        else:
            result.append(number)
    return result + zeros


print(move_zeros([5, 0, 3, 0, 2, 0]))

