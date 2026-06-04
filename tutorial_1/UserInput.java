
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Dum dum diga diga");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scanner.next());
        int age2 = scanner.nextInt();
        System.out.println("Your age is - "+scanner.next());

        int price1 = scanner.nextInt();
        int price2 = 12;
        scanner.close();
    }
}
