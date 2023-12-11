import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        String str;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        char[] st = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for (int i = 0,j = 0; i < str.length()*2; i++,j++) {
            stringBuilder.insert(i,st[j]);
            stringBuilder.insert(++i,st[j]);
        }
        System.out.println(stringBuilder);
    }
}
