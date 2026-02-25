package training;

class aanimal{
    void sound(){
        System.out.println("animal");
    }
}
class dogg extends aanimal{
    void sound(){
        System.out.println("dog");
    }
}
class catt extends aanimal{
    void sound(){
        System.out.println("cat");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        aanimal a1=new dogg();
        aanimal a2 =new catt();
        a1.sound();
        a2.sound();
    }
}
