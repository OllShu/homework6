public class Main {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++) {
            System.out.println("Число "+i);
        }
        System.out.println("____________________________");

        // задание 2

        for (int i=10; i>=0; i--) {
            System.out.println("Число "+i);
        }
        System.out.println("____________________________");

        // задание 3

        for (int i=0; i<=17; i=i+2) {
            System.out.println("Четное число "+i);
        }
        System.out.println("____________________________");

        // задание 4

        for (int i=10; i>=-10; i--) {
            System.out.println("Число "+i);
        }
        System.out.println("____________________________");

        // задание 1 домашки-2 по циклам

        for (int i=1904; i<=2096; i=i+4) {
            System.out.println(i+" год является високосным");
        }
        System.out.println("____________________________");

        // задание 2 домашки-2 по циклам

        for (int i=7; i<=98; i=i+7) {
            System.out.println("число последовательности "+i);
        }
        System.out.println("____________________________");

        // задание 3 домашки-2 по циклам

        for (int i=1; i<=512; i=i*2) {
            System.out.println("число последовательности "+i);
        }
        System.out.println("____________________________");

        // задание 1 домашки-3 по циклам

        int supplement = 29000;
        int capital = 0;
        for (int i=1; i<=12; i++) {
            capital = capital + supplement;
            System.out.println("Месяц "+i+ " сумма накоплений равна "+capital+" рублей");
        }
        System.out.println("____________________________");
    }
}