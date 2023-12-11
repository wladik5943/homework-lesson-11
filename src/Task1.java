import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String [3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextLine();
        }
        int max = 0;
        int min = 0;
        for (int i = 1; i < 3; i++) {
            if(arr[max].length() < arr[i].length())
                max = i;
            if(arr[min].length() > arr[i].length())
                min = i;
        }

        System.out.println("самая длинная строка - " + arr[max]);
        System.out.println("самая короткая строка - " + arr[min]);

    }
}
