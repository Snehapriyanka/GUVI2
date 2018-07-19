import java.util.Scanner;

public class Power1 {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
int a,b,result=1;
a=s.nextInt();
 b=s.nextInt();
while(b!=0)
{
	result=result*a;
	--b;
}
System.out.println(result);
	}

}
