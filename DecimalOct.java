import java.util.*;
class DecimalOct
{
    int dec;
    //Constructor
    DecimalOct()
    {
        dec = 0;    
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        dec = sc.nextInt();
    }
    //Convertor method
    String convert(int n)
    {
        String res = "";
        while(n > 0)
        {
            res = (n%8) + res;
            n /= 8;
        }
        return res;
    }
    void display()
    {
        System.out.println(dec+" in octal is: "+convert(dec));
    }
    public static void main()
    {
        DecimalOct obj = new DecimalOct();
        obj.input();
        obj.display();
    }
}
