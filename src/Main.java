import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("돈을 넣어주세요.");
        int money = scanner.nextInt();

        while(true){
            System.out.println("---- 메뉴 선택 ----");
            System.out.println("1. 콜라   (1,200원)");
            System.out.println("2. 사이다  (1,200원)");
            System.out.println("3. 물     (800원)");
            System.out.println("4. 커피   (1,500원)");
            System.out.println("0. 자판기 종료");

            int choice = scanner.nextInt();
            String item = "";
            int price = 0;

            switch (choice){
                case 1:
                    item = "콜라";
                    price = 1200;
                    break;
                case 2:
                    item = "사이다";
                    price = 1200;
                    break;
                case 3:
                    item = "물";
                    price = 800;
                    break;
                case 4:
                    item = "커피";
                    price = 1500;
                    break;
                case 0:
                    System.out.println("자판기를 종료합니다. 남은 돈을 가져가주세요." + money);
                    return;
                    // 종료. 남은 돈 환불
                default:
                    System.out.println("정해진 메뉴 중에서 선택 해주세요");
                    break;
            }

            while(true){
                if (money < price){
                    System.out.println("금액이 부족합니다. 추가 투입 해주세요.");
                    int addMoney = scanner.nextInt();
                    money = money + addMoney;
                } else{
                    money -= price;
                    System.out.printf("%s이(가) 나왔습니다. 잔돈은 %d원 입니다.\n", item, money);
                    break;
                }
            }
        }

    }
}