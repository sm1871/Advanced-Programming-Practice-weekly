import java.util.Scanner;

class PatientDetails
{
    String name;
    double fee;

    PatientDetails(String name, double fee)
    {
        this.name = name;
        this.fee = fee;
    }

    double calculateFinal(double fee)
    {
        double discount;

        if (fee >= 2000)
        {
            discount = fee * 0.10;
        }
        else
        {
            discount = fee * 0.05;
        }

        return fee - discount;
    }

    void display()
    {
        double finalAmount = calculateFinal(fee);
        double discount = fee - finalAmount;

        System.out.println("Patient Name: " + name);
        System.out.println("Original Fee: " + fee);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
        System.out.println();
    }
}

public class Patient
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        PatientDetails p[] = new PatientDetails[5];

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter Patient " + (i + 1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Consultation Fee: ");
            double fee = sc.nextDouble();

            p[i] = new PatientDetails(name, fee);
        }

        for (int i = 0; i < 5; i++)
        {
            p[i].display();
        }

        sc.close();
    }
}