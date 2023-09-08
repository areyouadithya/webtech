public class q714 {
    public static int product(int... list) {
       System.out.println("Number of arguments are: " + list.length);
       int prod=1;
       for (int i : list){
            prod*=i;
       }
       return prod;
    }

    public static void main(String args[]) {
        System.out.println("The product of 5,10 and 15 is "+product(5,10,15));
        System.out.println("The product of 2 is "+product(2));
        System.out.println("The product of 50,40 and 60 is "+product(50,40,60));
    }
 }
 