package demo;

public class Player {
    int num = 0;
    
    public void guess() {
        num = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + num);
    }
}
