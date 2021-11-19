public class Class_BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static  final double KILOGRAMS_PER_POUND=0.45359237;
    public static  final double METERS_PER_INCH=0.0254;

    public Class_BMI(String name, int age,double weight,double height){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
    }
    public Class_BMI(String name,double height,double weight){
        this(name,20,weight,height);
    }
    public double getBMi(){
        double bmi=weight*KILOGRAMS_PER_POUND/((height*METERS_PER_INCH)*(height*METERS_PER_INCH));
        return Math.round(bmi*100)/100.0;
    }
    public String getStatus(){
        double bmi=getBMi();
        if(bmi<16){
            return "seriously underweight";
        }
        else if(bmi<18)
            return "underweight";
        else if(bmi<24)
            return "normal weight";
        else if(bmi<35)
            return "seriously overweight";
        else
            return "gravely overweight";
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }
    public static void main(String[] args){
        Class_BMI bmi1=new Class_BMI("yelei",20,80,183);
        System.out.println("the BMI for "+bmi1.getName()+" is "+bmi1.getBMi()+" "+bmi1.getStatus());
    }
}

