package demo;

public class Area {
    public Area() {
        super();
    }

    public Integer SqureaArea(int length) {
        return length * length;
    }

    public Integer RectangleArea(int length, int width) {
        return length * width;
    }

    public double CircleArea(double radius, double pie) {
        return pie * (radius * radius);
    }

    public String SayHi(String name) {
        return "Hello " + name;
    }

    public static void main(String[] args) {
        Area square = new Area();
        Area rectangle = new Area();
        Area circle = new Area();
        Area hi = new Area();

        System.out.println("Square area is " + square.SqureaArea(5) + "\n Rectangle area is " +
                           rectangle.RectangleArea(4, 5) + "\n Circle area is " + circle.CircleArea(7.0, 3.14));
        System.out.println(hi.SayHi("Jeff"));

        int a = 0;
        int b = 0;

        //while loop
        while (a < 5) {
            System.out.println("Yes");
            a++;
            if (a == 4) {
                System.out.println("a == 4");
                break;
            } else {
                continue;
            }
        }

        //do ...while loop
        do {
            System.out.println("Test");
            b++;
        } while (b > 5);

        //Arrays

        //single dimensional array
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(arr.length);
        System.out.println(arr[2]);

        // multidimensional array
        int arrb[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 } };
        System.out.println(arrb[1].length);

    }
}
