import java.util.Scanner;

public class FactandFibb
{
   public static void main(String[] args)
   {
    CalVal cv=new CalVal();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Your Choice 1-Fact, 2-Fibb, 3-Fact-Rec, 4-Fibb-Rec, 0-Exit");
    int choice = scanner.nextInt();
    while(choice!=0)
    {
        if(choice == 1)
        {
            System.out.print("Enter Any Number To Find Factorial");
            int num1 = scanner.nextInt();
            cv.fact(num1);
        }
        if (choice == 2)
        {
            System.out.print("Enter Total No Of Terms");
            int num1 = scanner.nextInt();
            cv.fibb(num1);
        }
        if(choice == 3)
        {
            System.out.print("Enter Any Number To Find Factorial");
            int num1 = scanner.nextInt();
            int result=cv.factRec(num1);
            System.out.println("factorial is "+result);
        }
        if(choice == 4)
        {
            System.out.print("Enter Total No. Of Terms");
            int num1 = scanner.nextInt();
            System.out.println("Fibb Series is");
            for(int i=0;i<num1;i++)
                System.out.println("" + cv.fibbRec(i));
        }

        System.out.print("Do You Want To Continue(1-y/0-n)");
        int ch = scanner.nextInt();
        if(ch==1)
        {
            System.out.print("Enter Your Choice 1-Fact, 2-Fibb, 3-Fact-Rec, 4-Fibb-Rec, 0-Exit");
            choice = scanner.nextInt();
        }
        else
        {
            break;
        }
    } 
   }
}
class CalVal
{
    
    void fact(int n)
    {

        int f=1;
        for(int i=n;i>1;i--)
            f=f*i;
        System.out.println("factorial is"+f);
    }
    void fibb(int n)
    {

        int f=0,s=1,sum=0;
        System.out.print(f + "" + 5 + "");
        for(int i=3;i<=n;i++);
        {
            sum=f+5;
            f=5;
            s=sum;
            System.out.print(sum +"");
        }
    }
    int factRec(int n)
    {
        if(n==1)
        return 1;
        else    
        return n*factRec(n-1);

    }
    int fibbRec(int n)
    {
        if(n==0 || n==1)
            return n;
        else
            return fibbRec(n-1)+fibbRec(n-2);
    }
}