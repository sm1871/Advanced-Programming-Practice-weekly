class Employee {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
   public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "suhas1";
        e1.id = 1;
        e1.salary = 10000;

        e2.name = "suhas2";
        e2.id = 2;
        e2.salary = 20000;

        e1.display();
        System.out.println();

        e2.display();
    }
}