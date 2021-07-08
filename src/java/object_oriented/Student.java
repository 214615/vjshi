package object_oriented;

//public class Student {
//    //创建属性
//    public String name;
//    public int age;
//    private boolean Sex;
//
//    public boolean getSex(){
//        return Sex;
//    }
//    public void setSex(boolean sex){
//        this.Sex=sex;
//    }
//    public StringBuffer printInfo(Student st){//st为标识符
//        StringBuffer sb=new StringBuffer();
//         sb.append(st.name+st.age+st.getSex());
//        return sb;
//    }
//    public static void main(String[] args){
//        //创建实例
//        Student zhang=new Student();
//        zhang.name="张宇";
//        zhang.age=20;
//        String isMan=zhang.getSex()?"女":"男";
//        System.out.println(zhang.name+zhang.age+isMan);
//        Student li=new Student();
//        li.name="李园";
//        li.age=20;
//        li.Sex=true;
//        String isWman=li.getSex()?"女":"男";
//        System.out.println(li.name+li.age+isWman);
//        Student s1=new Student();
//        s1.printInfo();
//    }
//public int add(int x) {
//    x += 30;
//    System.out.println("形参 x 的值："+x);
//    return x;
//}
//    public static void main(String[] args) {
//        int x = 150;
//        System.out.println("调用 add() 方法之前 x 的值："+x);
//        Student t = new Student();
//        int i = t.add(x);
//        System.out.println("实参 x 的值："+x);
//        System.out.println("调用 add() 方法的返回值："+i);
//    }
//}
//    public class Student{
//        private String name;
//        private double salary;
//        private int age;
//        //构造方法
//    public Student(String name,double salary,int age){
//        this.name=name;
//        this.salary=salary;
//        this.age=age;
//    }
//    public static void main(String[] args){
//        //向构造方法里传参数/创建实例
//        Student teache=new Student("小米",299.30,23);
//        System.out.println(teache.name+ teache.age+teache.salary);
//    }
//    }
//public class Student {
//    String name;
//    // 无参构造方法（没有参数的构造方法）
//    public Student() {
//        this("张三");
//    }
//    // 有参构造方法
//    public Student(String name) {
//        this.name = name;
//    }
//    // 输出name和age
//    public void print() {
//        System.out.println("姓名：" + name);
//    }
//    public static void main(String[] args) {
//        Student stu = new Student();
//        stu.print();
//    }
//}
//public class Student {
//    private String name;
//    private int age;
//    //定义构造方法，将属性初始化
//    public Student(String name,int age){
//        this.name=name;
//        this.age=age;
//    }
//    //获取信息方法
//    public void tell(){
//        System.out.println("姓名：" + name + "，年龄：" + age);
//    }
//    public static void main(String[] args){
//        //匿名对象
//        new Student("账单",23).tell();
//    }
//}
// /**
// * @author :user
// * @createDate :2021/6/22
// * @description :创建用户类*/
//public class Student {
//    private String username;
//    private String password;
//    public String getUsername(){
//        return username;
//    }
//    public void setUsername(String username){
//        this.username=username;
//    }
//    public String getPassword(){
//        return password;
//    }
//    public void setPassword(String password){
//        this.password=password;
//    }
//    public Student(String username,String password){
//        this.username=username;
//        this.password=password;
//    }
//    @Override
//    public String toString(){
//        return  "用户名："+username+"\n密码："+password;
//    }
//}
public class Student {
    // 姓名，其访问权限为默认(friendly)
    String name;
    //年龄，定义静态变量
    static String age;
    // 定义私有变量，身份证号码（不同类不能访问、同一个类中可以访问）
    private String idname;
    // 定义受保护变量，学号
    protected String id;
    // 定义共有变量，邮箱
    public String email;
    // 定义共有方法，显示学生信息
    public String info(){
        return"姓名："+name+",年龄："+age+"，身份证号码："+idname+"，学号："+id+"，邮箱："+email;
    }
}