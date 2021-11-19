public class Test {
    public static void main(String[] args){
        Integer a=100;
        Integer b=100;
        System.out.println(a==b);       //在赋值范围之内
        Integer c=1000;
        Integer d=1000;
        System.out.println(c==d);       //这个类只允许赋值-128到128的值，否则就需要创建两个新的对象
    }
}
