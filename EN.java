class Employee{
    String name;
    Employee(String n){
    name=n;

    }
    void display()
    {
        System.out.println(name);
    }
}
public class EN{
public static void main(String[] args){
    Employee e1=new Employee("Preetham");
    e1.display();
}
}