

public class Bankacc {
        
              int accno=98483372;
              double balance=10000;
             public void deposit(int amount){
                 balance=balance+amount;
                 System.out.println("deposit"+amount);
            }
            public void withdraw(int amount){
                if(amount<=balance){
                    balance=balance-amount;
                    System.out.println("withdraw"+amount);
                }
                else{
                    System.out.println("insufficient balance");
                }
              
            }
            public void checkbalance() {
                System.out.println("balance"+balance);
              }

              public static void main(String[] args) {
                  Bankacc acc=new Bankacc();
                  acc.deposit(2000);
                  acc.withdraw(500);
                  acc.checkbalance();
              }

              }
              
          

