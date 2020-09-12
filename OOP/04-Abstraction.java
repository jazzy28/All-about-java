//Animal.java

public abstract class Animal{
    public void birth(){
        System.out.println();
    }
	public abstract void sound();
}

//Dog.java
//either give name this class as abstract, if do not want to mention about sound() or give sound method an implementation
public class Dog extends Animal{
@Override
public void sound(){
    System.out.println("Bark");
    }
}
