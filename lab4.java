import java.util.Scanner;
import java.util.Arrays;

public class lab4 {
    public static void main(String[] args){

        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int n;

        while (true) {
            if (in1.hasNextInt()) {
                n = in1.nextInt();
                break;
            }
            else {
                System.out.print ("Ошибка!Введите целое число: ");
                in1.next();
            }
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целочисленные элементы массива: ");
        int[] arr = null;

        while (true) {
            if (in.hasNextInt()) {
                arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                }
                break;
            }
            else{
                System.out.print ("Ошибка!Введите целые числа: ");
                in.next();
            }
        }

        Scanner inn = new Scanner(System.in);
        System.out.print("Введите x - целое число: ");
        int x;

        while (true) {
            if (inn.hasNextInt()) {
                x = inn.nextInt();
                break;
            }
            else {
                System.out.print ("Ошибка!Введите целое число: ");
                inn.next();
            }
        }

        int[] newArr = null;
        int length = arr.length;

        System.out.println("Оригинальный массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                newArr = new int[arr.length-1];
                for (int j = 0; j < i; j++){
                    newArr[j] = arr[j];
                }
                for (int k = i; k < arr.length-1; k++){
                    newArr[k] = arr[k+1];
                }
                arr = newArr;
            }
        }
        if (arr.length == length){
            System.out.println("Итоговый массив не изменился, х не найден: " + Arrays.toString(arr));
        }
        else {
            System.out.println("Итоговый массив после удаления элемента x: " + Arrays.toString(newArr));
        }
        in1.close();
        in.close();
        inn.close();
    }
}
