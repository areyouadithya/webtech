import java.lang.Math;
import java.util.Random;

public class phone{
    public static void main(String[] args){
        Random rand = new Random();
    
        int temp, ph1, ph2, ph3;
        
        int dig1, dig10, dig100;
        boolean eightnine=true;

        ph1=0;

        while(eightnine){
            ph1 = rand.nextInt(1000);
            System.out.println(ph1);
            temp = ph1;
            dig1 = temp%10;
            System.out.println(dig1);
            if(dig1==8){
                continue;
            }
            else if(dig1==9){
                continue;
            }
            else{
                temp /= 10;
                dig10 = temp%10;
                System.out.println(dig10);
                if(dig10==8){
                    continue;
                }
                else if(dig10==9){
                    continue;
                }
                else{
                    temp /= 10;
                    dig100 = temp;
                    System.out.println(dig100);
                    if(dig100==8){
                        continue;
                    }
                    else if(dig100==9){
                        continue;
                    }
                    else if(dig100==0){
                        continue;
                    }
                    else{
                        eightnine=false;
                    }
                }
            }
        };


        System.out.println(ph1);

        ph2 = rand.nextInt(655);

    }
}