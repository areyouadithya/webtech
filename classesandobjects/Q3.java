import java.util.Scanner;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        String ph = generateph();
        System.out.println("Random phone number: "+ph);

        public static string generateph(){
            Random random = new Random();
            int x1,x2,x3;
            x1=random.nextInt(8);
            x2=random.nextInt(8);
            x3=random.nextInt(8);
            int sec = random.nextInt(656);
            int last=random.nextInt(10000);
            return string.format("%01d%01%01d-%03d-%04d",x1,x2,x3,sec,last);
        }
    }
}

