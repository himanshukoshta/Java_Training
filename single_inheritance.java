package training;

class Animal{
    void eat(){
        System.out.println("chicken");
    }
}
class dog extends Animal{
    void bark()
    {
        System.out.println("Bhow bhow");
    }
    
}

public class single_inheritance {
    public static void main(String[] args) {
     dog d1=new dog();
     d1.eat();
     d1.bark();   
    }
}
