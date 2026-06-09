public class DigitalRoot {
    public static void main(String[] args) {
        int num = 438;
        int sum = 0;
        while (num > 0) {
            int last_digit = num % 10;
            num = num / 10;
            sum = sum + last_digit;

            if (num == 0 && sum >= 10) {
                num = sum;
                sum = 0;
            }
        }
        System.out.println(sum);

    }

    public static void main2(String[] args) {
        int num = 438;
        int sum = 0;
        while (num > 0) {
            while (num > 0) {
                int last_digit = num % 10;
                num = num / 10;
                sum = sum + last_digit;

            }
            if (sum >= 10) {
                num = sum;
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}
