public class Overload {
    int Side;
    int length,breadth;
    double radius;
    int s1,s2,s3;
    Overload(int s){Side=s;}              //Square
    Overload(int l,int b)                   //Rectangle
    {   length=l;
        breadth=b;
    }            
    Overload(double r){radius=r;}           //Circle
    Overload(int side1,int side2,int side3)
    {
        s1=side1;
        s2=side2;
        s3=side3;
    }
    void display()
    {
        System.out.println("Square:"+Side);
        System.out.println("Rectangle:"+length+","+breadth);
        System.out.println("Circle:"+radius);
        System.out.println("Triangle:"+s1+s2+s3);
    }
    public static void main(String[] args) {
        Overload square=new Overload(10), circle=new Overload(5.0), rectangle=new Overload(15, 10), triangle=new Overload(1,2,3);
        square.display();circle.display();rectangle.display();triangle.display();
    }
}
