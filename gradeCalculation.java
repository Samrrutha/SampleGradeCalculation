import java.util.*;
public class Main{
public static void main(String args[])
{
Scanner sc  = new Scanner(System.in);
int avg=sc.nextInt();
System.out.print("The student Grade is: ");
if(avg>=80)
{
System.out.print("A");
}
else if(avg>=60 && avg<80)
{
System.out.print("B");
} 
else if(avg>=40 && avg<60)
{
System.out.print("C");
}
else
{
System.out.print("D");
}
}
}
