package projeto.java.completo.primeirosexemplos.Account;

public class Account {

    private int number;
    private String holder;
    private Double balance = 0.0;



    public Account(int number, String holder, Double inicialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(inicialDeposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public int getNumber(){
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withDraw(Double amount){
        balance -= amount + 5;
    }

    @Override
    public String toString() {
        return "Acconunt " + getNumber() +
                " Holter: " + getHolder() +
                " Balance: " + String.format("%.2f",getBalance())
                ;
    }
}
