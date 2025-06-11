class Car{
    String brand;
    int year;
    String model;
    String color = "";

    public Car(String brand, int year, String model){
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    public Car(String brand, int year, String model, String color){
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.color = color;
    }

    void displayInfo(){
        String colorPrint = this.color.isEmpty() ? "" : this.color + "색상이 이쁩니다.";

        System.out.println(
                brand + "사의 " + year + "년식 " + model + "입니다. "
                        + colorPrint);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("hyundai", 2025, "genesis g90",  "Black");
        car1.displayInfo();
        Car car2 = new Car("hyundai", 2025, "genesis gv80");
        car2.displayInfo();
    }
}