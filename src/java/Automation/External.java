package Automation;

public class External {
    public int a=100;
    static int b=100;
    final int c=100;
    private int d=100;
    public String method(){
        return "实例方法1";
    }
    public static String method2(){
        return "静态方法2";
    }
    class test{
        int a1=a+1;
        int b1=b+1;
        int c1=c+1;
        int d1=d+1;
        String str1=method();
        String str2=method2();
    }
    class test1{
        External.test k=new test();
        int r=k.a1+2;
        int t=k.b1+2;
        int y=k.c1+2;
        int u=k.d1+2;
        int i=a;
        String str3=method();
        String str4=method2();
    }
    public static void main(String[] args){
        test body=new External().new test();
        System.out.println(body.a1+"\n"+body.b1+"\n"+body.c1+"\n"+body.d1+"\n"+body.str1+"\n"+body.str2);
        test1 the=new External().new test1();
        System.out.println(the.r+"\n"+the.t+"\n"+the.y+"\n"+the.u+"\n"+the.str3+"\n"+the.str4+"\n"+the.i);
    }
}
