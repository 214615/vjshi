package automation;

//public class practice {
//    @Test
//    public void a(){
//        for(int i=0;i<5;i++){
//            System.out.println(i);
//            Assert.assertTrue(true);//判断是否为真：为真继续执行，为假直接抛出异常
//        }
//    }
//    //没有预期异常
//    @Test
//    public void b(){
//        throw new RuntimeException();
//    }
//    //有预期异常，但是测试方法没有抛出该异常
//    @Test(expectedExceptions = RuntimeException.class)
//    public void b1(){
//        System.out.println("有异常，没有抛出该异常");
//    }
//    // 有预期异常，且测试方法抛出了该异常
//    @Test(expectedExceptions = RuntimeException.class)
//    public void b2(){
//        System.out.println("这是一个成功的异常测试！");
//        throw new RuntimeException();
//    }
//    @Test(enabled = false)
//    public void test(){
//        System.out.println("忽略测试");
//    }
////构造方法，如果类中定义了toString()方法，则在调用该类对象时，将会自动调用该方法
//    public String name;
//    private int age;
//    public practice(String name){
//        this.name=name;
//    }
//    public practice(String name,int age){
//        this.name=name;
//        this.age=age;
//    }
//    @Override
//    public String toString(){
//        return "大家好！我是新来的员工，我叫"+name+"，今年"+age+"岁。";
//    }
//    public String info(){
//        return "大家好！!我是新来的员工，我叫"+name+"，今年"+age+"岁。";
//    }
//}
//public class practice {
    //    private int count=0;
//    public practice(){
//        this.count++;
//    }
//    public int getCount(){
//        return this.count;
//    }
//    @Override
//    protected void finalize() throws Throwable {
//        this.count--;
//        System.out.println("对象销毁");
//    }
//    public static void main(String[] args){
//        encapsulation en=new encapsulation();
//        en.setAddres("河北省石家庄市");
//        en.setPhone("13653835964");
//        en.setAge(12);
//        en.setName("王丽丽");
//        System.out.println(en.getName());
//        System.out.println(en.getAge());
//        System.out.println(en.getPhone());
//        System.out.println(en.getAddres());
//    }
//    private String Bookname;
//    private int pagelbtalNum;
//    public String getBookname(){
//        return Bookname;
//    }
//    public void setBookname(String Bookname){
//        this.Bookname=Bookname;
//    }
//    public int getPagelbtalNum(){
//        return pagelbtalNum;
//    }
//    public void setPagelbtalNum(int pagelbtalNum) {
//        if (pagelbtalNum < 200) {
//            System.out.println(this.Bookname + "这本书的页数不能少于 200 页");
//            this.pagelbtalNum = 200;
//        } else {
//            this.pagelbtalNum = pagelbtalNum;
//        }
//    }
//    public void details(){
//        System.out.println(this.Bookname + "这本书的总页数是：" + this.pagelbtalNum);
//    }
//    public static void main(String[] args){
//        practice em=new practice();
//        em.setBookname("《红与黑》");
//        em.setPagelbtalNum(190);
//        em.details();
//        practice em1=new practice();
//        em1.setBookname("《格林童话》");
//        em1.setPagelbtalNum(500);
//        em1.details();
//    }
//    public String name;
//    public int age;
//    public String sex;
//    public String sn;
//    public static String test;
//
//    public practice(String name, int age, String sex, String sn) {
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.sn = sn;
//    }
//
//    @Override
//    public String toString() {
//        return "姓名：" + name + "\n年龄：" + age + "\n性别：" + sex + "\n身份证号：" + sn;
//    }

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;
import java.util.WeakHashMap;

//    public void eat() {
//        System.out.println(name);
//    }
//
//    public static void eta2() {
//        System.out.println("test");
//    }
//
//    public static class cat extends practice {
//        public String name;
//        public String str;
//        public static String sta;
//        @Override
//        public void eat() {
//            System.out.println("name");
//        }
//
//        public static void eta2() {
//            System.out.println(sta);
//        }
//
//        public void str() {
//            System.out.println(str);
//        }
//    }
//    public static void main(String[] args) {
//        practice a = new cat();//向上转型
//        cat b = (cat) a;//向下转型
//        System.out.println(b.name);
//        a.eat();
//        eta2();
//        b.str();
//    }
//}
//        public static class practice1 extends practice{
//            private String id;
//            private String department;
//            public practice1(String name, int age, String sex, String sn, String id, String department) {
//                super(name, age, sex, sn);
//                this.id=id;
//                this.department=department;
//            }
//            @Override
//            public String toString(){
//                return "姓名：" + name + "\n年龄：" + age + "\n性别:" + sex + "\n身份证号：" + sn + "\n学号：" + id + "\n所学专业：" + department;
//            }
//                public static class test extends practice1{
//                private String code;
//                    public test(String name,int age,String sex,String sn,String id,String department,String code){
//                    super(name,age,sex,sn,id,department);
//                    this.code=code;
//                }
//                @Override
//                public String toString(){
//                    return "姓名：" + name + "\n年龄：" + age + "\n性别:" + sex + "\n身份证号：" + sn + "\n学号：" + super.id + "\n所学专业：" + super.department+"\ncode:"+code;
//                }
//                }
//        }
//        public static class practice2 extends practice{
//            private int tYear;
//            private String tDept;
//        public practice2(String name, int age, String sex, String sn, int tYear, String tDept){
//            super(name,age,sex,sn);
//            this.tYear=tYear;
//            this.tDept=tDept;
//        }
//        @Override
//        public String toString(){
//            return "姓名：" + name + "\n年龄：" + age + "\n性别:" + sex + "\n身份证号：" + sn + "\n教龄：" + tYear + "\n所教专业：" + tDept;
//        }
//    }
//    public static void main(String[] args){
//        practice a1=new practice1("王丽丽", 23, "女", "410521198902145589", "00001", "计算机应用与技术");
//        System.out.println(a1);
//        practice a2=new practice2("张文", 30, "男", "410521198203128847", 5, "计算机应用与技术");
//        System.out.println(a2);
//        practice1 a3=new practice1.test("王丽丽", 23, "女", "410521198902145589", "00001", "计算机应用与技术","fqwuhfiufirfiurhf324234");
//        System.out.println(a3);
//    }
//}
//public class practice {
//    public String name;
//    public int age;
//    private String phone;
//    private String addres;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getAddres() {
//        return addres;
//    }
//
//    public void setAddres(String addres) {
//        this.addres = addres;
//    }
//    public static void main(String[] args) {
//        practice en = new practice();
//        en.setName("jeck");
//        en.setAge(22);
//        en.setPhone("17790441715");
//        en.setAddres("四川成都");
//        System.out.println(en.getPhone());
//        System.out.println(en.getAge());
//        System.out.println(en.getPhone());
//        System.out.println(en.getAddres());
//    }
//}
//#################面向对象多态####################
//public class practice{
//    double a1,b1;
//    public practice(double a,double b){
//        this.a1=a;
//        this.b1=b;
//    }
//    public double area(){
//        return 0;
//    }
//}
//##############抽象类################
//public abstract class practice {
//    public double a1,b1;
//     public practice(double a, double b){
//        this.a1=a;
//        this.b1=b;
//    }
//     public abstract double area();
//}
//自定义异常类
public class practice extends Exception{
    public practice(){
        super();
    }
    public practice(String s){
        super(s);
    }
}
