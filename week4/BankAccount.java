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