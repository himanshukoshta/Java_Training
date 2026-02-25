package training;

class Color{
    String color="blue";
}

class one extends Color{
    String color="red";
    void c1(){
    System.out.println(color);
    System.out.println(super.color);
    }
}

public class superr {
    public static void main(String[] args) {
        one o1=new one();
        o1.c1();
       }
}
