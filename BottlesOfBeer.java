package demo;

public class BottlesOfBeer {
    // let bottles be n
    int n = 99;

    //creating the bottles method

    public void PrintBottles() {
        //Implementing the 99 bottles of beer using a while loop

        while (n > 0) {
            System.out.println(n + " bottles of beer");
            System.out.println(n + " bottles on the wall");
            System.out.println("Take one pass it around");
            System.out.println((n - 1) + " bottles of beer on the wall");

            // Adding a blank line after each instance
            System.out.println();


            n -= 1;

            if (n == 0) {
                System.out.println("No more bottles of beer on the wall");
                System.out.println("No more bottles of beer");
                System.out.println("We've taken them down");
                System.out.println("And passed them around");
                System.out.println("Now we're drunk and paased out");

            }
        }
    }

    //Driver method

    public static void main(String[] args) {
        BottlesOfBeer sing = new BottlesOfBeer();

        //calling the print method
        sing.PrintBottles();
    }
}
