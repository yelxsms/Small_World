//创建文件操作
/*public class word {
    public static void main(String[] args){
        java.io.File file=new java.io.File("D:\\javafiletest.txt");
        System.out.println("Does it exist?    "+file.exists());
        System.out.println("the file has "+file.length()+" bytes.");
        System.out.println("absolute path :"+file.getAbsolutePath());
    }
}*/

//使用PrintWriter写入数据
/*
public class word {
    public static void main(String[] args) throws Exception{
        java.io.PrintWriter output=new java.io.PrintWriter("D:\\javafiletest.txt");

        output.print(" are you OK?");
        output.close();
    }
}*/

//Scannner读取数据
/*import java.util.Scanner;
public class word {
    public static void main(String[] args)throws Exception{
        Scanner input=new Scanner("D:\\javafiletest.txt");
        while(input.hasNext()){
            String firstname=input.next();
            String n2=input.next();
            String n3=input.next();
            String n4=input.next();
            System.out.println(firstname+n2+n3+n4);
        }
    }
}*/


/*
import java.util.Scanner;
import javax.swing.JFileChooser;
public class word {
    public static void main(String[] args)throws  Exception{
        JFileChooser filechooser=new JFileChooser();
        if(filechooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            java.io.File file=filechooser.getSelectedFile();
            Scanner input=new Scanner(file);
            while(input.hasNext()){
                System.out.println(input.nextLine());
            }
            input.close();
        }
        else
            System.out.println("No file selected");
    }
}*/


