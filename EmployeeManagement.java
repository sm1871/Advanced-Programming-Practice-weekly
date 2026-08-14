import java.util.Scanner;

class Employee
{
    int id;
    String name;
    double monthlySalary;

    Employee(int id, String name, double monthlySalary)
    {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    void display()
    {
        double annualSalary = monthlySalary * 12;
        double bonus;
        String eligibility;

        if (monthlySalary >= 30000)
        {
            bonus = annualSalary * 0.10;
            eligibility = "Eligible";
        }
        else
        {
            bonus = 0;
            eligibility = "Not Eligible";
        }

        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Eligibility: " + eligibility);
        System.out.println();
    }
}

public class EmployeeManagement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Employee e[] = new Employee[5];

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter Employee " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Monthly Salary: ");
            double salary = sc.nextDouble();

            e[i] = new Employee(id, name, salary);
        }

        for (int i = 0; i < 5; i++)
        {
            e[i].display();
        }
    }
}