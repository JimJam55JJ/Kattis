import java.util.Scanner;
class jumbojavelin{
public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    int N=input.nextInt();
    int sum=0,ans=0;
    for(int i=1;i<=N;i++){
        int length=input.nextInt();
        sum=sum+length;
    }
    ans=sum-(N-1);
    System.out.println(ans);
    }
}
