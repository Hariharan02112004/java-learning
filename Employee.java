import java.util.Scanner;

class Address {
    String address;
}

class Person {
    int id;
    String name;
    Address address; // Each person has an Address object

    void printStatement() {
        System.out.println("The name of the person is: " + this.name + 
                           " & the id no is " + this.id + 
                           " & the address is " + this.address.address);
    }
}

class Employee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Creating person objects
        Person p1 = new Person();
        Person p2 = new Person();

        // Assigning address objects to each person
        p1.address = new Address();
        p2.address = new Address();

        // Taking input for the first person
        System.out.print("Enter ID for person 1: ");
        p1.id = in.nextInt();
        in.nextLine();  // Clear buffer

        System.out.print("Enter Name for person 1: ");
        p1.name = in.nextLine();

        System.out.print("Enter Address for person 1: ");
        p1.address.address = in.nextLine();

        // Taking input for the second person
        System.out.print("Enter ID for person 2: ");
        p2.id = in.nextInt();
        in.nextLine();  // Clear buffer

        System.out.print("Enter Name for person 2: ");
        p2.name = in.nextLine();

        System.out.print("Enter Address for person 2: ");
        p2.address.address = in.nextLine();

        // Printing the details
        p1.printStatement();
        p2.printStatement();

        in.close();  // Close the scanner
    }
}
