public class Armstrong_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {

            int num = i;
            int count = 0;
            int copy = num;
            int sum = 0;

            while (num > 0) {
                num = num / 10;
                count++;
            }

            num = copy;

            while (num > 0) {
                int last_digit = num % 10;

                // int power = 1;
                // for(int i=0;i<count;i++){
                // // power = power * (num%10);
                // power = power * last_digit;
                // }
                // sum = sum + power;

                int power = (int) Math.pow(last_digit, count);
                sum = sum + power;

                num = num / 10;
            }
            num = copy;

            if (sum == num) {
                System.out.println(num + " is Armstrong.");
            } 
        }
    }
}
