public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 11;
        String result = "";
        while(decimal>0){
            int remainder = decimal%2;
            decimal = decimal / 2;
            result = remainder + result;
        }
        System.out.println(result);
    }
}
