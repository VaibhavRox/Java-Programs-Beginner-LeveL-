class Employee
{
    void display()
    {
        System.out.println("This is Employee class");
    }
    void calcSalary()
    {
        System.out.println("Salary of employee is 1000");
    }
}
class Engineer extends Employee
{
    
    void display()
    {
        super.display();
        super.calcSalary();
        System.out.println("This is Engineer class");
    }
    void calcSalary()
    {
        System.out.println("Salary of engineer is 2000");
    }
}
class inherit
{
    public static void main(String args[])
    {
        //Single object instantiation of engineer class
        Engineer eng=new Engineer();
        eng.display();
        eng.calcSalary();
    }
}