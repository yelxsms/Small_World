/*
//提示输入初始化数组
import java.util.Scanner;
public class arrays {
    public static void main(String[] args){
        int[][] matrix=new int[10][10];
        Scanner input=new Scanner(System.in);
        System.out.println("please enter "+matrix.length+" rows and "+matrix[0].length+" columns.");
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=input.nextInt();
            }
        }
    }

}
*//*


*/
/*

public class arrays {
    public static void main(String[] args){
        int[][] matrix=new int[10][10];
        for(int rows=0;rows<matrix.length;rows++){
            for(int columns=0;columns<matrix[rows].length;columns++){
                matrix[rows][columns]=(int)(Math.random()*100);
            }
        }
        int flags=1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++,flags++){
                System.out.print(matrix[i][j]+" ");
                if(flags% matrix.length==0){
                    System.out.println();
                }
            }
        }
    }
}*//*




//给方法传递二维数组
*/
/*

import java.util.Scanner;
public class arrays {
    public static void main(String[] args){
        int[][] matrix=new int[3][4];
        Scanner input=new Scanner(System.in);
        System.out.println("please enter "+matrix.length+" rows and "+matrix[0].length+" columns.");
        for(int rows=0;rows<matrix.length;rows++){
            for(int columns=0;columns<matrix[rows].length;columns++){
                matrix[rows][columns]=input.nextInt();
            }
        }
        System.out.println("the sum of the matrix is "+sum(matrix));
    }
    public static int sum(int[][] matrix){
        int total=0;
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){

                total+=matrix[i][j];
            }
        }
        return total;
    }
}*//*


*/
/*

import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a 4*4 matrix：");
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int columns = 0; columns < matrix[rows].length; columns++) {
                matrix[rows][columns] = input.nextInt();
            }
        }
        int flag = 1;
        System.out.println();
        System.out.println("your matrix:");
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int columns = 0; columns < matrix[rows].length; columns++, flag++) {
                System.out.print(matrix[rows][columns]+" ");
                if (flag % matrix.length == 0) {
                    System.out.println();
                }
            }
        }
        int total = 0;
        for (int n = 0; n < matrix.length; n++) {
            total += matrix[n][n];
        }
        System.out.println("the sum of the main line of the matrix is  " + total);
    }
}
*//*



//定位二位数组的最大值并确定其位置
import java.util.Scanner;
public class arrays {
    public static void main(String[] args){
        int[][] matrix = new int[5][5];
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a 5*5 matrix：");
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int columns = 0; columns < matrix[rows].length; columns++) {
                matrix[rows][columns] = input.nextInt();
            }
        }
        int max=0;
        int maxrow=0;
        int maxcolumn=0;
        for(int rows=0;rows<matrix.length;rows++){
            for(int columns=0;columns<matrix[rows].length;columns++){
                if(matrix[rows][columns]>max){
                    max=matrix[rows][columns];
                    maxrow=rows;
                    maxcolumn=columns;
                }
            }
        }
        System.out.println("the max number size is ["+maxrow+"]["+maxcolumn+"] and it's value is "+max);
    }
}*/
