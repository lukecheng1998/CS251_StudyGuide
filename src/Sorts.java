import java.util.Arrays;

public class Sorts {
    public int[] bubbleSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                for(int z = 0; z < array.length; z++){
                    System.out.print(array[z] + " ");
                }
                System.out.println();
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    public int[] quickSort(int[] array, int low, int high){
        if((high - low + 1) < 6){
            qInsertionSort(array, low, high);
        }else{
            for(int e = 0; e < array.length; e++){
                System.out.print(array[e] + " ");
            }
            System.out.println();
            int pivot = parition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
        return array;
    }
    public void qInsertionSort(int[] array, int bottom, int top){
        for(int i = bottom; i < top; i++){
            for(int j = i; i > bottom; j--){
                int z = j - 1;
                if(array[j] < array[z]){
                    for(int e = 0; e < array.length; e++){
                        System.out.print(array[e] + " ");
                    }
                    System.out.println();
                    int temp = array[j];
                    array[j] = array[z];
                    array[z] = temp;
                }else{
                    break;
                }
            }
        }
    }
    public int parition(int[] array, int low, int high){
        int pivot = array[high];
        int i = (low - 1);
        for(int j = low; j < high; j++){
            if(array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        for(int z = 0; z < array.length; z++){
            System.out.print(array[z] + " ");
        }
        return i + 1;
    }
    public int[] mergeSort(int[] array, int low, int high){
        if(low < high){
            int pivot = (low + high) / 2;
            mergeSort(array, low, pivot);
            mergeSort(array, pivot + 1, high);
            for(int z = 0; z < array.length; z++){
                System.out.print(array[z] + " ");
            }
            System.out.println();
            merge(array, low, pivot, high);
        }
        return array;
    }
    public void merge(int[] array, int low, int medium, int high){
        int n1 = medium - low + 1;
        int n2 = high - medium;

        int[] tempArray1 = new int[n1];
        int[] tempArray2 = new int[n2];

        for(int i = 0; i < tempArray1.length; i++){
            tempArray1[i] = tempArray1[low + i];
        }
        for(int i = 0; i < tempArray2.length; i++){
            tempArray2[i] = array[medium + 1 + i];
        }
        int i = 0, j = 0;
        int k = low;
        while(i < n1 && j < n2){
            if(tempArray1[i] <= tempArray2[j]){
                array[k] = tempArray1[i];
                i++;
            }else{
                array[k] = tempArray2[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            array[k] = tempArray1[i];
            i++;
            k++;
        }
        while(j < n2){
            array[k] = tempArray2[j];
            j++;
            k++;
        }
    }
    public int[] insertionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int bottom = array[i];
            int top = i - 1;
            while(top >= 0 && array[top] > bottom){
                array[top + 1] = array[top];
                top--;
            }
            array[top + 1] = bottom;
            for(int z = 0; z < array.length; z++){
                System.out.print(array[z] + " ");
            }
            System.out.println();
        }
        return array;
    }
    public int[] selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = 0; j < i + 1; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
            for(int z = 0; z < array.length; z++){
                System.out.print(array[z] + " ");
            }
            System.out.println();
        }
        return array;
    }
    public int[] radixSort(int[] array, int n){
        int m = getMax(array);
        for(int i = 1; m/i > 0; i *= 10){
            cSort(array, n, i);
        }
        return array;
    }
    public void cSort(int[] array, int n, int i){
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();
        for(int z = 0; z < n; z++){
            count[(array[z]/i) % 10]++;
        }
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();
        for(int z = 1; z < 10; z++){
            count[z] += count[z - 1];
        }
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();
        for(int z = n - 1; z >= 0; z--){
            output[count[(array[z]/i) % 10] - 1] = array[i];
            count[(array[z]/i) % 10]--;
        }
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j] + " ");
        }
        System.out.println();
        for(int z = 0; z < n; z++){
            array[z] = output[z];
        }
    }
    public int getMax(int[] array){
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    public int[] bucketSort(int[] array){
        return array;
    }
}
