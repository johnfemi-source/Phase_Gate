from unittest import TestCase
import function

class TestFunctions(TestCase):

    def test_get_primes(self):
        actual = function.get_primes([5, 9, 3, 6, 2])
        expected = [5, 3, 2]
        self.assertEqual(expected, actual)

    def test_remove_negatives(self):
        actual = function.remove_negatives([5, -9, 3, -6, 2, -11])
        expected = [5, 0, 3, 0, 2, 0]
        self.assertEqual(expected, actual)

    def test_move_zeros(self):
        actual = function.move_zeros([5, 0, 3, 0, 2, 0])
        expected = [5, 3, 2, 0, 0, 0]
        self.assertEqual(expected, actual)

