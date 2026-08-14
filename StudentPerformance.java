import java.util.Scanner;

class Student
{
    int roll;
    String name;
    int marks[] = new int[3];
    double attendance;

    Student(int roll, String name, int m1, int m2, int m3, double attendance)
    {
        this.roll = roll;
        this.name = name;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
        this.attendance = attendance;
    }

    double average()
    {
        int total = 0;

        for (int i = 0; i < 3; i++)
        {
            total = total + marks[i];
        }

        return total / 3.0;
    }

    void display()
    {
        double avg = average();

        String result = (avg >= 50) ? "Pass" : "Fail";

        String scholarship =
            (avg >= 75 && attendance >= 80) ? "Eligible" : "Not Eligible";

        String performance =
            (avg >= 85) ? "Excellent" : "Good";

        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Average: " + avg);
        System.out.println("Result: " + result);
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Performance: " + performance);
        System.out.println();
    }
}

public class StudentPerformance
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Student s[] = new Student[5];

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter Student " + (i + 1));

            System.out.print("Roll Number: ");
            int roll = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Mark 1: ");
            int m1 = sc.nextInt();

            System.out.print("Mark 2: ");
            int m2 = sc.nextInt();

            System.out.print("Mark 3: ");
            int m3 = sc.nextInt();

            System.out.print("Attendance: ");
            double attendance = sc.nextDouble();

            s[i] = new Student(roll, name, m1, m2, m3, attendance);
        }

        double highest = s[0].average();
        int position = 0;

        for (int i = 0; i < 5; i++)
        {
            s[i].display();

            if (s[i].average() > highest)
            {
                highest = s[i].average();
                position = i;
            }
        }

        System.out.println("Student with Highest Average:");
        System.out.println(s[position].name);
        System.out.println("Average: " + highest);
    }
}