//Compile-time polymorphism, same name methods in a class with different arguments/parameters
//Compile-time polymorphism also called METHOD OVERLOADING

//Shape.java
public class Shape{
 public double area(int r){
    return 3.14*r*r;
 }
 public int area(int l, int b){
     return l*b;
 }

}
