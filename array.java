/*public class array {
    public static void main(String[] args){
        double[] mylist=new double[5];
        mylist[0]=1.5;
        mylist[1]=2.5;
        mylist[2]=32.3;
        mylist[3]=4.32;
        mylist[4]=5.8;

    }
}*/

/*public class array {
    public static void main(String[] args){
        double[] mylist={1.3,4.3,2.4,5425.3};
        for(int i=0;i<4;i++){
            System.out.print(mylist[i]+" ");
        }
    }
}*/


/*

public class array {
    public static void main(String[] args){
        //创建数组
        char[] chars=Creatarray();
        //打印数组
        System.out.println("the lowwercase letters are:");
        displayarray(chars);
        //计算每个字母出现次数
        int[] counts=countletters(chars);
        //打印每个字母出现的次数
        System.out.println("\n");
        System.out.println("the occurences of each letter is:" );
        displaycounts(counts);
    }
    public static char[] Creatarray(){
        //创建数组空间
        char[] chars=new char[100];
        //使用自己定义的RandomCharacter函数随机生成字母
        for(int i=0;i<chars.length;i++){
            chars[i]=RandomCharacter.getRandomLowerCaseLetter();
        }
        return chars;
    }
    public static void displayarray(char[] chars){
        //打印数组值
        for(int i=0;i<chars.length;i++){
            if((i+1)%20==0){
                System.out.println(chars[i]);
            }
            else
                System.out.print(chars[i]+" ");
        }
    }
    public static int[] countletters(char[] chars){
        //计算字母出现次数
        int[] counts=new int[26];
        for(int i=0;i<chars.length;i++){
            counts[chars[i]-'a']++;
        }
        return counts;
    }
    public static void displaycounts(int[] counts){
        //打印counts数组值
        for(int i=0;i<counts.length;i++){
            if((i+1)%10==0){
                System.out.println(counts[i]+" "+(char)(i+'a'));
            }
            else{
                System.out.print(counts[i]+" "+(char)(i+'a')+" ");
            }
        }
    }
}
*/

//二分查找法，数组需要在排序好之后再进行处理
/*

public class array {
    public static int binarySearch(int[] list,int key){
        int low=0;
        int high=list.length-1;
        while(high>=low){
            int mid=(low+high)/2;
            if(key<list[mid]){
                high=mid-1;
            }
            else if(key==list[mid]){
                return mid;
            }
            else
                low=mid-1;
        }
        return -low-1;
    }
}
*/



//选择排序法
/*
public class array {
    public static void select(double[] list){
        for(int i=0;i<list.length;i++){
            double currentmin=list[i];
            int currentminindex=i;
            for(int j=i+1;j<list.length;j++){
                if(currentmin>list[j]){
                    currentmin=list[j];
                    currentminindex=j;
                }
            }
            if(currentminindex!=i){
                list[currentminindex]=list[i];
                list[i]=currentmin;
            }
        }
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
    public static void main(String[] args){
        double[] list={3.6,6.5,13.5,82.6,0.25,9.7};
        select(list);
    }
}*/


//插入排序法















