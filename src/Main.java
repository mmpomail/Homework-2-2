//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int bonus; // начисляемый бонус
        int balance = 100; //исходный баланс счёта
        int add = 1100; // сумма пополнения счёта
        if (add < 1000){
            bonus = 0;
            System.out.println("Бонусы не получены");
        } else {
            bonus = add/100;
            System.out.println("Начисленный бонус: " + bonus + " рублей ");
        }

        int sum = balance + add + bonus; // баланс счёта после пополнения и добавления бонуса.

        System.out.println("Ваш баланс - " + sum + " рублей"); // отображение текущего баланса после пополнения

    }
}