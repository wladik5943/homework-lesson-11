import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String [3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - i -1; j++) {
                if(arr[j].length() > arr[j+1].length()){
                    String n = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = n;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
