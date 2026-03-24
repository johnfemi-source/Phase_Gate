from unittest import TestCase
import parking_system


class TestParkingSystem(TestCase):

    def test_auto_assign_car(self):
        parking_system.enter_car(101)
        self.assertEqual(function.slots[1], 101)

    def test_preferred_slot_assign(self):
        parking_system.enter_car(102, 5)
        self.assertEqual(function.slots[5], 102)

    def test_preferred_slot_occupied(self):
        parking_system.enter_car(103, 3)
        parking_system.enter_car(104, 3)
        self.assertEqual(function.slots[3], 103)

