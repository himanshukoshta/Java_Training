package training;

interface animal12{
    void sound();
}
interface bird{
    void eat();
}

class crow implements animal12,bird{
    public void sound(){
        System.out.println("chirp chrip");
    }
    public void eat(){
        System.out.println("grains");
    }
}

public class multiple_inheritancee {
    public static void main(String[] args) {
        crow c1=new crow();
        c1.sound();
        c1.eat();
    }
}
