//BMI的计算程序（窗口提示输入显示输出）
/*
import javax.swing.JOptionPane;

public class 选择{
    public static void main(String[] args){
        String height =JOptionPane.showInputDialog("please enter your height；");
        String weight =JOptionPane.showInputDialog("please enter your weight；");
        double BMI=Double.parseDouble(weight)/Math.pow(Double.parseDouble(height),2);
        JOptionPane.showMessageDialog(null,"your BMI is "+(int)(BMI*100/100.00));
        if(BMI<18.5){
            JOptionPane.showMessageDialog(null,"you are a little bit slim");
        }
        if(24<BMI&BMI<27){
            JOptionPane.showMessageDialog(null,"you are a little bit fat");
        }
        if(27<BMI){
            JOptionPane.showMessageDialog(null,"you are too fat");
        }
        else{
            JOptionPane.showMessageDialog(null,"you are very healthy");
        }
    }
}*/


/*
import java.util.Scanner;
import javax.swing.JOptionPane;

public class 选择 {
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);

        int number1=(int)(System.currentTimeMillis()%10);
        int number2=(int)(System.currentTimeMillis()*7%10);

        String result = JOptionPane.showInputDialog(null,"what is "+number1+"+"+number2+"?");
        int res2=Integer.parseInt(result);
        int res = number1  + number2;

        if(res2==res){
            JOptionPane.showMessageDialog(null," Congraduation you are right!");
        }
        else{
            JOptionPane.showMessageDialog(null,"soory, you are wrong.");
        }

    }
}*/




/*
import java.util.Scanner;
import javax.swing.JOptionPane;


public class 选择 {
    public static void main(String[] args){
        String input=JOptionPane.showInputDialog(null,"please enter an integer:");
        int input2=Integer.parseInt(input);
        if(input2%5==0){
            JOptionPane.showMessageDialog(null,"HiFive");
        }
        if(input2%2==0){
            JOptionPane.showMessageDialog(null,"HiEven");
        }

    }
}*/


/*

import javax.swing.JOptionPane;

public class 选择 {
    public static void main(String[] args){
        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);
        if(number1<number2){
            int temp;
            temp=number1;
            number1=number2;
            number2=temp;
        }

        String input=JOptionPane.showInputDialog(null,"what is "+number1+"-"+number2+"?");

        int res=Integer.parseInt(input);
        int result = number1-number2;

        if(result==res){
            JOptionPane.showMessageDialog(null,"you are right");
        }
        else
            JOptionPane.showMessageDialog(null,"you are wrong");

    }
}
*/


//自助售货机
/*
import java.util.Scanner;

public class 选择 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("1.哇哈哈\n2.奥力给\n3.格瓦斯\n4.脉动\n5.可口可乐\n请选择：");
        int choice=input.nextInt();
        switch (choice){
            case 1:System.out.println("1.  哇哈哈  4元");break;
            case 2:System.out.println("2.  奥力给  3.5元");break;
            case 3:System.out.println("3.  格瓦斯  4元");break;
            case 4:System.out.println("4.  脉动  5元");break;
            case 5:System.out.println("5.  可口可乐  3元");break;
            default:System.out.println("Errors: invalid status.");
            System.exit(0);
        }
    }
}*/



//GUI确认对话框

/*import javax.swing.JOptionPane;

public class 选择 {
    public static void main(String[] args){
        int answer = JOptionPane.showConfirmDialog(null,"can you understand my words?");
        if(answer==JOptionPane.YES_OPTION){
            System.out.println("ok, you are a good boy.");
        }
        else{
            System.out.println("sad");
        }

    }
}*/


