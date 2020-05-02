public class AccountManager{

    public static void main (String[]args){
        
        //Create an account//
        Account acc1 = new Account();
        acc1.deposit(700);
          
        //Create a second Account//
        Account acc2 = new Account();
        acc2.deposit(900);

        System.out.println("Acc1 has a balance of:" + acc1.getBalance());
        System.out.println("Acc2 has a balance of:" + acc2.getBalance());

        
        
        
        
        
        
        
    }
}

