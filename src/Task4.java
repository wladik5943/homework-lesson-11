import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String [3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextLine();
        }

        int k = 0;
        int m = -1;
        for (int i = 0; i < arr.length; i++) {
            char[] n = new char[arr[i].length()];
            n = arr[i].toCharArray();
            boolean flag = false;
            for (int j = 0; j < n.length; j++) {

                for (int l = j + 1; l < n.length; l++) {
                    if (n[j] == n[l]) flag = true;
                }
            }
                if(!flag) {
                    k++;
                    m = i;
                }
        }

        if(k != 0 && k != 1){
            for (int i = 0; i < arr.length; i++) {
                char[] n = new char[arr[i].length()];
                n = arr[i].toCharArray();
                boolean flag = false;
                for (int j = 0; j < n.length; j++) {
                    for (int l = j + 1; l < n.length; l++) {
                        if (n[j] == n[l]) flag = true;
                    }
                }
                if(!flag){
                    m = i;
                    break;
                }
            }
        }
        if(m == -1){
            System.out.println("нет нужных слов");
            return;
        }
        System.out.println("количество слов удовлетворяющих условию - " + k);
        System.out.println(arr[m]);
    }
}
