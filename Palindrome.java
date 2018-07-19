import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int num,b=0,n,n1;
 num=s.nextInt();
 n1=num;
	
		 while(num!=0)
		 {
			 n=num%10;
			 b=b*10+n;
			 num/=10;
		 }
		 if(n1==b)
			 System.out.println(n1+" yes");
		 else
			 System.out.println(n1+" no");
		
	}

}
