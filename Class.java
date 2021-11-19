//对象是类的实例
/*
public class Class {
    public static void main(String[] args) {
        Cricle cricle1 = new Cricle();
        System.out.println("the area of the " + cricle1.radius + " is " + cricle1.getArea());
        Cricle cricle2 = new Cricle(25);
        System.out.println("the area of the " + cricle2.radius + " is " + cricle2.getArea());
        Cricle cricle3 = new Cricle(125);
        System.out.println("the area of the " + cricle3.radius + " is " + cricle3.getArea());
    }
}
class Cricle{
    double radius;
    Cricle(){
        radius=1.0;
    }
    Cricle(double newradius){
            radius=newradius;
    }
    double getArea(){
        return radius*radius*Math.PI ;
    }

}
*/


/*

public class Class {
    int channel=1;
    int volumeLevel=1;
    boolean on =false;
    public Class(){
    }
    public void turnOn(){
        on =true;
    }
    public void turnOff(){
        on = false;
    }
    public void setChannel(int newChannel){
        if(on&&newChannel>=1&&newChannel <=120)
            channel=newChannel;
    }
    public void setVolume(int newVolumeLevel){
        if(on&&newVolumeLevel>=1&&newVolumeLevel<=7){
            volumeLevel=newVolumeLevel;
        }
    }
    public void channelUp(){
        if(on&&channel<120)
            channel++;
    }
    public void channel(){
        if(on&&channel>1)
            channel--;
    }
    public void volumeUp(){
        if(on&&volumeLevel<7)
            volumeLevel++;
    }
    public void volumeDown(){
        if(volumeLevel>1&&on)
            volumeLevel--;
    }
    public static void main(String[] args) {
        Class tv1 = new Class();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(4);

        Class tv2=new Class();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        tv2.volumeDown();

        System.out.println("tv1's channel is "+tv1.channel+" and it's volumelevel is "+tv1.volumeLevel);
        System.out.println("tv2's channel is "+tv2.channel+" and it's volumelevel is "+tv2.volumeLevel);
    }
}*/


//GUI
/*

import javax.swing.JFrame;

public class Class{
    public static void main(String[] args){
        JFrame framel=new JFrame();
        framel.setTitle ("Window 1");
        framel.setSize(900,500);
        framel.setLocation(5,100);
        framel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framel.setVisible(true);

        JFrame framel2=new JFrame();
        framel2.setTitle ("Window 2");
        framel2.setSize(900,500);
        framel2.setLocation(895,100);
        framel2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framel2.setVisible(true);
    }
}*/

import javax.swing.*;
public class Class {
    public static void main(String[] args){
        //确认取消按钮
        JButton jbtOK=new JButton("OK");
        JButton jbCancel=new JButton("Cancel");
        //提示输入的标签
        JLabel jlblName=new JLabel("enter your name:");
        //开辟一块field用以输入name
        JTextField jtfName=new JTextField("type name here");
        //是否加粗
        JCheckBox jchkBlod=new JCheckBox("Bold");
        //是否斜体
        JCheckBox jchkItalic= new JCheckBox("Italic");
        //颜色
        JRadioButton jrbYellow =new JRadioButton("Yellow");
        //复合选项框
        JComboBox jcboColor=new JComboBox(new String[]{"Freshman","Sophomore","Junior","Senior"});
        //创建一个面板对象
        JPanel panel=new JPanel();
        panel.add(jbtOK);
        panel.add(jbCancel);
        panel.add(jlblName);
        panel.add(jtfName);
        panel.add(jchkBlod);
        panel.add(jchkItalic);
        panel.add(jrbYellow);
        panel.add(jcboColor);
        //程序搭建框架，并将刚才的面板加入刚才的框架之中
        JFrame frame=new JFrame();
        frame.add(panel);
        frame.setTitle("Show GUI Components");
        frame.setSize(450,100);
        frame.setLocation(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}