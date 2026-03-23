from unittest import TestCase
import list

class ListTest(TestCase):

    def test_for_numbers_in_a_list(self):
        numbers = ({10, 11, 12}, 5) 
        actual = list.numbers_in_a_list(target_length)
        expected = [10, 11, 12, -1, -1]
        self.assertEqual(expected, actual)

    def test_for_letters(self):
        string = "AaaBBc"
        actual = list.compress_string(size)
        expected = A1a2B2c1
        self.assertEqual(expected, actual)

    def test_for_letters(self):
        string = "EEEEnnneee"
        actual = list.compress_string(size)
        expected = E4n3e3
        self.assertEqual(expected, actual)


