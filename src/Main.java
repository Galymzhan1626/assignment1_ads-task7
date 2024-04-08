import java.util.Scanner;

public class Main {
    /**
     * the main method serves as the program's entry point.
     * it reads an integer 'n' to define the size of an array, populates the array with user input,
     * and then reverses and prints the array using helper methods.
     *
     * @param args The command line arguments passed to the program
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // input size of array
        int n=scan.nextInt();
        int[] arr=new int[n];
        // input all elements of array separetly
        for (int i = 0; i <n; i++) {
            arr[i]=scan.nextInt();
        }
        // call the methods
        reverso(arr,0,n-1);
        printArray(arr);

    }

    public static void reverso(int[] arr, int start ,int end){
        int temp;
        if(start<end){

            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverso(arr, start+1,end-1);
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i])+" ");
            // prints each element followed by a space
        }
    }
}