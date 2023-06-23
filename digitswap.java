import java.util.Scanner;

public class digitswap {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] c = str.toCharArray();

        for (int i = 0; i < c.length - 1; i++) {
            char temp = c[i];
            c[i] = c[i + 1];
            c[i + 1] = temp;
        }
        System.out.println(Integer.parseInt(new String(c)));

    }
}