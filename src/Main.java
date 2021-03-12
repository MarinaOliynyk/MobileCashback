import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Текущий баланс:" + startBalance);
        System.out.println("Сумма платежа:");

        int paymentAmount = scanner.nextInt();
        int bonus;
        if (paymentAmount >= 1000) {
            bonus = paymentAmount / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = (startBalance + paymentAmount + bonus);

        System.out.println("Ваш баланс: " + totalBalance + " руб. ");
        System.out.println("Бонусы: " + bonus + " руб.");

    }
}