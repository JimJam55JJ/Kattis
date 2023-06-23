import java.util.Scanner;
public class hissingmicrophone {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        String str1=" ";
        char arr[]=new char[str1.length()];
        str1=str.toLowerCase();
        arr=str1.toCharArray();
        boolean hissdetected=false;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                if(arr[i]=='s'){
                    hissdetected=true;
                    break;
                }
            }
            else{
                hissdetected=false;
            }
        }
        if(hissdetected){
            System.out.println("hiss");
        }
        else{
            System.out.println("no hiss");
        }
    }    
}
