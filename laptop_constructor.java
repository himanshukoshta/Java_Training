package training;

class Price{
    String brand;
    int ram;
    float price;

    public  Price(String brand,int ram,float price){
        this.brand=brand;
        this.ram=ram;
        this.price=price;
    }

    void details()
    {
        System.out.println(brand+ " "+ram+" "+price);
    }
}

public class laptop_constructor {
    public static void main(String[] args) {
        Price p1=new Price("lenovo", 16, 49000);
        Price p2=new Price("hp", 8, 35000);
        p1.details();
        p2.details();
    }
}
