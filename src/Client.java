/**
 * Created by Valera on 31.05.2016.
 */
public class Client implements Runnable {
    private int pin;
    public Client(Accaunt accaunt,int pin){
        this.acc=accaunt;
        this.pin=pin;
    }
    public int getPin(){return pin;}
    Accaunt acc = new Accaunt();
    @Override
    public void run() {

            acc.getBalance();
           acc.deposit(100);
            acc.getBalance();
           acc.withdraw(300);
            acc.getBalance();
            acc.deposit(100);
            acc.getBalance();
    }
}
