class Car{

    int engineNo;
    String engineType;
    String compName;

    // A constructor with zero arguments is called default constructor, since it instantiate the default state of the object.
    // Car () {
    //     this.engineNo = 10001;  
    //     this.engineType = "4 Cylinder 1.6 diesel engine";
    //     this.compName = "Toyota";
    // }

    
    // By convention in Java, this is how we design constructor of a class.
    Car (int engineNo, String engineType, String compName){
        this.engineNo = engineNo;
        this.engineType = engineType;
        this.compName = compName;
    }


    // this is how you can call a constructor inside a constructor.
    Car(){
        // it will invoke the argument constructor 
        this(10001, "4 Cylinder 1.6 diesel engine", "Toyota");
    }

    public void carInfo(){
        System.out.println("Car engine number - " + engineNo);
        System.out.println("Car engine Type - " + engineType);
        System.out.println("Car company Name - " + compName);
    }

}

public class Constructor {
    public static void main(String[] args) {


        Car c1 = new Car(); // Car() --> invokes default constructor cause zero arguments has been passed.
        // c1.engineNo = 10001;
        // c1.engineType = "4 Cylinder 1.6 diesel engine";
        // c1.compName = "Toyota";
        c1.carInfo();


        Car c2 = new Car(10002, "V12 6 cylinder petrol engine", "Ferrari"); // --> invokes argument constructor cause three arguments has been passed.

        c2.carInfo();
    }
}
