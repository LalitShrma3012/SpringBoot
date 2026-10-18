public class WrapperClasses {
    public static void main(String[] args) {
        // int num = 10;
        // // It is a primitive and created into stack memory.

        // Integer obj = num;
        // // Wrapper classes are special classes in Java which helps us to use primitives as objects. 
        // // It wraps ups the primitive into an object which is further used in various cncepts such as Collection, Generics, Frameworks, etc.
        
        // Byte o1 = 12;
        // Short o2 = 183;
        // Long o3 = 109002239494L;
        // Float o4 = 12.332f;
        // Double o5 = 1232323.33;
        // Character o6 = 'A';
        // Boolean flag = true;
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping "+a+" "+b);
        swap(a, b);
        System.out.println("After Swapping "+a+" "+b);

        Integer o1 = 10;
        Integer o2 = 20;
        System.out.println("Before Swapping "+o1+" "+o2);
        swap(o1, o2);
        System.out.println("After Swapping "+o1+" "+o2); 

        // Java is strictly call by value. 
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
