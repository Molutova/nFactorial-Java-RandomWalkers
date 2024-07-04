public class RandomWalkers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double totalSquaredDistance = 0.0;

        for (int i = 0; i < trials; i++) {
           int x = 0;
           int y = 0;

            for (int a = 0; a < n; a++) {
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
            }
            double sum = x * x + y * y;
            totalSquaredDistance += sum;
        }
        double distance = totalSquaredDistance / trials;
        System.out.println("mean squared distance: " + distance);
    }
}
