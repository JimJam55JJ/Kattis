import java.text.DecimalFormat;
import java.util.Scanner;

public class metronome{
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        float num=sc.nextFloat();
        float turn=0;

        turn=num/4;

        DecimalFormat dec=new DecimalFormat("0.00");
        System.out.println(dec.format(turn));
    }

}
