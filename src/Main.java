class Person{
    String name;
    int age;

    public Person(){}

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("이종근", 26);
        Person p2 = new Person();

        System.out.println(p1.name + ", " + p1.age);
    }
}