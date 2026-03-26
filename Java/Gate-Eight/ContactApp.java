import java.util.*;

public class ContactApp {

    static void addContact() {
        System.out.print("Enter Name: ");
        String name = input.nextLine();

        System.out.print("Enter Phone: ");
        String phone = input.nextLine();

        names.add(name);
        phones.add(phone);

        System.out.println("Added!");
    }
  
    static void removeContact() {
        System.out.print("Enter phone Number to delete: ");
        String phone = input.nextLine();

        int index = phones.indexOf(phone);

        if (index != -1) {
            names.remove(index);
            phones.remove(index);
            System.out.println("Removed!");
        } else {
            System.out.println("Not found!");
        }
    }

    static void findContact() {
        System.out.print("Enter phone Number: ");
        String phone = input.nextLine();

        int index = phones.indexOf(phone);

        if (index != -1) {
            System.out.println("Name: " + names.get(index));
            System.out.println("Phone: " + phones.get(index));
        } else {
            System.out.println("Not found!");
        }
    }
}
