package anomaly;
/**
//通过无限递归演示堆栈溢出错误
public class Overflow_Error {
    public static void rest(int i){
        if(i==0){
            return;
        }else{
            rest(i++);
        }
    }
}
class ErrorEg {
    public static void main(String[] args){
        Overflow_Error.rest(5);
    }
}*/
/**
 * @param :admin
 * 异常处理通过 5 个关键字来实现：try、catch、throw、throws 和 finally
 * try catch 语句用于捕获并处理异常
 * finally 语句用于在任何情况下（除特殊情况外）都必须执行的代码
 * throw 语句用于拋出异常
 * throws 语句用于声明可能会出现的异常*/

/**
 * @param :异常处理程序基本结构
 * try{
    catch(ExceptionType1 e){
        }catch(ExceptionType2 e){
        throw(e);//抛出异常
        }
        }finally{//释放资源代码块
        }
 */

/**
 * @param :try catch 语句
 * try{
 *      // 可能发生异常的语句
 * catch(ExceptionType e){
 *     // 处理异常语句
 *      }
 * }*/
//public class Overflow_Error {
//    public static void main(String[] args){
//        String Name;
//        int Age;
//        String Sex;
//        Scanner scanner=new Scanner(System.in);
//        try{
//            System.out.printf("输入名字：");
//            Name=scanner.next();
//            System.out.printf("输入年龄：");
//            Age=scanner.nextInt();
//            System.out.printf("输入性别：");
//            Sex=scanner.next();
//        }catch (Exception e){
//            e.printStackTrace();
//            System.out.println("输入有误！");
//        }
//    }
//}
/**
 * @param :admin
 * 在多个 catch 代码块的情况下，当一个 catch 代码块捕获到一个异常时，其它的 catch 代码块就不再进行匹配
 * 当捕获的多个异常类之间存在父子关系时，捕获异常时一般先捕获子类，再捕获父类。所以子类异常必须在父类异常的前面，否则子类捕获不到
public class Overflow_Error {
    public static void main(String[] args) {
        Date date = readDate();
        System.out.println("读取的日期 = " + date);
    }
    public static Date readDate() {
        FileInputStream readfile = null;
        InputStreamReader ir = null;
        BufferedReader in = null;
        try {
            readfile = new FileInputStream("readme.txt");
            ir = new InputStreamReader(readfile);
            in = new BufferedReader(ir);
            // 读取文件中的一行数据
            String str = in.readLine();
            if (str == null) {
                return null;
            }
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date date = df.parse(str);
            return date;
        } catch (FileNotFoundException e) {
            System.out.println("处理FileNotFoundException...");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("处理IOException...");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("处理ParseException...");
            e.printStackTrace();
        }
        return null;
    }
}
 */
/**
 * @param :try catch finally 语句
 * try{
 *    // 可能会发生异常的语句
 * }catch(ExceptionType e){
 *     // 处理异常语句
 * }finally{
 *     // 清理代码块
 * }
 * 使用 try-catch-finally 语句时需注意以下几点：
 * 异常处理语法结构中只有 try 块是必需的，也就是说，如果没有 try 块，则不能有后面的 catch 块和 finally 块；
 * catch 块和 finally 块都是可选的，但 catch 块和 finally 块至少出现其中之一，也可以同时出现；
 * 可以有多个 catch 块，捕获父类异常的 catch 块必须位于捕获子类异常的后面；
 * 不能只有 try 块，既没有 catch 块，也没有 finally 块；
 * 多个 catch 块必须位于 try 块之后，finally 块必须位于所有的 catch 块之后。
 * finally 与 try 语句块匹配的语法格式，此种情况会导致异常丢失，所以不常见
public class Overflow_Error {
    public static void main(String[] args){
        String[] obj={"记事本", "计算器", "浏览器" };
        try{
            for(int i=0;i<3;i++){
                System.out.println(i + 1 + "：" + obj[i]);
            }Scanner input=new Scanner(System.in);
            System.out.println("是否运行程序：");
            String Enter=input.next();
            if(Enter.equals("y")){
                System.out.println("请输入程序编号：");
                int  no=input.nextInt();
                System.out.println("正在运行程序[" + obj[no - 1] + "]");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("谢谢使用!");
        }
    }
}*/

import java.util.Scanner;

/**
 * @param :throw 拋出异常
 * */
//在某仓库管理系统中，要求管理员的用户名需要由 8 位以上的字母或者数字组成，不能含有其他的字符。当长度在 8 位以下时拋出异常，并显示异常信息；当字符含有非字母或者数字时，同样拋出异常，显示异常信息
public class Overflow_Error {
    boolean validateUserName(String username){
        boolean e=false;
        if(username.length()>8){
            for(int i=0;i<username.length();i++) {
                char cha = username.charAt(i);
                if((cha>='0' && cha<='9') || (cha>='a' && cha<='z') || (cha>='A' && cha<='Z')){
                    e=true;
                }else{
                    e=false;
                    throw new IllegalArgumentException("用户名只能由字母和数字组成！");
                }
            }
        }else{
            throw new IllegalArgumentException("用户名长度必须大于 8 位！");
        }
        return e;
    }
    public static void main(String[] args){
        Overflow_Error Mistake=new Overflow_Error();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username=input.next();
        try{
            boolean e=Mistake.validateUserName(username);
            if(e){
                System.out.println("用户名输入正确！");
            }
        }catch (IllegalArgumentException k){
            System.out.println(k);
        }finally {
            System.out.println("再见！！！");
        }
    }
}