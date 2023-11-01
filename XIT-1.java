import java.util.*;
public class Rengoku
{
    boolean notaNumber=true;
    public int readName()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter The Number=");
        n=sc.nextInt();
        System.out.println("Finding combinations....................");
        System.out.println(" ");
        return n;
    }
    public void findOut(int n)
    {
        boolean isDuck = false;
        while(n>0)
        {
            int digit=n%10;
            if(digit == 0) {
                isDuck = true;
                break;
            }
            n = n / 10;
        }
        if(isDuck) 
        {
            System.out.println("[Duck Number]");
            notaNumber=false;
        }
    }
    public void findSmith(int n)
    {
        int cubeRoot = (int)Math.round(Math.cbrt(n));
        if (cubeRoot * cubeRoot * cubeRoot == n) 
        {
            int s = 0;
            int t = n;
            while (t != 0) {
                int d = t % 10;
                s += d;
                t /= 10;
            }
            if (s == cubeRoot) {
                System.out.println("[Dudeney Number]");
                notaNumber=false;
            }
        }
    }
    public void findLit(int n)
    {
        int t,s=0,d;
        t=n;
        while(t>0)
        {
            d=t%10;
            s=s*10+d;
            t=t/10;
        }
        if(s==n)
        {
            System.out.println("[Palindrome Number]") ;
            notaNumber=false;
        }
    }
    public void findAit(int n)
    {
        int ans = 0;
        for(int i=0; i<n; i++)
        {
            if(i*(i+1) == n)
            {
                ans = 1;
                break;
            }
        }
        if(ans == 1)
        {
            System.out.println("[Pronic Number]");
            notaNumber=false;
        }
    }
    public void findPit(int n)
    {
        int sqr = 1,
        sum = 0, r;
        sqr = n * n;
        while (sqr > 0)
        {
            r = sqr % 10;
            sum = sum + r;
            sqr = sqr / 10;
        }
        if (n == sum)
        {
            System.out.println("[Neon Number]");
            notaNumber=false;
        }
    }
    public void findSit(int n)
    {
        int count=0;  
        int square = n*n;  
        int temp = n; 
        while(temp>0)  
        {
            count++;  
            temp=temp/10;
        }
        int lastDigit = (int) (square%(Math.pow(10, count)));   
        if(n==lastDigit)  
        {
            System.out.println("[Automorphic Number]");
            notaNumber=false;
        }
    }
    public void findDit(int n)
    {
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) 
            {
                flag = true;
                break;
            }
        }
        if (!flag)
        {
            System.out.println("[Prime Number]");
            notaNumber=false;
        }
    }
    public void findFit(int n)
    {
        int originalNumber, remainder, result = 0;
        originalNumber =n;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == n)
        {
            System.out.println("[Armstrong Number]");
            notaNumber=false;
        }
    }
    public void findGit(int n)
    {
        int copyOfOriginalNumber = n;
        int sum = 0;
        while (n != 0) 
        {
            int digit = n%10;
            int fact = 1; 
            for (int i= 1; i<= digit; i++)
            {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (sum == copyOfOriginalNumber)
        {
            System.out.println("[Krishnamurthy Number]");  
            notaNumber=false;
        }
    }
    public void findJit(int n)
    {
        int numDigits = 0 ;
        int temp = n ;
        while(temp!=0)
        {
            temp=temp/10;
            numDigits++;
        }
        if(numDigits%2==0)
        {
            int firstHalf=n/(int)Math.pow(10,numDigits/2);
            int secondHalf=n%(int)Math.pow(10,numDigits/2);
            int sum=firstHalf+secondHalf;
            int squareOfSum = sum*sum;
            if(n==squareOfSum) 
            {
                System.out.println("[Tech Number]");
                notaNumber=false;
            }
        }
    }
    public void findZit(int n)
    {
        int copy = n, d = 0, sum = 0;
        String s = Integer.toString(n);  
        int len = s.length();  
        while(copy>0)
        {
            d = copy % 10;  
            sum = sum + (int)Math.pow(d,len);
            len--;
            copy = copy / 10;
        }
        if(sum == n)
        {
            System.out.println("[Disarium Number]");
            notaNumber=false;
        }
    }
    public void findVit(int n)
    {
        int count=0;  
        int cube = n*n*n;  
        int temp = n; 
        while(temp>0)  
        {
            count++;  
            temp=temp/10;
        }
        int lastDigit = (int) (cube%(Math.pow(10, count)));   
        if(n==lastDigit)  
        {
            System.out.println("[Trimorphic Number]");  
            notaNumber=false;
        }
    }
    public void findUit(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        if(sum == n) 
        {
            System.out.println("[Perfect Number]");
            notaNumber=false;
        }
    }
    public void findKit()
    {
        if(notaNumber)
        {
            System.out.println("[Not matched with the combinations]");
        }
    }
    public static void main(String args[])
    {
        int n;
        Rengoku c = new Rengoku();
        n=c.readName();
        c.findSmith(n);
        c.findOut(n);
        c.findLit(n);
        c.findAit(n);
        c.findPit(n);
        c.findSit(n);
        c.findDit(n);
        c.findFit(n);
        c.findGit(n);
        c.findJit(n);
        c.findZit(n);
        c.findVit(n);
        c.findUit(n);
        c.findKit();
    }
}
