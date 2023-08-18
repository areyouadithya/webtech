import java.util.Scanner;
import java.lang.Math;

public class squares{
    int num1, num2, num3;
    double prod;

    public void product(){
        this.prod = Math.pow((this.num1*this.num2*this.num3),2);
    }

    public static void main(String[] args){
        Scanner ip  = new Scanner(System.in);
        squares obj1 = new squares();
        
        int[] inputs = {0,0,0};

        for(int i=1;i<=3;i++){
            System.out.print("Enter number "+i+": ");
            inputs[i-1]=ip.nextInt();
        }

        obj1.num1=inputs[0];
        obj1.num2=inputs[1];
        obj1.num3=inputs[2];

        obj1.product();

        System.out.println("Squares of Product of Numbers: "+obj1.prod);
        System.out.println("Square of Number 1: "+obj1.num1*obj1.num1);
        System.out.println("Square of Number 2: "+obj1.num2*obj1.num2);
        System.out.println("Square of Number 3: "+obj1.num3*obj1.num3);

    }

}