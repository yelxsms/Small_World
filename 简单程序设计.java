/*
//计算圆的面积
public class 简单程序设计 {
    public static void main(String[] args){
        double radius;
        double area;
        radius=20;
        area=radius*radius*3.1415926;
        System.out.println("the area is "+area);
    }
}
*/




/*
//输入圆的半径，计算其面积
import java.util.Scanner;              //Scanner类再java.util包中

public class 简单程序设计{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);    //创建一个Scanner类型的变量
        System.out.println("please enter a radius:");
        double radius;
        radius=input.nextDouble();      //从键盘读入一个双精度浮点数
        double area;
        area=radius*radius*3.1415926;
        System.out.println("the area of the circle is "+area);
    }
}
*/


/*
//计算三个数的平均数
import java.util.Scanner;

public class 简单程序设计{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("please enter 3 numbers:");
        double number1=input.nextDouble();
        double number2=input.nextDouble();
        double number3=input.nextDouble();
        double average =(number1+number2+number3)/3;
        System.out.println("the average of the 3 numbers is "+average);
    }
}
*/



/*
//定义常量
import java.util.Scanner;

public class 简单程序设计{
    public static void main(String[] args){
        final double PI=3.1415926;
        //定名常量PI的值为3.1415926
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a radius:");
        double radius;
        radius=input.nextDouble();
        double area;
        area=radius*radius*PI;
        System.out.println("the area of the circle is "+area);
    }
}
*/

/*
//时间换算
import java.util.Scanner;

public class 简单程序设计{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("please enter a integer number of the second:");
        int second=input.nextInt();
        int minute=second/60;
        int add=second%60;
        System.out.println(second+" seconds "+"is "+minute+" minutes and "+add+" sceonds.");
    }
}*/



/*
//计算算式
import java.util.Scanner;
public class 简单程序设计{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("question:(3+4*x)/5)-(10*(y-5)*(a+b+c))/x+9*((4/x)+(9+x)/y=?");
        System.out.println("please enter the value of the x y a b and c:");
        double x=input.nextDouble();
        double y=input.nextDouble();
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double answer = ((3+4*x)/5)-(10*(y-5)*(a+b+c))/x+9*((4/x)+(9+x)/y);
        System.out.println("the ansewer is "+answer);
    }
}*/


/*
//使用%求余时，只有当被除数是负数时，余数才会是负数
//计算格林尼治标准时间
public class 简单程序设计 {
    public static void main(String[] args){
        long TMS=System.currentTimeMillis();
        long addm=TMS%1000;
        long totalseconds=TMS/1000;
        long addseconds=totalseconds%60;
        long totalminutes=totalseconds/60;
        long addminutes=totalminutes%60;
        long totalhours=totalminutes/60;
        long addh=totalhours%24;
        System.out.println("Current time is "+addh+":"+addminutes+":"+addseconds+":"+" GMT.");
    }
}*/

/*
//简捷运算符
public class 简单程序设计{
    public static void main(String[] args){
        int i=2;
        i+=2;
        System.out.println(i);
    }
}
*/


/*
//数据类型转换
public class 简单程序设计 {
    public static void main(String[] args){
        System.out.println((int)1.8);
        System.out.println((double)1/2);
        System.out.println(1/2);
    }
}*/


/*import java.util.Scanner;
public class 简单程序设计 {
    public static void main(String[] args){
        System.out.println("please enter the amount:");
        Scanner input=new Scanner(System.in);
        double amount=input.nextDouble();
        double tax=amount*0.06;
        System.out.println("the tax is "+(int)(tax*100)/100.0);
    }
}*/



/*//数据类型转换不会改变被转换的变量
public class 简单程序设计 {
    public static void main(String[] args){
        double a=3.69;
        int b= (int)a;
        System.out.println(b);
        System.out.println(a);
    }
}*/


/*
import java.util.Scanner;
public class 简单程序设计 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the interest rate, years and the loan amount:");
        double rate=input.nextDouble();
        int years=input.nextInt();
        int amount=input.nextInt();
        double help=Math.pow((1+rate),12);
        double MonthAmount=(amount*rate)/(1-help);
        System.out.println("you should pay "+(int)(MonthAmount*100)/100.0+" every month.");
        double YearAmount=amount+(MonthAmount*12*years);
        System.out.println("and you should pay "+(int)(YearAmount*100)/100.0+" total.");
    }
}*/

/*

import java.util.Scanner;

public class 简单程序设计 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter three strings:");
        String s1=input.next();
        String s2=input.next();
        String s3=input.next();
        System.out.println("s1 is "+s1);
        System.out.println("s2 is "+s2);
        System.out.println("s3 is "+s3);
        System.out.println(s1+s2+s3);
    }
}
*/


/*
import java.util.Scanner;
public class 简单程序设计 {
    public static void main(String[] args){
        //提示输入华氏度温度值
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the k");
        double k = input.nextDouble();
        //摄氏华氏温度的转换
        double output=(9.0/5)*k+32.0;
        //输出结果
        System.out.println(" the answer is "+output);
    }
}
*/


/*public class 简单程序设计 {
    public static void main(String[] args) {
        byte i = 100;
        long k = i * 3 + 4;
        double d = i * 3.1 + k / 2;
        System.out.println(d);

    }
}*/


/*import javax.swing.JOptionPane;

public  class 简单程序设计 {
    public static void main(String[] args){

        String input =JOptionPane.showInputDialog(null,"please enter an input","Test window",JOptionPane.QUESTION_MESSAGE);

    }
}*/


/*import java.util.Scanner;

public class 简单程序设计 {
    public static  void main(String[] args){

        System.out.println("please enter the radius and the hight:");
        Scanner input =new Scanner(System.in);

        double radius=input.nextDouble();
        double hight=input.nextDouble();

        double areas=radius*radius*Math.PI*2 + 2*Math.PI*radius*hight;
        double volume=radius*radius*Math.PI*hight;

        System.out.println("the area is "+areas+" and the volume is "+volume);
    }
}*/

/*import java.util.Scanner;

public class 简单程序设计 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a value for feet:");
        double feet=input.nextDouble();
        double output=0.305*feet;
        System.out.println(feet+" is "+output+" meters.");
    }
}*/



/*
import java.util.Scanner;

public class 简单程序设计 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("please enter a subtotal and gratuity rate:");
        double subtotal = input.nextDouble();
        double GratuityRate =input.nextDouble();
        double gratuity=subtotal*GratuityRate/100;
        double total =subtotal+gratuity;
        System.out.println("the gratuity is "+(int)(gratuity*100)/100.0+" and total is "+((int)(total*100))/100.0);
    }
}*/


/*
import java.util.Scanner;

public class 简单程序设计 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("enter a  interge number between 0 and 1000:");
        int Number=input.nextInt();
        int k1= Number/100;
        int k2= (Number%100)/10;
        int k3= Number%10;
        int result= k1+k2+k3;
        System.out.println("the sum of the digits is "+result);
    }
}*/


/*

import  java.util.Scanner;

public  class 简单程序设计 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("please enter the number of minutes:");
        int minutes =input.nextInt();
        int years=minutes/(24*60*365);
        int days=(minutes%(24*60*365))/(24*60);
        System.out.println(minutes+" is "+years+" years "+days+" days.");
    }
}*/















