
/*public class Strings {
    public  static void main(String[] args){
        String sj="hello java!";
        System.out.println(sj);
    }
}*/


//s1和s2虽然内容相同，但并不是相同的字符串对象
/*
public class Strings {
    public static void main(String[] args){
        String s1="hello java";
        String s2=new String("hello java");
        String s3="hello java";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("s1==s2 is "+(s1==s2));
        System.out.println("s1==s3 is "+(s1==s3));
    }
}*/

import javax.sound.midi.SysexMessage;
import java.util.Locale;

//字符串操作
/*
public class Strings {
    public static void main(String[] args){
        String s1="welcome to java";
        String s2=new String("welcome to java");
        String s3="welcome to c++";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.length());//length是一个方法，但是也是数组对象的一个属性，空格也需要占用内存空间
        System.out.println(s1.charAt(3));//返回第n+1个位置的字符
        System.out.println(s1.substring(0,3));//返回前三个字符组成的字符串
        String s4=s1+" "+s2+" "+s3;//java的字符串可以直接相加
        System.out.println(s4);
        String a="i Am A COLLegE StUdeNt";
        System.out.println(a.toLowerCase(Locale.ROOT));//大小写转换函数
        System.out.println(a.toUpperCase(Locale.ROOT));
        System.out.println(a.replace('e','S'));
        System.out.println(a.replaceFirst("A","K"));//注意需要使用双引号

    }
}*/

//字符串按照模式匹配，jav.*表示正则表达式，代表以java开头的字符串
/*public class Strings {
    public static void main(String[] args){
        System.out.println("java is ok".matches("java.*"));
        System.out.println("java okdoa".matches("java.*"));
        System.out.println("javaksds".matches("java.*"));
        System.out.println("welcome to java.".indexOf('t'));
        System.out.println("welcome to java.".indexOf('o',5));//返回第5列之后的第一个o的下标
        System.out.println("welcome to java.".indexOf("to"));
    }
}*/


//字符串和数组之间的相互转换
/*public class Strings {
    public static void main(String[] args){
        char[] yep="hello, my name is susan.".toCharArray();
        for(int i=0;i<yep.length;i++){
            System.out.print(yep[i]+" ");
        }
        System.out.println();
        String gap=new String(new char[]{'h','e','l','l','o'});
        System.out.println(gap);
    }
}*/


/*import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter a string");
        String a=input.nextLine();
        System.out.println(a);

        char[] char_2=a.toCharArray();
        for(int l=0;l<char_2.length;l++)
            System.out.print(char_2[l]);

        char[] char_1=new char[a.length()];


        for(int i=a.length(),j=0;i>=0;i--,j++){
            char_1[j]=char_2[i];
        }
        String new_a=new String(char_1);
        System.out.println(a.equals(new_a));
    }
}*/

//判断字母大小写函数Character.isUpperCase()    Character.isLowerCase()
/*public class Strings {
    public static void main(String[] args){
        char c='F';
        System.out.println(Character.isUpperCase(c));
    }
}*/


/*public class Strings {
    public static void main(String[] args){
        System.out.println("Number of string is "+args.length);
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}*/


//输入string计算字母出现次数

/*import javax.swing.JOptionPane;

public class Strings {
    public static void main(String[] args){
        String input=JOptionPane.showInputDialog(null,"please enter the char you want to count:");
        String str=JOptionPane.showInputDialog(null,"please enter a string:");
        char[] char_str=str.toCharArray();
        char[] char_str_2=input.toCharArray();
        char ds=char_str_2[0];
        int count=0;
        for(int i=0;i<char_str.length;i++){
            if(char_str[i]==ds){
                count=count+1;
            }
        }
        JOptionPane.showMessageDialog(null,"the char "+ds+" shows "+count+" timmes in this string.");
    }
}*/




import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
public class Strings {
    public static void main(String[] args) throws  Exception{
        String guessnumber="phenomenon";
        char[] char_guess=guessnumber.toCharArray();
        char[] char_star=new char[char_guess.length];

        for(int i=0; i<char_guess.length;i++){
            char_star[i]='*';
        }
        String starString=String.copyValueOf(char_star);
        while (!guessnumber.equals(starString)) {
            System.out.print("please guess a char of the ");
            for(int i=0;i<char_star.length;i++){
                System.out.print(char_star[i]);
            Scanner input=new Scanner(System.in);
            char guess_char=(char)System.in.read();
            int guesschar_lownumber=guessnumber.indexOf(guess_char);
            char_star[guesschar_lownumber]=guess_char;
            }
        }

    }
}


