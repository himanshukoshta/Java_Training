package training;

public class type_casting {
    public static void main(String[] args) {
        // byte a=3;
        // byte b=6;
        // byte c= (byte)(a+b);
        // System.out.println(c);

        //Explicit casting
        double x=10.75;
        int q = (int)x;
        System.out.println("double to int "+q);
        
        float w= 25.99f;
        int f= (int) w;
        System.out.println("float to int "+f);
    }
}
