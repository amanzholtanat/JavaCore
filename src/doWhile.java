import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.println("Type in the number 5");
            number = scanner.nextInt();
        }while(number!=5);
        System.out.println("You have typed in the right number");
    }
}
