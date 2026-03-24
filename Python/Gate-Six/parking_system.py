TOTAL_SLOTS = 20
slots = [0] * (TOTAL_SLOTS + 1)  

def parking_system():
    print("=============================")
    print("   Welcome to Parking Lot    ")
    print("=============================")

    while True:
        print("\n1. Park a car")
        print("2. Remove a car")
        print("3. Display parking status")
        print("0. Exit")
        choice = input("Enter choice: ")

        if choice == "1":
            car_number = int(input("Enter car number: "))
            preferred = int(input("Enter preferred slot (0 = auto-assign): "))
            enter_car(car_number, preferred)
        elif choice == "2":
            slot = int(input("Enter slot number to vacate: "))
            exit_car(slot)
        elif choice == "3":
            display_status()
        elif choice == "0":
            print("Goodbye!")
            break
        else:
            print("Invalid option. Try again.")


