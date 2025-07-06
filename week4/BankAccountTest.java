class BankAccount {
    
    private String accountNumber ;
    private String accountHolderName ;
    private double balance ;
    
    //Constructor 
    public BankAccount(String accountNumber, String accountHolderName, double balance){
        
        //set accountNumber
        if (accountNumber.length() == 10){
            
            this.accountNumber = accountNumber;
        } else {
            
            throw new IllegalArgumentException("Account Number ไม่ถูกต้อง");
        }
        
        //เรียกใช้ setAccountHolderName
        setAccountHolderName(accountHolderName);
        
        //set balance
        if (balance >= 500){
            
            this.balance = balance;
        } else {
            
            throw new IllegalArgumentException("balance ไม่ถูกต้อง");
        }
            
    }
    
    //ฝากเงิน
    public void deposit(double amount){
        
        if (amount > 0.0){
            
            balance = balance + amount;
            
            System.out.printf("Deposited: %.1f %n", amount);
            
        } else {
            
            System.out.printf("%.2f can't be negative %n",amount);
        }
    }
    
    //ถอนเงิน
    public void withdraw(double amount){
        
        //มากกว่า 0 ไม่เกินเงินในบัญชี
        if (amount > 0.0 && balance >= amount){
            
            balance=balance-amount;
            
            System.out.printf("withdraw: %.1f %n", amount);
        //ถอนเกินเงินที่มี    
        }else if (amount > balance){
            System.out.println("balance is not enough");
        //ถอนเงินติดลบ
        }else {
            System.out.printf("%.2f can't be negative %n",amount);
        }
    }
    
    //ตรวจสอบเงินงเหลือ
    public void checkBalance(){
        
        System.out.printf("Current balance: %.1f %n",balance);
    }
    
    //get AccountNumber
    public String getAccountNumber(){
        
        return accountNumber;
    }
    
    //get AccountHolderName
    public String getAccountHolderName(){
        
        return accountHolderName;
    }
    
     //get Balance
    public double getBalance(){
        
        return balance;
    }
    
    //set accountHolderName
    public void setAccountHolderName(String accountHolderName){
        
       this.accountHolderName=accountHolderName;
    }
    
    @Override
    public String toString(){
        
         return String.format("___________________________%n%nAccount Number : %s %nAccount Holder : %s %nBalance : %.2f %n___________________________", accountNumber, accountHolderName, balance);
    }
    
}

//เทสโปรแกรม
public class BankAccountTest {


   public static void main(String[] args) {
       
       //ชุด 1
       try {
           BankAccount account = new BankAccount("0411200000", "Karina Bluu", 1000.0);
           account.checkBalance();
           account.deposit(500.0);
           account.checkBalance();
           account.withdraw(200.0);
           account.checkBalance();
           account.withdraw(2000.0);  // Should print an error message
           account.checkBalance();


           // Testing setter and getter
           account.setAccountHolderName("Yu Jimin");
           System.out.println("Account Holder Name: " + account.getAccountHolderName());
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }

       //ชุด2
       try {
           BankAccount invalidAccount = new BankAccount("12345", "Invalid Account", 400.0);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
       
       //ชุด 3
       try {
           System.out.println("ทดสอบชุดที่ 3");
           BankAccount soda = new BankAccount("6752300542", "Sanucha Sondech", 1000.0);
           soda.checkBalance();
           soda.deposit(-200);
           soda.checkBalance();
           soda.deposit(500);
           soda.checkBalance();
           soda.withdraw(100000);
           soda.checkBalance();
           soda.withdraw(-1000);
           soda.checkBalance();
           soda.withdraw(500);
           soda.checkBalance();
           System.out.println(soda.toString());
           
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
       
       //ชุด 4
       try {
           System.out.println("ทดสอบชุดที่ 4");
           BankAccount soda = new BankAccount("6752300542", "Sanucha Sondech", 100);
           soda.checkBalance();
           soda.deposit(-200);
           soda.checkBalance();
           soda.deposit(500);
           soda.checkBalance();
           soda.withdraw(100000);
           soda.checkBalance();
           soda.withdraw(-1000);
           soda.checkBalance();
           soda.withdraw(500);
           soda.checkBalance();
           
           
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
   }
}

