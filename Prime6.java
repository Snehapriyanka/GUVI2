import java.util.Scanner;

public class Prime6 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n,a,count=0;
 n=s.nextInt();
 a=s.nextInt();
for(int i=n;i<a;i++)
{
for(int j=2;j<i;j++)
{
	if(i%j==0) {
		count=0;
	break;
	}
	else
		count=1;
}
if(count==1)
	System.out.println(i);
}
	}

}
