package training;

class Employee{
    void work(){
        System.out.println("Backend");
    }
}
class Manager extends Employee{
    void attendMeeting(){
        System.out.println("Meeting at 5pm");
    }
}

public class single_inheritance2 {
    public static void main(String[] args) {
        Manager m1=new Manager();
        m1.work();
        m1.attendMeeting();
    }
}
