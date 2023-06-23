import java.util.Scanner;
class nsum{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++){
            int num=input.nextInt();
            sum=num+sum;
        }
        System.out.println(sum);
    }
}