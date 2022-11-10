import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 7 :
                System.out.println("Вы ученик 1 класса");
                break;
            case 10 :
                System.out.println("Вы ученик 5 класса");
                break;
            case 15 :
                System.out.println("Вы ученик 9 класса");
                break;
            case 18 :
                System.out.println("Вы студент");
                break;
            default :
                System.out.println("Вы не подходите ни под одно условие");
        }
    }
}
