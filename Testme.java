public class Testme {
    public void FizzBuzz(int num) {
        int fizz = 0;
        int buzz = 0;
        int fizzbuzz = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 15 == 0) {
                fizzbuzz += 1;
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                buzz += 1;
                System.out.println("Buzz");
            }

            else if (i % 3 == 0) {
                fizz += 1;
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("There are " + fizz + " fizzs, " + buzz + " buzzes and " + fizzbuzz + " fizzbuzzes");
    }

    public static void main(String[] args) {
        Testme print = new Testme();
        print.FizzBuzz(100);
    }
}
