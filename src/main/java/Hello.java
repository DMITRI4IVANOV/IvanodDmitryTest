import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Составьте алгоритм: если введенное число больше 7 , то вывести \"Привет\".\nПожалуйста введите число: ");
        int number = sc.nextInt();

        while (number <= 7) {
            System.out.println("Пожалуйста введите число: ");
            number = sc.nextInt();
        }
        System.out.println("Привет!");

    }
}
