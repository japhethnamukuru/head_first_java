package demo;

public class CatDriver {
    public static void main(String [] args) {
        Cat cat = new Cat();
        
        cat.size = 20;
        cat.breed = "Russian";
        cat.name = "Jane";
        
        System.out.println("My name is " + cat.name + ", my breed is " + cat.breed + " and I am " + cat.size + " cm long");
        
        // calling the cat meow method
        
        System.out.println();
        cat.catMeow();
    }
}
