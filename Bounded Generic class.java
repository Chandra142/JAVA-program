//5. WAP for bounded type in GENRIC class to do the addition of two numbers ? 

class calculator < T extends Number>{
    private T num1;
    private T num2;
    
    public calculator(T num1, T num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double add(){
        return num1.doubleValue() + num2.doubleValue();
    }
}
public class Main{
    public static void main(String[] args){
        calculator <Integer>intCal = new calculator<>(10,20);
        System.out.println("Result is: "+ intCal.add());
    }
}
