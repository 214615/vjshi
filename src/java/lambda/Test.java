package lambda;

/**
 * @Name:Lambda表达式
 * @Function:函数式接口注解 @FunctionalInterface
 * @Shortcomings:如果一个接口中，有且只有一个抽象的方法（Object 类中的方法不包括在内），那这个接口就可以被看做是函数式接口*/
public class Test {
    public static Calculable calculate(char opr){
        Calculable result;
        if(opr=='+'){
//            result=new Calculable() {
//                @Override
//                public int calculateInt(int a, int b) {
//                    return a+b;
//                }
            result=(int a,int b) ->{
                a++;
                int c=a+b;
                return c;
            };
        }else{
//            result=new Calculable() {
//                @Override
//                public int calculateInt(int a, int b) {
//                    return a-b;
//                }
//            };
            result=(int a,int b) ->{
                a++;
                b++;
                int c=a-b;
                return c;
            };
        }
        return result;
    }
    public static void main(String[] args){
        int i=3;
        int j=6;
        Calculable A=calculate('+');
        Calculable B=calculate('-');
        System.out.println(A.calculateInt(i,j));
        System.out.println(B.calculateInt(i,j));
    }
}
