
//Animal.java
public class Animal{
 public void sound(){
    System.out.println("wee wee");
 }
}
 //Dog.java
 public class Dog extends Animal{
     public void sound(){ //declaration should be same as parent class, acess modifier can be same
        System.out.println("Bark");;
     }
 }

public class Client{
    Animal a = new Animal();
    a.sound();//wee wee
    Dog d = new Dog;
    d.sound();//Bark
    
    //Dog d = new Animal();  -> can't be written, as parent class reference can't be assigned to child, Animal can't be assigned to child
    Animal a = new Dog(); //parent class reference and child class object
    
    a.sound();// Bark -> runtime polymorphism
    
    /*
    List of methods available is of the reference class (parent) and implementation will be of object class(child)
    */
}
