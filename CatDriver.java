package demo;

public class CatDriver {
    public static void main(String [] args) {
        Cat catOne = new Cat();
        Cat catTwo = new Cat();
        Cat catThree = new Cat();
        
        //initializing catOne attributes
        catOne.size = 20;
        catOne.breed = "Russian";
        catOne.name = "Jane";
        
        //initializing catTow attributes
        catTwo.size = 15;
        catTwo.breed = "American";
        catTwo.name = "Nana";
        
        
        System.out.println("My name is " + catOne.name + ", my breed is " + catOne.breed + " and I am " + catOne.size + " cm long");
        
        // calling the cat meow method
        
        System.out.println();
        catOne.catMeow();
    }
}
