/*
    Count digits

    each digit power count and sum

    compare with original number
    if same - armstrong
*/
public class Armstrong {

    public static void main(String[] args) {
        int num = 153;
        int count = 0;
        int copy = num;
        int sum = 0;

        while(num>0){
            num = num / 10;
            count++;
        }
        
        num = copy;

        while(num>0){
            int last_digit = num % 10;
            
            // int power = 1;
            // for(int i=0;i<count;i++){
            //     // power = power * (num%10);
            //     power = power * last_digit;
            // }
            // sum = sum + power;

            int power = (int)Math.pow(last_digit, count);
            sum = sum + power;
            
            num = num / 10;
        }
        num = copy;

        if(sum==num){
            System.out.println(num+ " is Armstrong.");
        }else{
            System.out.println(num+" is not armstrong");
            System.out.println(sum);
        }
    }    
}
