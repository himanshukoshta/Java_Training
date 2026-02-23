package training;

public class first {
    public static void main(String[] args)
    {
        int a=12345;
        int s=0;
        int countodd=0;
        int counteven=0;
        while(a>0)
        {
            s=a%10;
            a=a/10;
            if(s%2==0)
            {
                counteven++;
            }
            else{
                countodd++;
            }
        }
        System.out.println(counteven);
        System.out.println(countodd);
    }
}
