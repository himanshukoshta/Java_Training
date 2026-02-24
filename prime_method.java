package training;

public class prime_method {
    void prime(int a)
    {
        boolean isPrime=true;
        if(a<=1)
        {
            isPrime=false;
        }
        else{
            for(int i=2;i<a;i++){
                if(a%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime)
        {
            System.out.println("Is prime");
        }
        else
        {
            System.out.println("Not a prime");
        }
    }
    public static void main(String[] args) {
        prime_method pm = new prime_method();
        pm.prime(75);
    }
}
