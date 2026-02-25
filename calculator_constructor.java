package training;

class calculate{
    int a;
    int b;

    public calculate(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void result(){
        System.out.println("addition "+(a+b));
        System.out.println("Subtraction "+(a-b));
        System.out.println("Multiplpication "+(a*b));
        System.out.println("Division "+(a/b));
    }
}

public class calculator_constructor {
    public static void main(String[] args) {
        calculate c1=new calculate(9, 10);
        c1.result();
        
    }
}
