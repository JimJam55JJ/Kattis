import java.util.Scanner;

class findingana {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] c = str.toCharArray();
        // char word = str.charAt(0);
        // int current = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if (c[i] == 'a') {
                break;
            }
        }
        for (; i < str.length(); ++i) {
            System.out.print(c[i]);
        }
    }
}
