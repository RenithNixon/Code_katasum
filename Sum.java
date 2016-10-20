import java.util.*;
class Sum
{
public static void main(String args[])
{
int N;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
if(N>0)
{
int sum=0;
for(int i=1;i<=N;i++)
{
sum+=i;
}
System.out.println(sum);
}
else
{
System.out.println("Enter a valid number");
}
}
}
