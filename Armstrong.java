import java.util.Scanner;
Class Armstrong
  {
	public static void main(String[] args){
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=Sc.nextInt(),rem=0,temp=num,sum=0,power=o;
			while(num)
			{
				rem=num%10;
				System.out.println(rem);
				count++;
				num=num/10;
			}
			while(temp>0)
			{
				rem=num%10;
				sum=sum+(int)Math.pow(rem,count);				
				num=num/10;

				
			}
		System.out.println(sum);
               System.out.println(sum==temp?"Armstrong":"not a Armstrong");
			}
}