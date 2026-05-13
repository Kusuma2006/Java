class Vehicle{
    String color="Red";
    Vehicle(){
        System.out.println("vehicle constructor called");
    }
void display(){
    System.out.println("this is vehicle class");
}
}
class Car extends Vehicle{
    String color="Blue";
    Car(){
        super();
        System.out.println("car constructor called");
    }


void show(){
      System.out.println("parent color:"+super.color);
      super.display();
      
        System.out.println("child color:"+color);
}}
public class Super{
    public static void main(String[] args){
        Car c=new Car();
        c.show();
    }
}