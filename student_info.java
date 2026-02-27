package training;

class student{
    String name;
    int rollNo;
    int marks;

    public student(int rollNo,String name ,int marks)
    {
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }
    void details(){
        System.out.println(name+" "+rollNo+" "+marks);
    }
}

public class student_info {
    public static void main(String[] args) {
        student s1 = new student( 99,"himanshu", 75);
        student s2 = new student( 100,"ravan", 60);
        student s3 = new student( 01,"sita", 80);
        s1.details();
        s2.details();
        s3.details();
    }
}
