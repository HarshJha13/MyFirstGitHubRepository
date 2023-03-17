import java.util.Scanner;
import java.lang.* ;

class multiThreading {
    public static void main(String[] args)
    {
        classA a1 = new classA();
        classB b1 = new classB();
        a1.start();
        try{
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println(e);
        }
        b1.start();
    }
}
class classA extends Thread {
    public void run(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number 1 :");
            int num_1= sc.nextInt();
            System.out.print("Enter Number 2 :");
            int num_2= sc.nextInt() ;
            System.out.println("Addition of "+num_1+"+"+num_2+" : "+(num_1+num_2));
            sleep(1000) ;
            if (num_1>num_2){
                System.out.println("Subtraction of "+num_1+"-"+num_2+" : "+(num_1-num_2));
                sleep(1000);
                System.out.println("Division of "+num_1+"/"+num_2+" : "+(num_1/num_2));
                sleep(1000);
            }else{

                System.out.println("Subtraction of "+num_2+"-"+num_1+" : "+(num_2-num_1));
                sleep(1000);
                System.out.println("Division of "+num_2+"/"+num_1+" : "+(num_2/num_1)) ;
                sleep(1000);
            }
            sleep(1000);
            System.out.println("Multiplication of "+num_1+"*"+num_2+" : "+(num_1*num_2)) ;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class classB extends Thread {
    public void run(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Please Enter Degree :");
            double degree = sc.nextInt();
            double radian = Math.toRadians(degree);
            System.out.println("Sin("+degree+") :"+Math.sin(radian));
            sleep(1000);
            System.out.println("Cos("+degree+") :"+Math.cos(radian));
            sleep(1000);
            System.out.println("Tan("+degree+") :"+Math.tan(radian));
            sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}

