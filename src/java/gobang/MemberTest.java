package gobang;
///**
// * @author :user
// * @createDate :2021/6/22
// * @descrption :（窗体）判断密码是否正确
// */
//public class MemberTest {
//    public static void main(String[] args) {
//        Student admin = new Student("admin", "123456");
//        final MyChessFrame mf = new MyChessFrame();
//        String s1 = JOptionPane.showInputDialog("密码：");
//        for (int x = 1; x < 5; x++) {
//            if (s1.equals(admin.getPassword()) == false) {
//                int js=JOptionPane.showConfirmDialog(mf, "密码错误！");
//                if(js==0 || js==1){
//                    JOptionPane.showInputDialog("密码：");
//                }else {
//                    break;
//                }
//            } else {
//                    JOptionPane.showMessageDialog(mf, "密码正确！");
//                    break;
//                }
//            if(x==3){
//                JOptionPane.showMessageDialog(mf,"你的账号已被冻结！");
//                break;
//            }
//            }
//        }
//    }
//public class MemberTest {
//    public static void main(String[] args){
//        //静态方法main()
//        Student student=new Student();
//        student.name="abc";
////        student.idname="000000000";
//        Student.age ="21";
//        student.id="123";
//        student.email="123";
//        student.info();
//        System.out.println(student.info());
//    }
//}
//public class MemberTest {
//    public static int count = 0;
//    {
//        count++;
//        System.out.println("非静态代码块 count=" + count);
//    }
//    static {
//        count++;
//        System.out.println("静态代码块1 count=" + count);
//    }
//    static {
//        count++;
//        System.out.println("静态代码块2 count=" + count);
//    }
//    public static void main(String[] args) {
//        System.out.println("*************** MemberTest1 执行 ***************");
//        MemberTest sct1 = new MemberTest();
//        System.out.println("*************** MemberTest2 执行 ***************");
//        MemberTest sct2 = new MemberTest();
//    }
//}
//public class MemberTest {
//    void doSomething(){
//        //先声明，再赋值
//        final int a;
//        //只能赋值一次
//        a=12;
//        System.out.print(a);
//        //声明时直接赋值
//        final int b=13;
//    }
//    // 实例常量
//    final int c=11;
//    final int d;
//    // 静态常量
//    final static int e=10;
//    final static int f;
//    // 静态代码块
//    static {
//        // 初始化静态变量
//        f=9;
//    }
//    MemberTest(){
//        // 初始化实例变量
//        d=8;
//    }
//}
//public class MemberTest {
//    //private 方法，因为它仅在当前类中可见，其子类无法访问该方法。但是可以重新定义一个方法名相同的方法   //final将test()密封
//    private final void test(){
//    }
//    //定义的 test() 方法是一个 final 方法，其子类不能重写这个方法
////    public final void test(){
////    }
//    class se extends MemberTest{
//        //重新定义一个方法
//        public void test(){
//        }
//    }
//}
//定义此类不能被继承
//final class MemberTest{
//    class se extends MemberTest{
//    }
//}
//// final 修饰的方法只是不能被重写，完全可以被重载（多态性）
//public class MemberTest {
//    public final void test(){}
//    public final void test(String args){}
//    public final void test(int  se){}
//}
//public class MemberTest {
//    public void test1(){}
//    public static void test2(){}
//    public static void main(String[] args){
//        test2();//直接调用静态方法
//        MemberTest me=new MemberTest();//创建对象调用非静态方法
//        me.test1();
//    }
//}
//public class MemberTest {
//    public static void main(String[] args) {
//        String[] args1={"dadw","eq","eqw"};
//        int n = args1.length;//length统计数组长度   //length()统计字符串中字符个数
//        System.out.println("一共有 " + n + " 个参数");
//        if (n > 0) {
//            // 判断参数个数是否大于0
//            for (int i = 0; i < n; i++) {
//                System.out.println(args1[i]);
//            }
//        }
//    }
//}
//public class MemberTest {
//    public void print(String...names) {//String...names可以传多个参数
//        int count = names.length;    // 获取总个数
//        System.out.println("本次参加考试的有" + count + "人，名单如下：");
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//    }
//    public static void main(String[] args){
//        MemberTest me=new MemberTest();
//        me.print("张强","李成","王勇");
//        me.print("马丽","陈玲");
//    }
//}
//public class MemberTest {
//    public String name;
//    private int age;
//    // 定义带有一个参数的构造方法
//    public MemberTest(String name){
//        this.name=name;
//    }
//    // 定义带有两个参数的构造方法
//    public MemberTest(String name,int age){
//        this.name=name;
//        this.age=age;
//    }
//    @Override
//    public String toString(){
//        return "大家好！我是新来的员工，我叫"+name+"，今年"+age+"岁。";
//    }
//    public static void main(String[] args){
//        // 调用带有一个参数的构造方法
//        MemberTest me=new MemberTest("张强");
//        System.out.println(me);
//        // 调用带有两个参数的构造方法
//        MemberTest me2=new MemberTest("李丽",25);
//        System.out.println(me2);
//    }
//}
//public class MemberTest {
//    private static int counter = 0;
//
//    public MemberTest() {
//        counter++;
//    }
//
//    public int getMemberTest() {
//        return counter;
//    }
//
//    @Override
//    protected void finalize() {
//        counter--;
//        System.out.println("对象销毁");
//    }
//
//    public static void main(String[] args) {
//        MemberTest cnt1 = new MemberTest();    // 建立第一个实例
//        System.out.println("数量：" + cnt1.getMemberTest());    // 输出1
//        MemberTest cnt2 = new MemberTest();    // 建立第二个实例
//        System.out.println("数量：" + cnt2.getMemberTest());    // 输出2
//        cnt2 = null;    // 销毁实例2
//        try{
//            System.gc();// 清理内存
//            Thread.sleep(5000);
//            System.out.println("数量："+cnt1.getMemberTest());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
