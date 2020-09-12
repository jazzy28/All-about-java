//Substitute of Multiple inheritance in java = interface
//interface: similar to abstract (earlier)
//using default keyword: we can define a method inside interface

public interface Teacher{
    void teach(); //no body
    void study();
}

public interface Student{
    void play();
    default void study(){
        System.out.println("hello"); //implementation
    }
}

public class TA implements Student, Teacher{
    @Override
    void play(){ //definition 
        
    }
    
    @Override
    void study(){ //definition 
        
    }
    
    @Override
    void teacher(){ //definition 
        
    }
}
