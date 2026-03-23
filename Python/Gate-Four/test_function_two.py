from unittest import TestCase
import function_two


class TestFunctionTwo(TestCase):

    def test_count_evens(self):
        actual = function_two.countEvens([1, 2, 3, 4, 6])
        expected = 3
        self.assertEqual(expected, actual)

    def test_squares(self):
        actual = function_two.squares(5)
        expected = [1, 4, 9, 16, 25]
        self.assertEqual(expected, actual)

    def test_arrays_equal_true(self):
        actual = function_two.arraysEqual([1, 2, 3], [1, 2, 3])
        expected = True
        self.assertEqual(expected, actual)

    def test_arrays_equal_false(self):
        actual = function_two.arraysEqual([1, 2, 3], [1, 2, 4])
        expected = False
        self.assertEqual(expected, actual)

    def test_remove_duplicates(self):
        actual = function_two.removeDuplicates([1, 2, 2, 3, 1, 4])
        expected = [1, 2, 3, 4]
        self.assertEqual(expected, actual)
