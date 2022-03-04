public class Cho {

	//this is done by composition!!
	
	
    private Dog myDog;

    public Cho(String name, double height, double weight) {
        myDog = new Dog(name,height,weight);
    }

    public void sua() {
        myDog.speak();
    }
}
