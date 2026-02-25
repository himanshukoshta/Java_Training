package training;

class Person{
    void displayName()
    {
        System.out.println("Himanshu");
    }
}
class sstudent extends Person{
    void displayClass(){
        System.out.println("A2");
    }
}

class monitor extends sstudent{
    void checkDiscipline()
    {
        System.out.println("good");
    }
}

public class multilevel_inheritance2 {

 public static void main(String[] args) {
    monitor m1=new monitor();
    m1.displayName();
    m1.displayClass();
    m1.checkDiscipline();
 }   
}
