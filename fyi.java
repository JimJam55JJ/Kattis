import java.util.Scanner;
public class fyi{

    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int count=0;

        for(int i=0;i<3;i++){
            if(str.charAt(i)=='5'){
                count ++;
            }
        }
        if(count==3){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}

        