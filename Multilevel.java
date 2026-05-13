class GrandFather{
    void land(){
        System.out.println("GrandFather has land");
    }
}
class Father extends GrandFather{
    void bike(){
        System.out.println("Father has bike");
    }
}
class Son extends Father{
    void laptop(){
        System.out.println("Son has laptop");
    }
}
public class Multilevel{
    public static void main(String[] args){
        Son s=new Son();
        s.land();
        s.bike();
        s.laptop();
    }
}