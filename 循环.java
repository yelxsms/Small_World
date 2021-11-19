/*public class 循环 {
    public static void main(String[] args){
        int i=0;
        while(i<=3){
            System.out.println("hello,world!");
            i++;
        }
    }
}*/

//猜数字
/*import java.util.Scanner;

public class 循环 {
    public static void main(String[] args){
        int answer=(int)(Math.random()*101);
        Scanner input =new Scanner(System.in);
        System.out.println("please guess a number between 0 and 100:");
        int guess=-1;
        while(guess!=answer){
            guess=input.nextInt();
            if(guess>answer){
                System.out.println("your answer is bigger than the real answer. please try again.");
            }
            else if(guess<answer){
                System.out.println("your answer is smaller than the real answer. please try again.");
            }
            else{
                System.out.println("Error: invaild input. please try again.");
            }

        }

        if(guess==answer){
            System.out.println("you guess right.");
        }

    }
}*/

/*
import  javax.swing.JOptionPane;
public class 循环 {
    public static void main(String[] args){
        int option = JOptionPane.showConfirmDialog(null,"are you a sb?");
        while(option==JOptionPane.NO_OPTION){
            option=JOptionPane.showConfirmDialog(null,"please don't lie, are you a sb?");
        }
        if(option==JOptionPane.YES_OPTION){
            System.out.println("i konw that.");
        }
    }
}*/

/*

//System.out.print输出完内容之后不会换行
public class 循环 {
    public static void main(String[] args){
        int flag=0;
        for(int i=100;i<=1000;i++){
            if(i%5==0||i%6==0){
                System.out.print(i+"\t");
                flag++;
                if(flag%6==0){
                    System.out.print("\n");
                }
            }
        }
    }
}
*/


/*
public class 循环 {
    public static void main(String[] args){
        for(int j=6;j>0;j--) {
            int i = 1;
            while (i <= j) {
                System.out.print(i + " ");
                i++;
            }
            System.out.print("\n");
        }
    }
}*/


