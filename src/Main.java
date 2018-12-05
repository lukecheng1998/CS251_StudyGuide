import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Sorts s = new Sorts();
        int[] array = new int[50];
        for(int i = 0; i < array.length; i++){
            int temp = (int)(Math.random() * 50 + 1);
            array[i] = temp;
        }
        System.out.print("Your Array: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int breaker = -1;
        Scanner scanner = new Scanner(System.in);
        while(breaker == -1) {
            System.out.println("1. Sorts");
            System.out.println("2. Find");
            System.out.println("3. Exit");
            int localbreak = -1;
            int n = scanner.nextInt();
            if(n == 1) {
                while (localbreak == -1) {
                    System.out.println("1. Bubble Sort");
                    System.out.println("2. Quick Sort");
                    System.out.println("3. Merge Sort");
                    System.out.println("4. Insertion Sort");
                    System.out.println("5. Selection Sort");
                    System.out.println("6. Radix Sort");
                    System.out.println("7. Exit");
                    int n2 = scanner.nextInt();
                    int[] tempArray = array;
                    if(n2 == 1) {
                        System.out.println();
                        System.out.println("Bubble Sort: ");
                        s.bubbleSort(tempArray);
                        System.out.print("Bubble Sort Result: ");
                        for (int i = 0; i < tempArray.length; i++) {
                            System.out.print(tempArray[i] + " ");
                        }
                        System.out.println();
                    }else if (n2 == 2){
                        System.out.println();
                        System.out.println("Quick Sort: ");
                        s.quickSort(tempArray, 0, tempArray.length - 1);
                        System.out.println("Quick Sort Result: ");
                        for(int i = 0; i < tempArray.length; i++){
                            System.out.print(tempArray[i] + " ");
                        }
                        System.out.println();
                    }else if (n2 == 3){
                        System.out.println();
                        System.out.println("Merge Sort: ");
                        s.mergeSort(tempArray, 0, tempArray.length - 1);
                        for(int i = 0; i < tempArray.length; i++){
                            System.out.print(tempArray[i] + " ");
                        }
                        System.out.println();
                    }else if (n2 == 4){
                        System.out.println();
                        System.out.println("Insertion Sort: ");
                        s.insertionSort(tempArray);
                        System.out.println("Insertion Sort Result: ");
                        for(int i = 0; i < tempArray.length; i++){
                            System.out.print(tempArray[i] + " ");
                        }
                        System.out.println();
                    }else if (n2 == 5){
                        System.out.println();
                        System.out.println("Selection Sort: ");
                        s.selectionSort(tempArray);
                        System.out.println("Selection Sort Result: ");

                        System.out.println();
                    }else if (n2 == 6){
                        System.out.println();
                        System.out.println("Radix Sort");
                        s.radixSort(tempArray, tempArray.length);
                        for(int i = 0; i < tempArray.length; i++){
                            System.out.print(tempArray[i] + " ");
                        }
                        System.out.println();
                    }else if(n2 == 7){
                        localbreak = 0;
                    }
                }
            }else if(n == 2){
                while(localbreak == -1){

                }
            }else if(n == 3){
                breaker = 0;
            }
        }
    }
}
