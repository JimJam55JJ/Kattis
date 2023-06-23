import java.util.Scanner;

public class stickykeys {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        check(str);
    }

    public static void check(String str) {
        String output = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                continue;
            } else {
                output = output + str.charAt(i);
            }
        }
        output = output + str.charAt(str.length() - 1);
        System.out.println(output);
    }
}
