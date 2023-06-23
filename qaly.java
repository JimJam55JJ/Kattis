import java.util.Scanner;
import java.text.DecimalFormat;
public class qaly{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        float sum=0;
        float product=0;

        for(int i=0;i<num;i++){
            float life=sc.nextFloat();
            float quality=sc.nextFloat();
            
            product=life*quality;
            sum=sum+product;
        }
        // System.out.println(sum);
        round(sum);
    }
    public static void round(float sum){
        DecimalFormat dec=new DecimalFormat("0.000");
        System.out.println(dec.format(sum));
    }
}