//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int balance = 18;
        int add = 1220;
        int sum = balance + add;

        System.out.println("Ваш баланс - " + sum + " рублей");

        int bonus = add / 100;
        if (add < 1000) {
            System.out.println("Бонусы не получены");
        } else {
            System.out.println("Начисленный бонус: " + bonus + " рублей ");

        }
    }
}