import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("give a number of items for an array");
        int response = scan.nextInt();
        int[] numbers = new int[response];

        for (int i = 0; i< numbers.length; i++){
            numbers[i] = rand.nextInt(100000);
        }
        System.out.println(Arrays.toString(numbers));
        BubbleClass test = new BubbleClass();
        test.bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
        /*
        Item s1 = ItemFactory.getItemObject(response);
        System.out.println(s1.getPrice());
        System.out.println(s1.getClass().getName());*/
    }
}
