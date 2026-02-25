package training;

abstract class shape1{
    abstract void area(int a,int b);
}

class circle extends shape1{
    void area(int a,int b){
        System.out.println(3.14*a*a);
    }
}
class rect extends shape1{
    void area(int a,int b)
    {
        System.out.println(a*b);
    }
}

public class shape {
    public static void main(String[] args) {
        shape1 s1=new circle();
        s1.area(5, 5);
        shape1 a1=new rect();
        a1.area(5, 5);
    }
}
