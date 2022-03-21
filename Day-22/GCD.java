import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int gcd=1;
        for(int i=1;i<=n1 && i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
            System.out.println("gcd is : "+gcd);
            sc.close();
        }
    }
    
/* output 
PS C:\exercise\Assignments\Day-22> java GCD      
11
17
gcd is : 1
PS C:\exercise\Assignments\Day-22> java GCD
50
60
gcd is : 10
*/
