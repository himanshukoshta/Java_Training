package training;

class Main{
    void add(){
        System.out.println("hehehe");
    }

    void add(int a){
        System.out.println(a);
    }

    void add(int a,int b){
        System.out.println(a+b);
    }
}

public class method_overloading {
    public static void main(String[] args) {
        Main m1=new Main();
        m1.add();
        m1.add(5);
        m1.add(6, 8);
    }
}
