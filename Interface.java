package training;

interface reptile{
    void sleep();
}

class snake implements reptile{
    public void sleep(){
        System.out.println("Sleeping snake");
    }
}

public class Interface {
    public static void main(String[] args) {
        reptile j1=new snake();
        j1.sleep();
    }
}
