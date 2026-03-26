contact_list = []

def add_contact(first_name, last_name,phone_Number):
    first_name =int(input("Enter First Name: ")
    last_name = int(input("Enter LasT Name: ")
    phone_number = int(input("Enter Phone Number: ")

    first_name.append(first_name)
    last_name.append(last_name)
    phone_number.append(phone_number)
    print "Contact Added Successfully"

def remove_contact(phone_number):
    for contact in contacts:
        if phone_number[contact] == contact_list:
            contact_list.remove(phone_number)
    print "Contact Removed Successfully"



