class Car{

    private int engineNo;
    private String engineName;
    private int capacity;

    public void setEngineNo(int engineNo){
        this.engineNo = engineNo;
    }

    public int getEngineNo(){
        return this.engineNo;
    }

    public void setEngineName(String engineName){
        this.engineName = engineName;
    }

    public String getEngineName(){
        return this.engineName;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }


    public void startEngine(){
        System.out.println("Engine get started!!!!");
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setEngineNo(1212321);
        c1.setEngineName("V12 6 Cylinder");
        c1.setCapacity(2);
    }
}


// We can validate data in setters before setting them up. It ensures data consistency.