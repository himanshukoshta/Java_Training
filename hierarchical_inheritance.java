package training;

class Animal{
    void eat(){
        System.out.println("fish");
    }
}
class dog extends Animal{
    void bark()
    {
        System.out.println("bhow bhow");
    }
}

class cat extends Animal{
    void meow(){
        System.out.println("meow meow");
    }
}


public class hierarchical_inheritance {
    public static void main(String[] args) {
        dog d1 =new dog();
        cat c1= new cat();
        d1.eat();
        d1.bark();
        c1.eat();
        c1.meow();
    }
}
