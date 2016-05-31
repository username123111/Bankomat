
/**
 * Created by Valera on 31.05.2016.
 */
public class Accaunt {
    private double balance;
    private int pin;

    Accaunt(double balance, int pin) {
        this.balance = balance;
        this.pin=pin;
    }
    Accaunt(){}
        //получить баланс
        public double getBalance() {
            System.out.println("Ваш баланс: " + balance);
            return balance;
        }

        //добавить деньги
        public synchronized void deposit(double money) {
            balance = balance + money;
            System.out.println("Пополнение прошло успешно. Вы положили: "+money);
        }

        // снять деньги
        public synchronized void withdraw(int money) {
            balance = balance - money;
            System.out.println("Снятие прошло успешно. Вы сняли: "+money);
        }
    public synchronized int getPin() {
        return pin;
    }
}
