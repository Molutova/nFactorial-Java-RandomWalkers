public class Bits {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int num = 0;


        if (n > 0 ) {
            while (n > 0) {
                n = n / 2;
                num++;
            }
            System.out.println(num);
        }
        else
            System.out.println("Illegal Input");










    }
    }

