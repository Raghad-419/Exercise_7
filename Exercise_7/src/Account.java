public class Account {
    private String name ;
    private String id;
    private int balance =0;

    public Account(String id , String name){
        this.id =id;
        this.name=name;
    }

    public Account(String id , String name ,int balance){
        this.id =id;
        this.name=name;
        this.balance=balance;
    }

    public String getId(){
        return id ;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }

    public int credit(int amount){
        balance=balance+amount;
        System.out.println("Credit completed successfully");
        return balance;
    }

    public int debit(int amount){
        balance=balance-amount;
        System.out.println("Debit completed successfully");
        return balance;
    }

    public int transferTo(Account account ,int amount){
        this.balance=balance-amount;
        account.setBalance(account.balance+amount);
        System.out.println("Transferring completed successfully from account "+this.name+" To "+account.name);
        return account.getBalance();
    }

    public String  toString(){
        return "Account Name: "+this.name+"\nAccount ID: "+this.id+"\nAccount Balance: "+this.balance+"\n************************************";
    }

}
