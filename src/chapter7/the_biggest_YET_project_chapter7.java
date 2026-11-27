package chapter7;

import java.util.Scanner;
import java.util.Arrays;
import java.time.LocalTime;

public class the_biggest_YET_project_chapter7 {

    private Scanner scanner;

    public the_biggest_YET_project_chapter7(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        the_biggest_YET_project_chapter7 app = new the_biggest_YET_project_chapter7(scanner);
        app.start();
    }

    public void start() {
        while (true) {
            displayMenu();
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a number (1-6).");
                scanner.nextLine();
                continue;
            }
            int choice = scanner.nextInt();
            scanner.nextLine();
            handleMenuChoice(choice);
        }
    }

    public void displayMenu() {
        System.out.println("Welcome to Mesozoic Eden Assistant!");
        System.out.println("1. Add Dinosaur");
        System.out.println("2. Check Park Hours");
        System.out.println("3. Greet Guest");
        System.out.println("4. Check Visitors Count");
        System.out.println("5. Manage Staff");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Adding Dinosaur...");
                adderToDino();
                break;
            case 2:
                System.out.println("Checking Park Hours...");
                Employee.checkParkHours();
                break;
            case 3:
                System.out.println("Greeting Guest...");
                adderToGuest();
                Guest.greetings();
                break;
            case 4:
                System.out.println("Checking Visitors Count...");
                Employee.checkVisitorsCount();
                break;
            case 5:
                System.out.println("Managing Staff...");
                manageStaff();
                break;
            case 6:
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice, try 1-6.");
        }
    }

    private int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            }
            System.out.println("Please enter a whole number.");
            scanner.nextLine();
        }
    }

    private double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            }
            System.out.println("Please enter a valid number.");
            scanner.nextLine();
        }
    }

    public void adderToDino() {
        System.out.print("please enter the new dino's name:");
        String adder_name = scanner.nextLine().strip();
        int adder_age = readInt("Please enter the new dino's age:");
        double adder_weight = readDouble("Please enter the weight:");
        Dinosaur.addDinosaur(adder_name, adder_age, adder_weight);
        System.out.println(adder_name + " successfully added!");
    }

    public void adderToGuest() {
        System.out.print("Please enter the new guest's name: ");
        String guestName = scanner.nextLine().strip();
        int guestAge = readInt("Please enter the new guest's age: ");
        System.out.print("Please enter the ticket type (Adult, Child, VIP, Student, Senior): ");
        String ticketType = scanner.nextLine().strip();
        Guest.addGuest(guestName, guestAge, ticketType);
        System.out.println(guestName + " (" + ticketType + ") successfully added!");
    }

    public void manageStaff() {
        while (true) {
            System.out.println("1. View Staff");
            System.out.println("2. Add Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Back to Main Menu");
            int choice = readInt("Enter your choice: ");
            switch (choice) {
                case 1:
                    Employee.displayStaff();
                    break;
                case 2:
                    adderToEmployee();
                    break;
                case 3: {
                    System.out.print("Enter the name of the employee to remove: ");
                    String name = scanner.nextLine().strip();
                    if (Employee.removeEmployee(name)) {
                        System.out.println(name + " removed from staff.");
                    } else {
                        System.out.println("No employee found with name: " + name);
                    }
                    break;
                }
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice, try 1-4.");
            }
        }
    }

    public void adderToEmployee() {
        System.out.print("Please enter the new employee's name: ");
        String name = scanner.nextLine().strip();
        System.out.print("Please enter the role: ");
        String role = scanner.nextLine().strip();
        double salary = readDouble("Please enter the salary: ");
        Employee.addEmployee(name, role, salary);
        System.out.println(name + " (" + role + ") successfully added!");
    }

    public static class Dinosaur {
        public static String[] names = {
                "Tyrannosaurus Rex", "Triceratops", "Velociraptor", "Brachiosaurus", "Stegosaurus",
                "Spinosaurus", "Ankylosaurus", "Diplodocus", "Allosaurus", "Parasaurolophus"
        };
        public static int[] ages = { 28, 22, 12, 45, 25, 30, 27, 40, 20, 18 };
        public static double[] weights = { 8000.0, 9000.0, 15.0, 56000.0, 5000.0, 7500.0, 6000.0, 15000.0, 2300.0, 2500.0 };

        public static void addDinosaur(String dino_names, int dino_ages, double dino_weights) {
            names = Arrays.copyOf(names, names.length + 1);
            names[names.length - 1] = dino_names;
            ages = Arrays.copyOf(ages, ages.length + 1);
            ages[ages.length - 1] = dino_ages;
            weights = Arrays.copyOf(weights, weights.length + 1);
            weights[weights.length - 1] = dino_weights;
        }
    }

    public static class Guest {
        public static String[] names_guest = {
                "Alice", "Bob", "Charlie", "Diana", "Ethan",
                "Fiona", "George", "Hannah", "Ian", "Julia"
        };
        public static int[] ages_of_guests = { 29, 34, 10, 42, 19, 25, 65, 14, 38, 31 };
        public static String[] ticket_types = {
                "Adult", "Adult", "Child", "VIP", "Student",
                "Adult", "Senior", "Child", "VIP", "Adult"
        };

        public static void addGuest(String guestName, int guestAge, String ticketType) {
            names_guest = Arrays.copyOf(names_guest, names_guest.length + 1);
            names_guest[names_guest.length - 1] = guestName;
            ages_of_guests = Arrays.copyOf(ages_of_guests, ages_of_guests.length + 1);
            ages_of_guests[ages_of_guests.length - 1] = guestAge;
            ticket_types = Arrays.copyOf(ticket_types, ticket_types.length + 1);
            ticket_types[ticket_types.length - 1] = ticketType;
        }

        public static void greetings() {
            int last = Guest.names_guest.length - 1;
            System.out.println("Welcome to Mesozoic Eden, " + Guest.names_guest[last] + "! Enjoy your " + Guest.ticket_types[last] + " access.");
        }
    }

    public static class Employee {
        public static String[] names = {
                "Liam", "Olivia", "Noah", "Emma", "Oliver",
                "Ava", "Elijah", "Sophia", "James", "Isabella"
        };
        public static String[] roles = {
                "Zookeeper", "Veterinarian", "Tour Guide", "Security", "Park Manager",
                "Zookeeper", "Paleontologist", "Ticket Clerk", "Maintenance", "Feeder"
        };
        public static double[] salaries = {
                45000.0, 85000.0, 38000.0, 42000.0, 95000.0,
                46000.0, 78000.0, 35000.0, 40000.0, 39000.0
        };

        public static void displayStaff() {
            for (int i = 0; i < names.length; i++) {
                System.out.println("%s - %s - %.2f".formatted(names[i], roles[i], salaries[i]));
            }
        }

        public static void addEmployee(String name, String role, double salary) {
            names = Arrays.copyOf(names, names.length + 1);
            names[names.length - 1] = name;
            roles = Arrays.copyOf(roles, roles.length + 1);
            roles[roles.length - 1] = role;
            salaries = Arrays.copyOf(salaries, salaries.length + 1);
            salaries[salaries.length - 1] = salary;
        }

        public static boolean removeEmployee(String name) {
            for (int i = 0; i < names.length; i++) {
                if (names[i].equalsIgnoreCase(name)) {
                    String[] newNames = new String[names.length - 1];
                    String[] newRoles = new String[roles.length - 1];
                    double[] newSalaries = new double[salaries.length - 1];
                    for (int j = 0, k = 0; j < names.length; j++) {
                        if (j != i) {
                            newNames[k] = names[j];
                            newRoles[k] = roles[j];
                            newSalaries[k] = salaries[j];
                            k++;
                        }
                    }
                    names = newNames;
                    roles = newRoles;
                    salaries = newSalaries;
                    return true;
                }
            }
            return false;
        }

        public static boolean checkParkHours() {
            LocalTime current_time = LocalTime.now();
            LocalTime start_time = LocalTime.of(9, 0);
            LocalTime end_time = LocalTime.of(19, 0);
            if (!current_time.isBefore(start_time) && current_time.isBefore(end_time)) {
                System.out.println("You can park at the zoo!");
                return true;
            } else {
                System.out.println("You cant park at the zoo,because you come at the unavaible time!");
                return false;
            }
        }

        public static void checkVisitorsCount() {
            System.out.println("the number of visitors:%d".formatted(Guest.ages_of_guests.length));
        }
    }
}