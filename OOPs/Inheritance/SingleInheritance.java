package Inheritance;


class Animal{
    boolean isWild;  // by default boolean value in object is false.

    Animal(boolean isWild){
        this.isWild = isWild;
    }

    public void sleep(){
        System.out.println("Sleeping!!!");
    }

    public void eat(){
        if(isWild){
            System.out.println("Non Vegetarian and Dangerous!!");
        }else{
            System.out.println("Vegetarian and Sweet");
        }
    }
}

class Dog extends Animal{

    String color;
    String breed;
    float tailLength;

    Dog(boolean isWild, String color, String breed, float tailLength){
        super(isWild);
        this.color = color;
        this.breed = breed;
        this.tailLength = tailLength;
    }

}

public class SingleInheritance {
    public static void main(String[] args) {

        // These objects without assigning reference to any reference variable is called anonymous obejcts.
        new Animal(true).eat();
        new Dog(false, "Brown", "Bulldog", 23.3f).eat();
    }
}
