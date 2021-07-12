package Interface;

public class MathClass implements IMath{
    private int num1;
    private int num2;
    public MathClass(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    @Override
    public int sum(){
        return num1+num2;
    }
    @Override
    public int naxMan(int a, int b) {
        if(a>b){
            return a;
        }else if(a==b){
            return 0;
        }else {
            return b;
        }
    }
}
