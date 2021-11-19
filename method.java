/*
import javax.swing.JOptionPane;

public class method {
    public static void main(String[] args){
        String j= JOptionPane.showInputDialog(null,"please enter the first number:");
        String k= JOptionPane.showInputDialog(null,"please enter the second number:");
        int j1=Integer.parseInt(j);
        int k1=Integer.parseInt(k);
        JOptionPane.showMessageDialog(null,"the bigger number is "+max(j1,k1));
    }
    public static int max(int i1,int i2){
        if(i1>=i2){
            return i1;
        }
        else{
            return i2;
        }
    }
}*/



/*
import java.util.Scanner;

public class method {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your score:");
        Double score=input.nextDouble();
        System.out.print("your grade is ");
        printgrade(score);
    }
    public static void printgrade(double score){
        if(score>=60){
            System.out.println("OK");
        }
        else{
            System.out.println("bad.");
        }
    }
}*/

//void方法的调用必须是一条语句，也无return值的返回。但是可以用return语句来结束函数，比如数值输入非法的


/*
public class method {
    public static void main(String[] args){
        int x=6,y=7;
        System.out.println("the first x is "+x+" and the first y is "+y);
        swap(x,y);
    }
    public static void swap(int x,int y){
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("the after x is "+x+" and the after y is "+y);
    }
}*/
//x 和y的参数互换改变只在swap方法之中发生，在main函数中不发生改变，当main函数调用完成之后，就消失了


//重载方法，同一方法类型，但处理的数据不同类型

/*
import java.util.Scanner;

public class method {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("please enter two integer numbers:");
        int n1=input.nextInt();
        int n2=input.nextInt();
        System.out.println("the bigger number between "+n1+" and "+n2+" is "+max(n1,n2));
        System.out.println("please enter two double numbers:");
        Double n3=input.nextDouble();
        Double n4=input.nextDouble();
        System.out.println("the bigger number between "+n3+" and "+n4+" is "+max(n3,n4));
        System.out.println("please enter three double numbers:");
        Double n5=input.nextDouble();
        Double n6=input.nextDouble();
        Double n7=input.nextDouble();
        System.out.println("the biggest number between "+n5+" "+n6+" and "+n7+" is "+max(max(n5,n6),n7));
    }
    public static int max(int x,int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public static double max(double x,double y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
}*/


//abs返回一个数的绝对值


//random方法
//public class method {
//    public static void main(String[] args){
//        System.out.println(50+(int)(Math.random()*50));  //随机生成一个介于50到99的整数
//    }
//}

/*
import javax.swing.JOptionPane;
public class method {
    public static void main(String[] args){
        String input=JOptionPane.showInputDialog(null,"please enter a integer number:");
        int x=Integer.parseInt(input);
        JOptionPane.showMessageDialog(null,"the sum of this number is "+sum(x));
    }
    public static int sum(int x){
        int q1=x/1000;
        int q2=(x%1000)/100;
        int q3=(x%100)/10;
        int q4=x%10;
        return q1+q2+q3+q4;
    }
}*/





