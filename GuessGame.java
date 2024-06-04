package demo;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    
    //creating the start game method
    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        //declaring player guesses
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        
        //initializing each player guesses to false
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        
        //Setting the target number
        int targetNumber = (int) (Math.random() * 10);
        
        System.out.println("I'm thinking of a number between 0 and 9...");
        
        int attempts = 3;
        
        //creating the while loo
        while (true) {
            System.out.println("Number to guess is " + targetNumber);
            
            p1.guess();
            p2.guess();
            p3.guess();
            
            //Getting each players guess and assigning it to guess variables
            guessp1 = p1.num;
            System.out.println("Player one's guess is " + guessp1);
            
            guessp2 = p2.num;
            System.out.println("Player two's guess is " + guessp2);
            
            guessp3 = p3.num;
            System.out.println("Player three's guess is " + guessp3);
            
            //checking player guesses against the target number and assign either true
            
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            
            //Outputting results if any of the guesses match the target number
            if (p1isRight || p2isRight || p3isRight) {                
                 System.out.println("We have a winner!");
                 System.out.println("Player one got it right? " + p1isRight);
                 System.out.println("Player two got it right? " + p2isRight);
                 System.out.println("Player three got it right? " + p3isRight);
                 System.out.println("Game is over.");
                 break;
            } else {
                attempts -= 1;
                
                if (attempts > 0) {
                    System.out.println();
                    System.out.println("Players will have to try again, " + attempts + " attempts left");
                    System.out.println();
                    
                } else {
                    System.out.println("\nThere's no winner, you're out of attempts");
                    break;
                }
                
                
            }
        }
        
        
    }
}
