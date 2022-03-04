public class Dog {



// This is done by composition!!!


    private String name;
    private double height;
    private double weight;

    public Dog(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight; 
    }

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void speak() {
        System.out.println("woof!");
    }


} // end class
