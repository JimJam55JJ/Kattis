import java.util.Scanner;

public class missingnumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int limit=sc.nextInt();
        int firstnum=sc.nextInt();//First number entered by the user
        int count=1;//count the numbers entered
        int i=1; //Expected value of the next number

        boolean order=true;

        while(count<limit|| firstnum!=i){
            if(firstnum==i){
                firstnum=sc.nextInt();
                count ++;
            }
            else{
                System.out.println(i);
                order=false;
            }
            i++;
        }
        if (order){
            System.out.println("good job");
        }
    }
}