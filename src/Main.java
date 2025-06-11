public class Main {
    public static void main(String[] args) {
        String name = "Son";
        Integer backNumber = 7;         // int -> Integer (박싱)
        int num = 1;

        int sum = num + backNumber;     // Integer -> (언박싱)

        System.out.println(backNumber + num);
        System.out.println(((Object) sum).getClass().getName());
        System.out.println((name + backNumber).getClass().getName());
        System.out.println((backNumber).getClass().getName());
    }
}