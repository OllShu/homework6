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

        // задание 5

        for (int i=1904; i<=2096; i=i+4) {
            System.out.println(i+" год является високосным");
        }
        System.out.println("____________________________");
    }
}