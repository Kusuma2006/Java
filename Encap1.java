class ATM{
    //Private Data
    private int balance=5000;
    //Setter Method
    public void deposit(int amount){
        if(amount>0){
        balance=balance+amount;
        System.out.println("Amoount deposited successfully");
    }
    else{
        System.out.println("Invalid amount");
    }
    }
    public int getbalance(){
        return balance;
    }
}
public class Encap1{
    public static void main(String[] args){
        ATM obj=new ATM();
        obj.deposit(-100);
            System.out.println("balance is:"+obj.getbalance());
        
    }    
}
