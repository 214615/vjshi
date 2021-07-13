package Automation;
/**
 * @Name：实例内部类
 * @param :实例内部类是指没有用 static 修饰的内部类，有的地方也称为非静态内部类
 * @param :在外部类的静态方法和外部类以外的其他类中，必须通过外部类的实例创建内部类的实例
 * @param :在实例内部类中，可以访问外部类的所有成员
 * @param :在外部类中不能直接访问内部类的成员，而必须通过内部类的实例去访问。如果类 A 包含内部类 B，类 B 中包含内部类 C，则在类 A 中不能直接访问类 C，而应该通过类 B 的实例去访问类 C。
 * @param :外部类实例与内部类实例是一对多的关系，也就是说一个内部类实例只对应一个外部类实例，而一个外部类实例则可以对应多个内部类实例
 * @param :在实例内部类中不能定义 static 成员，除非同时使用 final 和 static 修饰
 *
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
        int a=200;
        int r=k.a1+2;
        int t=k.b1+2;
        int y=k.c1+2;
        int u=k.d1+2;
    /**this.a:调用本身类的变量a*/
/**        int i=this.a;
        String str3=method();
        String str4=method2();
    }
    public static void main(String[] args){
        test body=new External().new test();
        System.out.println(body.a1+"\n"+body.b1+"\n"+body.c1+"\n"+body.d1+"\n"+body.str1+"\n"+body.str2);
        test1 the=new External().new test1();
        System.out.println(the.r+"\n"+the.t+"\n"+the.y+"\n"+the.u+"\n"+the.str3+"\n"+the.str4+"\n"+the.i);
    }
}*/
/**
 * @Name:静态内部类
 * */
//public class External {
//    int a=1;
//    static int b=0;
//    static class Inner{
//        External o=new External();
//        /**访问外部类的实例变量，必须创建实例*/
//        int c=o.a;
//        /**访问外部类静态变量，可以直接访问*/
//        static int d=b;
//    }
//}
//class OtherClass {
//    External.Inner A=new External.Inner();
//    /**访问内部类的实例变量，可通过创建的实例直接进行访问*/
//    int j=A.c;
//    /**访问静态内部类的静态变量，需要通过完整的类名*/
//    int k=External.Inner.d;
//}
/**
 * @Name:局部内部类
 * @Meaning：指在一个方法中定义的内部类
 * @Function：局部内部类只在当前方法中有效
 * @Shortcomings：在局部内部类中只可以访问当前方法中 final 类型的参数与变量//在局部内部类中可以访问外部类的所有成员//如果方法中的成员与外部
 * 类中的成员同名，则可以使用 <OuterClassName>.this.<MemberName> 的形式访问外部类中的成员
 * */
/**
public class External {
    int a=1;
    int j=2;
    public void methd(){
        int a=0;
        final int b=1;
        final int c=2;
        class Inner{
            int a1=a;
            int a2=b;
            int a3=c;
            int a4=External.this.a;
            int a5=j;
        }
    }
}
 */
/**
 * @Name:匿名类
 * @Function:匿名类和局部内部类一样，可以访问外部类的所有成员
 * @Shortcomings:如果匿名类位于一个方法中，则匿名类只能访问方法中 final 类型的局部变量和参数
 * */
/**
class Out {
    void show() {
        System.out.println("调用 Out 类的 show() 方法");
    }
}
public class External {
    int a=1;
    final int b=2;
    private void show(){
        int i;{ // 非静态代码块
            i=1; // 非静态代码块
        }
        // 在这个方法中构造一个匿名内部类
        Out A=new Out(){
          @Override
          void show(){
              System.out.println("调用了匿名类的 show() 方法"+b);
          }
        };
        A.show();
    }
    public static void main(String[] args) {
        External test = new External();
        test.show();
    }
}
 */
/**
 * @Name:Effectively final 功能
 * */
/**
public class External {
    public static void main(String[] args){
        final String name="小邹";
        Runnable A=new Runnable(){
            @Override
            public void run(){
                System.out.println(name);
            }
        };
        A.run();
    }
}
*/