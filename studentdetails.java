class Student {
    String name;
    int rollNo;
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
        public static void main(String[] args) {
        Student s = new Student();
        s.name = "suhas";
        s.rollNo = 34;
        s.display();
    }
}