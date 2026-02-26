package training;

class ATM{
    private int paise;
    public ATM(int r)
    {
        this.paise=r;
    }
    public int gatter(int a)
    {
        return paise-a;
    }
}

public class encapsulationn {
    public static void main(String[] args) {
        ATM a1=new ATM(100);
        System.out.println(a1.gatter(25));
    }
}
