contact_list = []

def add_contact(first_name, last_name, phone_number):
    first_name = input("Enter First Name: ")
    last_name = input("Enter Last Name: ")
    phone_number = input("Enter Phone Number: ")

    contact = [first_name, last_name, phone_number]
    contact_list.append(contact)

    return "Contact Added Successfully"

def remove_contact(phone_number):
    for contact in contact_list:
        if contact[phone_number] == phone_number:
            contact_list.remove(contact)
            return "Contact Removed Successfully"
    return "Contact Not Found"

def find_contact_by_phone_number(phone_number):
    for contact in contact_list:
        if contact[phone_number] == phone_number:
            return contact[0], contact[1]
    return "Contact Not Found"
