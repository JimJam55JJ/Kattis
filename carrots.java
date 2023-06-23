import java.util.Scanner;
public class carrots{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int P=input.nextInt();
        String S=input.next();

        if(N>=1){
            System.out.println(P);
        }
        else{
            System.out.println(N);
        }
    }
}