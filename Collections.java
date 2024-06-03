package demo;

public class Collections {
    public Collections() {
        super();
    }

    // Decalring Intstance variable arr
    int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };

    //Method to get the array lenght
    public void getArrayLenght() {
        System.out.println("The arrays length is " + arr[2].length);
    }

    //Method to print both outer and the inner array elements
    public void printArrayElements() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    // Calling my main method
    public static void main(String[] args) {

        // Objctifying the collections class
        Collections array = new Collections();

        array.getArrayLenght();

        array.printArrayElements();
    }
}


