import java.util.Scanner;

class constructorMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter Number 1 : ");
        int num_1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int num_2 = sc.nextInt();
        constructor c = new constructor(name,age);
        constructor_1 c1= new constructor_1(num_1,num_2);
        int sum=c1.returnSum();
        c.display();
        System.out.println("The Sum of the Numbers are : "+sum);

    }
}
class constructor
{
    String Name;
    int Age;
     constructor(String name , int age)
     {
         this.Name = name ;
         this.Age = age;
     }
     void display()
     {
         System.out.println("My Name is "+Name+" and I am "+Age+" years Old.");
     }


}
class constructor_1
{
    int a ;
    int b ;
    constructor_1(int number_1 ,int number_2)
    {
        this.a=number_1;
        this.b=number_2;
    }
    public int returnSum()
    {
     return a+b;
    }

}
