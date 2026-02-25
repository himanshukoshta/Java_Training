package training;

class student1{
    private String name;
    private int marks;

    public student1(String s,int m){
        this.name=s;
        this.marks=m;
    }

    public String names()
    {
        return name;
    }
    public  int markss(){
        return marks;
    }
    

}

public class student_encap {
    public static void main(String[] args) {
       student1 a1=new student1("Himanshu", 70);
       System.out.println("name "+a1.names());
       System.out.println("Marks "+a1.markss());
    }
}
