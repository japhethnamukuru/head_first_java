package demo;

public class Dog implements IntAnimal {

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Dog() {
        super();
    }

    public String sayHello(String name) {
        return " woof " + name;

    }

    public String Run() {
        return "I am now running fast";
    }

    public static void main(String[] args) {
//        Cat myCat = new Cat();
        
//        TODO create a Cat class
        
        
        Dog MyDog = new Dog();


        for (int i = 0; i < 2; i++) {
            System.out.println(i + MyDog.sayHello("Jeff"));
        }

        System.out.println(MyDog.Run());
        System.out.println("Hello world");

    }
}
