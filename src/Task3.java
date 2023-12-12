import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextLine();
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += arr[i].length();
        }

        sum /= 3;
        System.out.println("средняя длина - " + sum);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < sum) {
                System.out.println(arr[i]);
                System.out.println("длина строки - " + arr[i].length());
            }
        }
    }
}
