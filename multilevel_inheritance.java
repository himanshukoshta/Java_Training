package training;

class Animal{
    void eat()
    {
        System.out.println("Chicken");
    }
}
class dog extends Animal{
    void bark()
    {
        System.out.println("bhow bhow");
    }
}
class puppy extends dog{
    void sleep()
    {
        System.out.println("slewping beauty");
    }
}

public class multilevel_inheritance {
    public static void main(String[] args) {
        puppy p1 =new puppy();
        p1.bark();
        p1.eat();
        p1.sleep();
    }
}
