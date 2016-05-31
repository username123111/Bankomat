import java.util.Scanner;

/**
 * Created by Valera on 31.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Accaunt accaunt = new Accaunt(1000, 123);
        Client client = new Client(accaunt,123);
        if (client.getPin() == accaunt.getPin()) {
            Thread t = new Thread(new Client(accaunt, 123));
            Thread t1 = new Thread(new Client(accaunt, 123));
            t.start();
            t1.start();
        }
        else {
            System.out.println("Вы ввели не правельный pin код");
        }
    }
}