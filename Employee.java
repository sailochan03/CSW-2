import java.util.Scanner;
import java.util.LinkedHashMap;

public class Employee {
    private String name;
    private int emCode;
    private int workEx;
    private int salary;

    static LinkedHashMap<Integer, Employee> employeeMap = new LinkedHashMap<>();

    public Employee(String name, int emCode, int workEx, int salary) {
        this.name = name;
        this.emCode = emCode;
        this.workEx = workEx;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmCode(int emCode) {
        this.emCode = emCode;
    }

    public int getEmCode() {
        return emCode;
    }

    public void setWorkEx(int workEx) {
        this.workEx = workEx;
    }

    public int getWorkEx() {
        return workEx;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public static void enterDetails() {
        Scanner scan = new Scanner(System.in);

        System.out.println("----- ENTER NEW EMPLOYEE DETAILS -----");

        System.out.print("Enter employee name: ");
        String name = scan.nextLine();

        System.out.print("Enter employee code: ");
        int code = scan.nextInt();

        System.out.print("Enter work experience in months: ");
        int workEx = scan.nextInt();

        System.out.print("Enter salary: ");
        int salary = scan.nextInt();

        Employee e = new Employee(name, code, workEx, salary);

        employeeMap.put(code, e);

        System.out.println("NEW EMPLOYEE ADDED !!!");
        System.out.println();
    }

    public static void displayEmployee() {
        System.out.println("DISPLAYING EMPLOYEE DETAILS: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter employee code: ");
        int id = scan.nextInt();

        System.out.println("NAME: " + employeeMap.get(id).getName());
        System.out.println("Employee CODE: " + employeeMap.get(id).getEmCode());
        System.out.println("WORK EXPERIENCE: " + employeeMap.get(id).getWorkEx() + " months");
        System.out.println("SALARY: " + employeeMap.get(id).getSalary());
        System.out.println();

    }

    public static void makeEmployeePermanent() {
        System.out.println("----- MAKING EMPLOYEE PERMANENT -----");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter employee code: ");
        int id = scan.nextInt();

        System.out.println(employeeMap.get(id).getName() + " is now a Permanent employee!!!");
        System.out.println("New salary: " + employeeMap.get(id).getSalary() * 2);
        employeeMap.get(id).setSalary(employeeMap.get(id).getSalary() * 2);
        System.out.println();
    }

    public static void displayAllEmployees() {
        System.out.println("----- DISPLAYING ALL EMPLOYEE'S DATA -----");

        for (int k : employeeMap.keySet()) {
            int count = 1;
            System.out.print("----- EMPLOYEE " + count++ + " -----");
            System.out.println("NAME: " + employeeMap.get(k).getName());
            System.out.println("Employee CODE: " + employeeMap.get(k).getEmCode());
            System.out.println("WORK EXPERIENCE: " + employeeMap.get(k).getWorkEx() + " months");
            System.out.println("SALARY: " + employeeMap.get(k).getSalary());
        }
    }

    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.println("----- EMPLOYEE DATABASE -----");
            System.out.println();
            System.out.println("Select an operation: ");
            System.out.println("1. Add an Employee");
            System.out.println("2. Show Employee details");
            System.out.println("3. Make employee permanent");
            System.out.println("4. Show all Employee data");
            System.out.println("5. EXIT database");
            int i = scan.nextInt();

            switch (i) {
                case 1:
                    enterDetails();
                    break;
                case 2:
                    displayEmployee();
                    break;
                case 3:
                    enterDetails();
                    break;
                case 4:
                    enterDetails();
                    break;
                case 5:
                    System.out.println("----- THANK YOU -----");
                    return;
                default:
                    System.out.println("Please Choose from given choices");
                    break;

            }
        }
    }
}
