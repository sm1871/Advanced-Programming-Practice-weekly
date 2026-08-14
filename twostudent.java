class twostudent {
    String name;
    int age;
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
   public static void main(String[] args) {
        twostudent s1 = new twostudent();
        twostudent s2 = new twostudent();
        s1.name = "Akash";
        s1.age = 19;
        s2.name = "suhas";
        s2.age = 20;
        s1.display();
        System.out.println();
        s2.display();
    }
}