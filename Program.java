
public class Program {

    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 4};
        int[] arr2 = new int[] {0, 2, 3, 4};
        CompradeDiff(arr1, arr2);
        CompradeDiv(arr1, arr2);
    }

    static void CompradeDiff(int[] arr1, int arr2[]) { // Метод для задания 1. 

        if (arr1.length != arr2.length) {
            System.out.println("Размер массивов не совпадает. В массивах для совершения операции должно быть одинаковое количество элементов");
            
        } else {

            int[] result = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                result[i] = arr1[i] - arr2[i];
            }
            printArr(result);
        }
    }

    static void CompradeDiv(int[] arr1, int arr2[]) { // Метод для задания 2. 

        if (arr1.length != arr2.length) {
            System.out.println("Размер массивов не совпадает. В массивах для совершения операции должно быть одинаковое количество элементов");
            
        } else {

            int[] result = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] == 0) {
                    System.out.println("Один из элементов, на которые требуется разделить, равен нулю. Делить на ноль нельзя.");
                    break;
                } else {
                    result[i] = arr1[i] / arr2[i];
                }
            }
        }
    }

    static void printArr(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }
}