import java.util.Scanner;
import java.lang.Math;

public class user{
    String city;
    String country;
    long pincode;
    
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        user userobj = new user();

        System.out.print("Enter your City: ");
        String x = ip.nextLine();

        userobj.city = x;

        System.out.print("Enter your Country: ");
        String y = ip.nextLine();

        userobj.country = y;

        userobj.pincode = Math.round(Math.random()*100);

        System.out.println(userobj.country.substring(0,2).toUpperCase()+", "+userobj.city+", "+userobj.pincode);

    }
}