import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            double result = 0;
            boolean valid = true;

            System.out.println("=====계산기=====");

            System.out.print("첫 번째 피연산자 입력 : ");
            double operand1 = scanner.nextDouble();

            System.out.print("두 번째 피연산자 입력 : ");
            double operand2 = scanner.nextDouble();

            System.out.print("연산자 입력 : ");
            char operator = scanner.next().charAt(0);

            System.out.println();

            switch (operator){
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    // 0으로 나누지 않을 경우만 계산 수행
                    if (operand2 != 0){
                        result = operand1 / operand2;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("사칙연산 중에서 선택 해주세요");
                    valid = false;
                    break;
            }

            while(true){
                if (valid){
                    System.out.printf("결과는 %.2f입니다. \n다시 하려면 Y, 종료시 아무키나 입력해주세요.", result);
                } else System.out.println("다시 하려면 Y, 종료시 아무키나 입력해주세요.");

                char a = scanner.next().charAt(0);

                if(a == 'Y' || a == 'y'){
                    break;
                } else return;
            }
        }

    }
}