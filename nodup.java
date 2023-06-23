import java.util.Scanner;

public class nodup {
    public static void main(String args[]) {
        String word;
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine().toUpperCase();
        repeat(word);
    }

    public static void repeat(String word) {
        String[] arr = word.split(" ");
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }

        }
        if (count >= 1) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
