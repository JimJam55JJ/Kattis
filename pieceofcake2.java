import java.util.Scanner;

public class pieceofcake2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int vertical = scan.nextInt();
        int horizontal = scan.nextInt();

        int l = 0;
        int b = 0;

        if (vertical <= length / 2) {
            l = length - vertical;
        } else {
            l = vertical;
        }
        if (horizontal <= length / 2) {
            b = length - horizontal;
        } else {
            b = horizontal;
        }

        System.out.println(l * b * 4);

    }

}
