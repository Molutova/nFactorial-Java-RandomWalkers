public class RandomWalker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;

        System.out.println("(0, 0)");


        for (int i = 0; i < n; i++) {
            double randomNum = Math.random();
            if (randomNum < 0.25) {
                x++;
            } else if (randomNum < 0.5) {
                x--;
            } else if (randomNum < 0.75) {
                y++;
            } else if (randomNum < 1) {
                y--;
            }
            System.out.println( "(" + x + ", " + y + ")");
        }

        int squaredDistance = x * x + y * y; // использовала int потому что остается остаток везде .0, хотела чтобы было без остатка
        System.out.println("squared distance: " + squaredDistance);



    }
}



