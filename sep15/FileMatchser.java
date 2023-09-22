import java.io.*;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class FileMatchser {
    public static void main(String[] args) {
        ArrayList<Student> accounts = new ArrayList<>();

        try (Scanner oldMast = new Scanner(new File("oldmast.txt"));
             Scanner trans = new Scanner(new File("trans.txt"));
             Formatter newMast = new Formatter("newmast.txt");
             Formatter log = new Formatter("log.txt")) {

            while (oldMast.hasNext()) {
                try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("accounts.ser"))) {
                    outputStream.writeObject(accounts);
                    System.out.println("Data has been serialized and saved to accounts.ser");
                }catch (IOException e) {
                    e.printStackTrace();
                }
            
                int accountNumber = oldMast.nextInt();
                String firstName = oldMast.next();
                String lastName = oldMast.next();
                double balance = oldMast.nextDouble();

                while (trans.hasNext()) {
                    int transAccountNumber = trans.nextInt();
                    double amount = trans.nextDouble();

                    if (accountNumber == transAccountNumber) {
                     
                        balance += amount;
                    } else {
                     
                        log.format("Unmatched transaction record for account number %d%n", transAccountNumber);
                    }
                }

                newMast.format("%d %s %s %.2f%n", accountNumber, firstName, lastName, balance);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

