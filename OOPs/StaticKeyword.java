class Student{

    static int count; // count is static and belongs to the class and will store the number of student objects has been created.
    int rollNo;
    String name;
    float marks;

    static{
        count = 0;
        System.out.println("Static block gets executed!!!");
    }

    Student (int rollNo, String name, float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        count++;
        System.out.println("Object " + count + " has been created!");
    }

    static void showCount(){
        System.out.println("Number of students - " + count);
    }
}

public class StaticKeyword{

    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul", 76.5f);
        Student s2 = new Student(102, "Shlok", 86.5f);
        System.out.println(Student.count);
        Student.showCount();
        // System.out.println(s1.count);
        // System.out.println(s2.count);
    }
}