public class TestStackOfIntegers {
    public static void main(String[] args){
        StackOfIntegers stack= new StackOfIntegers();
        for(int i=0;i<10;i++)
            stack.push(i);
        System.out.print("STACK_PUSH_TURN_IS:  ");
        for(int j=0;j<10;j++){
            System.out.print(j+" ");
        }
        System.out.print(" \n"+"STACK_POP_TURN_IS:  ");
        while(!stack.empty())
            System.out.print(stack.pop()+" ");
    }
}
