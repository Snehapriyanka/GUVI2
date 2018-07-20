import java.util.Scanner;

public class Armstrong7 {

	public static void main(String[] args) {
Scanner c=new Scanner(System.in);
int a,n,temp,total=0;
a=c.nextInt();
n=a;
while(n!=0) {
	temp=n%10;
	total=total+temp*temp*temp;
	n/=10;
	}
if(total==a)
	System.out.println(a+" yes");
else
System.out.println(a+" no");
	}

}
