
class Abc{
        public static void main(String[] args) {
        int num = 6;

        int i = 1; // initialize
        while(i<=10){ // condition
            System.out.println(num + " x " + i + " = "+ (num*i));
            i++; // inc/dec
        }

        
    }

}

public class Table {
    public static void main(String arg) {
        System.out.println("simple");
    }
    public static void main(String... abvc) {
        int num = 4;

        for(int x=1;x<=5;x++){
            System.out.println(num + " x " + x + " = "+ (num*x));
        }

        main("Ramesh");
    }
}
