//Vehicle.java
public class Vehicle
{
	private int wheels;
	
	public static void start(){
	    System.out.println("Start like general vehicle");
	}
	
	public void setWheels(int wheels){
	    this.wheels = wheels;//setting count of wheels
	}
	
	public void getWheels(){
	    return this.wheels; //getting count of wheels
	}
	
	Vehicle(){ 
	    this.wheels = 2;
	}
	
	Vehicle(int wheels){
	    this.wheels = wheels;
	}
	
	
}

//Client.java
public class Client{
    Vehicle v1 = new Vehicle(4);
    Vehicle v2 = new Vehicle(); //2
    System.out.println(v1.wheels); //2 //as wheels is static, we can directly call
    System.out.println(v2.wheels); //4
    
    v2.setWheels(3);
    ystem.out.println(v3.wheels);//accessing public function, consisting of private data member
    
}
