import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String word = scanner.next();
        int Int = scanner.nextInt();
        double Double = scanner.nextDouble();
        char Char = scanner.next().charAt(0);   // n번째 단어

        System.out.println("이름 : " + name);
        System.out.println("단어 : " + word);
        System.out.println("정수 : " + Int);
        System.out.println("실수 : " + Double);
        System.out.println("문자 : " + Char);
    }
}