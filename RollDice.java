public class RollDice {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int [] sides = new int[51];


        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int k = 0; k < 10; k++){
                int r = (int)(Math.random() * 6) + 1;
                sum = sum + r;
            }
            sides[sum - 10]++;
        }

        for (int i = 0; i < sides.length; i++){
            System.out.printf("%2d : ", i + 10);  //форматирование
            for (int t = 0; t < sides [i]; t++){
                System.out.print("*");
            }
            System.out.println();
        }

        }

    }




