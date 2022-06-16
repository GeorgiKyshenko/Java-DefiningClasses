package _02_CompanyRoster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeCount = Integer.parseInt(scanner.nextLine());
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < employeeCount; i++) {
            String[] employeeInfo = scanner.nextLine().split("\\s+");

            String name = employeeInfo[0];
            double salary = Double.parseDouble(employeeInfo[1]);
            String position = employeeInfo[2];
            String department = employeeInfo[3];

            Employee employee = null;

            switch (employeeInfo.length) {
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 6:
                    String email = employeeInfo[4];
                    int age = Integer.parseInt(employeeInfo[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    break;
                case 5:
                    if(employeeInfo[4].matches("\\d+")) {
                        int personAge = Integer.parseInt(employeeInfo[4]);
                        employee = new Employee(name,salary,position,department,personAge);
                    } else {
                        String personEmail = employeeInfo[4];
                        employee= new Employee(name,salary,position,department,personEmail);
                    }
                    break;
            }
            employees.add(employee);
        }
        System.out.println();
    }
}
