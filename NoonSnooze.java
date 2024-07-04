public class NoonSnooze {
    public static void main(String[] args) {
       int num = Math.abs(Integer.parseInt(args[0])); // если num будет негативное число

            int hour =num / 60;
            int minutes = num % 60;

            int hInitial = 12;
            int mInitial = 00;

            int hourSum = hInitial + hour;
            int minSum = mInitial + minutes;

            String ampm;
            if(hourSum % 24 < 12)
                ampm="pm";
            else
                ampm="am";

            hourSum = hourSum % 12;
            if (hourSum == 00)
                hourSum = 12;

            String currentTime = hourSum + ":" + minSum  + "" +  ampm;

            System.out.println(currentTime);
        }
    }

