public class Switch{
    public static void main(String[] args){
        String signal="red";
        switch(signal){
            case"black":
        System.out.println("Stop");
        break;
        case"yellow":
        System.out.println("ready");
        break;
        case"green":
        System.out.println("go");
        break;
        default:
            System.out.println("Invalid Signal");


        }
    }
}