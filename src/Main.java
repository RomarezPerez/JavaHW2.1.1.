import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в калькулятор бонусных миль!");
        Scanner console = new Scanner(System.in);
        System.out.println("Введите стоимость покупки:");
        int price = console.nextInt();
        int miles = price / 20;

        System.out.println(miles + " миль подарим Вам на бонусный счет после покупки.");
    }
}