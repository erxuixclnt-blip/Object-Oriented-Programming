package com.mycompany.collegelist;
import java.util.Scanner;

public class CollegeList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        char choice = Character.toUpperCase(input.nextLine().charAt(0));

        if (choice == 'E') {
            Employee emp = new Employee();

            System.out.println("Type employee's name, contact number, salary, and department.");
            System.out.println("Press Enter after every input.");
            emp.setName(input.nextLine());
            emp.setContactNum(input.nextLine());
            emp.setSalary(Double.parseDouble(input.nextLine()));
            emp.setDepartment(input.nextLine());

            System.out.println("-----------------------------");
            System.out.println("Name: " + emp.getName());
            System.out.println("Contact Number: " + emp.getContactNum());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Department: " + emp.getDepartment());

        } else if (choice == 'F') {
            Faculty fac = new Faculty();

            System.out.println("Type faculty's name, contact number, salary, and department.");
            System.out.println("Press Enter after every input.");
            fac.setName(input.nextLine());
            fac.setContactNum(input.nextLine());
            fac.setSalary(Double.parseDouble(input.nextLine()));
            fac.setDepartment(input.nextLine());

            System.out.print("Press Y if regular/tenured or N if not: ");
            char reg = Character.toUpperCase(input.nextLine().charAt(0));
            fac.setStatus(reg == 'Y');

            System.out.println("-----------------------------");
            System.out.println("Name: " + fac.getName());
            System.out.println("Contact Number: " + fac.getContactNum());
            System.out.println("Salary: " + fac.getSalary());
            System.out.println("Department: " + fac.getDepartment());
            System.out.println("Status: " + (fac.isRegular() ? "Regular" : "Not Regular"));

        } else if (choice == 'S') {
            Student stu = new Student();

            System.out.println("Type student's name, contact number, program, and year level (1 to 4).");
            System.out.println("Press Enter after every input.");
            stu.setName(input.nextLine());
            stu.setContactNum(input.nextLine());
            stu.setProgram(input.nextLine());
            stu.setYearLevel(input.nextLine());

            System.out.println("-----------------------------");
            System.out.println("Name: " + stu.getName());
            System.out.println("Contact Number: " + stu.getContactNum());
            System.out.println("Program: " + stu.getProgram());
            System.out.println("Year Level: " + stu.getYearLevel());

        } else {
            System.out.println("Invalid Input.");
        }
    }
}


class Person {

    private String name;

    private String contactNum;

    public void setName(String n) {

        name = n;

    }

    public String getName() {

        return name;

    }

    public void setContactNum(String c) {

        contactNum = c;

    }

    public String getContactNum() {

        return contactNum;

    }

}

class Employee extends Person {

    private double salary;

    private String department;

    public void setSalary(double s) {

        salary = s;

    }

    public double getSalary() {

        return salary;

    }

    public void setDepartment(String d) {

        department = d;

    }

    public String getDepartment() {

        return department;

    }

}

class Faculty extends Employee {

    boolean status;

    void setStatus(boolean s) {

        status = s;

    }

    boolean isRegular() {

        return status;

    }

}

class Employee extends Person {

    public double salary;

    private String department;

    public void setSalary(double s) {

        salary = s;

    }

    public double getSalary() {

        return salary;

    }

    public void setDepartment(String d) {

        department = d;

    }

    public String getDepartment() {

        return department;

    }

}

class Faculty extends Employee {

    boolean status;

    void setStatus(boolean s) {

        status = s;

    }

    boolean isRegular() {

        return status;

    }

}

class Student extends Person {

    private String program;

    private int yearLevel;

    public void setProgram(String p) {

        program = p;

    }

    public String getProgram() {

        return program;

    }

    public void setYearLevel(String y) {

        yearLevel = Integer.parseInt(y);

    }

    public int getYearLevel() {

        return yearLevel;

    }

}

