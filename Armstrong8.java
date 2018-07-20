import java.util.Scanner;

public class Armstrong8 {

	public static void main(String[] args) {
		int a,b,n,sum=0,temp;
Scanner c=new Scanner(System.in);
a=c.nextInt();
b=c.nextInt();
for(int i=a+1;i<b;i++) {
	n=i;
while(n>0) {
	temp=n%10;
	sum=sum + (temp*temp*temp);
	n=n/10;
	}
if(sum==i) {
	System.out.print(i+" ");
}
	sum=0;

		}
	}

}
