import java.util.*;

public class knotknowledge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int knots = 0;
        knots = sc.nextInt();
        int[] knots_learn = new int[knots];

        for (int i = 0; i < knots; i++) {
            knots_learn[i] = sc.nextInt();
        }

        int learned[] = new int[knots_learn.length];
        for (int j = 0; j < knots_learn.length - 1; j++) {
            learned[j] = sc.nextInt();
        }
        remainingknot(knots_learn, learned);
    }

    public static void remainingknot(int knots_learn[], int learned[]) {
        HashSet<Integer> repeat = new HashSet<>();
        int [] temp=new int[knots_learn.length];
        for (int i = 0; i < knots_learn.length; i++) {
            for (int j = 0; j < learned.length; j++) {
                if (knots_learn[i] == learned[j]) {
                    repeat.addAll(temp[]);
                }
            }
        }
        System.out.println(temp[]);
    }

}