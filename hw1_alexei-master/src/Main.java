import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String hello;
        final int NUM = 13;
        String word = "Have a nice day!";
        hello = NUM + " " + word;
        System.out.println(hello);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM  > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }


        System.out.print("Введите ваше имя: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println ("Привет " + name + "!");
    }
}
