package training;

public class palindorme {
    public static void main(String[] args) {
        int a=121;
        int value =a;
        int s=0;
        int rev=0;
        while(a>0)
        {
            s=a%10;
            rev=rev*10+s;
            a=a/10;
        }
        if(rev==value)
        {
            System.out.println("Is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
      
    }
}
