from unittest import TestCase
import level4_task

class test_level4(TestCase):

    def test_for_addition(self):
        actual = level4_task.addition_of_numbers(firstnumber, secondnumber)
        expected = 50
        self.assertEqual(expected, actual)

    def test_for_even_number(self):
        actual = level4_task.is_even(number)
        expected = true
        self.assertEqual(expected, actual)

    def test_for_squarer(self):
        actual = level4_task.square(number)
        expected = 25
        self.assertEqual(expected, actual)

    def test_for_celsius_to_fahrenhei(self):
        actual = level4_task.celsius_to_fahrenheit(celsius)
        expected = 32.0
        self.assertEqual(expected, actual)

    def test_for_reverse_number(self):
        actual = level4_task.reverse_number(number)
        expected = 7654321
        self.assertEqual(expected, actual)
