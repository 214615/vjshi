package automation;

import java.util.InputMismatchException;
import java.util.Scanner;

//public class Triangle extends practice{
//    public Triangle(double a,double b){
//        super(a,b);
//    }
//    @Override
//    public double area(){
//        return (a1*b1)*1/2;
//    }
//}
//public class Triangle {
//    public static void main(String[] args){
//        Scanner input=new Scanner(System.in);
//        int age=input.nextInt();
//        try{
//            if(age<0){
//                throw new practice("您输入的年龄为负数！输入有误！");
//            }else if (age>100){
//                throw new practice("您输入的年龄大于100！输入有误！");
//            }else {
//                System.out.println("您的年龄为："+age);
//            }
//        }catch (InputMismatchException e){
//            System.out.println("输入的年龄不是数字！");
//        }catch (practice e1){
//            System.out.println(e1.getMessage());
//        }
//    }
//}
public class Triangle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("输入用户名：");
        String username=input.next();
        System.out.print("输入密码：");
        String password= input.next();
        External dl=new External();
        boolean a1= dl.validateLogin(username,password);
        if(a1)
            System.out.println("登录成功!");
    }
}