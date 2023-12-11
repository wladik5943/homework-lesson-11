import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        String[] arr = str.split(" ");
        System.out.println("введите номер слова");
        String a = scanner.nextLine();
        int n = Integer.parseInt(a);
        n--;
        char[] ch = arr[n].toCharArray();
        for (int i = 0,j = ch.length-1; i < j; i++,j--) {
            if(ch[i] != ch[j]){
                System.out.println("не является палиндромом");
                return;
            }
        }
        System.out.println("является палиндромом");
    }
}
