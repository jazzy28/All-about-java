//class has state and behavior: data members and member functions
//types of constructor: default, parameterised, non-parameterised

//Vehicle.java
public class Vehicle
{
	public int wheels;
	
	public static void start(){
	    System.out.println("Start like general vehicle");
	}
	Vehicle(){ //non-parameterised constructor
	    this.wheels = 2;
	}
	Vehicle(int wheels){//parameterised constructor
	    this.wheels = wheels;
	}
}

//car.java
public class Car extends Vehicle{
    public static void main(String[] args){
        System.out.println(wheels);
        start(); //calling function of superclass
    }
    public int gate;
    
}

//Client.java
public class Client{
    Vehicle v1 = new Vehicle(4);
    Vehicle v2 = new Vehicle(); //2
    System.out.println(v1.wheels); //2 //as wheels is static, we can directly call
    System.out.println(v2.wheels); //4
}
