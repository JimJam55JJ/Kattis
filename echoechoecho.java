import java.util.Scanner;

class echoechoecho {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print(str + " ");
        }
    }
}