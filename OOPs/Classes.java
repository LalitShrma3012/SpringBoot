public class Classes{
    public static void main(String[] args) {
        /*
        // store 5 roll numbers
        int[] rollNumbers = new int[5];
        
        // store 5 Names
        String[] studentNames = new String[5];

        // data of 5 students : {rollNo, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // You have created 3 arrays for each of the details that's okay and works fine too.
        // Created some sort of data structure which consist of all these three properties.
        // This is where Classes and Objects comes in
        */

        // This is just creating a reference variable of type Student. These reference variables are created in stack memory and pointing to the null.
        Student students;

        // new operator - dynamically allocates memory in heap memory and returns the reference to reference variable.
        // When you create object of any class the term used for that is instantiated.
        students = new Student();
        System.out.println(students);

        // How to access variables of that object (dot operator)
        students.name = "Lalit";
        students.rollNo = 38;
        students.marks = 56.67f;

        System.out.println(students.name);
        System.out.println(students.marks);
        System.out.println(students.rollNo);

    
    }

    
}
// create a class for every single student
    class Student{
        int rollNo;
        String name;
        float marks;
    }