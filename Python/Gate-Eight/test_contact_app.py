from unittest import TestCase
import contact_app


class TestContactApp(TestCase):

    def test_for_add_contact(self):
        first_name = "john"
        last_name = "femi"
        phone_number = "09029950914"

        actual = contact_app.add_contact(first_name, last_name, phone_number)
        expected = "Contact Added Successfully"

        self.assertEqual(actual, expected)
