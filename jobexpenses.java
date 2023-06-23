import java.util.Scanner;

public class jobexpenses {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();

        int arr[]=new int[limit];
        int sum=0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 0){
                sum += arr[i];
            }
        }
        int absolute=Math.abs(sum);
        System.out.print(absolute);
    }
}
