import java.util.Scanner;

public class ifConditionOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int thisYear = 2022;
        if(thisYear-year>=18){
            System.out.println("You are allowed to go in");
        }else{
            System.out.println("You are NOT allowed to go in");
        }
    }
}
