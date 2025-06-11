public class Main {
    public static void main(String[] args) {
        // escape
        System.out.print("\"줄 바꿈\" \n");
        System.out.print("\"탭\" \t");
        System.out.print("\"역슬래시\" \\ ");
        System.out.print("\"안녕하세요?\"");


        System.out.println();

        // printf
        int age = 26;
        double pi = 3.141592;
        System.out.printf("나이 : %d, 원주율 : %.2f\n", age, pi);

        String name = "Son";
        int backNumber = 7;
        int winningCup = 1;
        System.out.printf("이름 : %s, 등번호 : %d, 우승 횟수 : %d", name, backNumber, winningCup);
    }
}