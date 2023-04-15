from typing import Tuple, Dict, Any


def greet():
    return 'Hello World'


def second_largest_number(*kwargs) -> int:
    number_list = [element for element in kwargs]
    maximum = max(number_list)
    number_list.remove(maximum)
    return max(number_list)


def print_letter(word: str):
    for letter in word:
        print(letter)
    return


def two_letters_a_line(word: str):
    index = 0
    while index < len(word):
        if index % 2 == 0:
            print(word[index], end=' ')
        else:
            print(word[index])
        index += 1
    return


def character_count(word: str, letter1: str, letter2: str):
    letter1_count = word.count(letter1)
    letter2_count = word.count(letter2)
    return '%s -> %d \n%s -> %d' % (letter1, letter1_count, letter2, letter2_count)


def multiples_of_three_sum(number: int) -> int:
    sum_of_numbers = 0
    for num in range(number + 1):
        if num % 3 == 0:
            sum_of_numbers += num
    return sum_of_numbers


def guess_a_date(date: int):
    not_guessed = True
    trials = 0
    while not_guessed and trials != 3:
        guess = input('what is my birth date -> ')
        if guess == str(date):
            not_guessed = False
        else:
            return 'Incorrect guess'
        return 'Correct guess'


def pi_calculator(steps: int) -> dict[int, str]:
    numerator = 4
    denominator = 1
    step = 0
    pi = 0
    pi_dict = {}
    while step < steps:
        if step % 2 == 0:
            pi += numerator / denominator
        elif step % 2 != 0:
            pi -= numerator / denominator
        pi_dict[step] = '%.5f' % pi
        if pi_dict[step] == '3.14159':
            break
        step += 1
        denominator += 2
    return pi_dict


def binary_to_decimal(binary_number: str) -> int:
    length = len(binary_number)
    decimal_number = 0
    exp = 0
    while length != 0:
        decimal_number += int(binary_number[length - 1]) * 2 ** exp
        exp += 1
        length -= 1
    return decimal_number


def list_sort(param: list) -> list:
    new_list = []
    count = 0
    while count != len(param):
        new_list.append(min(param))
        param.remove(min(param))
    return new_list


def merge_sort_list(list1: list, list2: list) -> list:
    new_list = list1 + list2
    return list_sort(new_list)


def element_product(list1: list) -> list:
    new_list = []
    index = 0
    while index < len(list1):
        product = 1
        for element in list1:
            if element != list1[index]:
                product *= element
        new_list.append(product)
        index += 1
    return new_list


# todo
def find_first_unique(list1: list) -> Any | None:

    pass


def rotate_array(arr: list) -> list:
    new_list = [arr[len(arr) - 1]]
    arr.remove(arr[len(arr) - 1])
    new_list += arr
    return new_list


def rearrange(arr: list) -> list:
    new_list = []
    for element in arr:
        if element < 0:
            new_list.append(element)
            arr.remove(element)
    new_list += arr
    return new_list


class LinkedList:
    def __init__(self, data_val=None):
        self.data_val = data_val
        self.next_val = None
