//Hostler.java
import java.util.*;

protected class Hostler{
    public static void main(String[] args){
        
        int money = 1000;
        
        public void part(){
            if(this.money >= 200){
            this.money -= 200;
                System.out.println("Party party party")
            } else{
                
                System.out.println("Beta paise lao");
            }
        }
        //Udhaar
        
        public void udhaar(Hostler dost){
            if(dost.money >= 500){
                dost.money -= 500;
                this.money += 500;
                //System.out.println();
            }
        }
    }
}

//Client.java
public class Client{
    public static void main(String[] args){
        Hostler ravi = new Hostler(); //ravi is an object
        Hostler mohit = new Hostler();
        
        System.out.println(ravi.money); //1000
        
        //did party twice
        ravi.party(); //1000-200 = 800
        ravi.party(); //800-200 = 600
        ravi.party(); //600-200 = 400
        ravi.party(); //400-200 = 200
        ravi.party(); //200-200; beta paise lao
        
        ravi.udhaar(mohit);
        
        ravi.party();
        ravi.party();
        
        ravi.udhaar(mohit);
        
        ravi.party();
        ravi.party();
        
        System.out.println(ravi.money); //400
        System.out.println(mohit.money); //0
        
    }
}
