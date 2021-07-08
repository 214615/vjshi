

//#######if语句判断#######
//public class Main {
//    public static void main(String[] args) {
//        System.out.print("输入数字:");
//        Scanner a=new Scanner(System.in);
//        int b=a.nextInt();
//        if(b>100){
//            System.out.println("太大");
//        }
//        if(b<100){
//            System.out.println("太小");
//
//        }
//        if(b==100){
//            System.out.println("刚好");
//        }
//    }
//}
//#########for+if判断语句#######
//public class Main {
//    public static void main(String[] args){
//        System.out.print("请输入数字：");
//        for(int c=0;c<10;c++){
////            System.out.print("请重新输入数字：");
//            Scanner a=new Scanner(System.in);
//            int b=a.nextInt();
//            if(b==100){
//                System.out.println("正确");
//                break;
//            }
//            if(b<100){
//                System.out.println("太小");
//            }
//            if(b>100){
//                System.out.println("太大");
//            }
//            System.out.print("请重新输入数字：");
//        }
//    }
//}
//#######if判断语句/登录#######
//#####第一种#####
//public class Main {
//    public static void main(String[] args){
//        for(int d=0;d<99;d++){
//            Scanner a=new Scanner(System.in);
//            System.out.print("输入用户名：");
//            String name=a.next();
//            if(name.equals("admin")){
//                System.out.print("请输入密码:");
//                String password=a.next();
//                if(password.equals("qwer123456")){
//                    System.out.print("请输入验证码：");
//                    String code=a.next();
//                    if(code.equals("0101")){
//                        System.out.println("登录成功!!!");
//                        break;
//                    }
//                    else{
//                        System.out.println("验证码错误,请重新输入");
//                    }
//                }else{
//                    System.out.println("密码错误，请重新输入");
//                }
//            }else{
//                System.out.println("用户名错误，请重新输入");
//            }
//        }
//    }
//}
//######第二种######
//public class Main{
//    public static void main(String[] args){
//        int c=0;
//        for(int a=1;a<6;a++) {
//            c = 1 + c;
//            Scanner b = new Scanner(System.in);
//            System.out.print("请输入用户名：");
//            String name = b.next();
//            System.out.print("请入密码：");
//            String password = b.next();
//            System.out.print("请输入验证码：");
//            String code = b.next();
//            if (name.equals("admin") && password.equals("qwer123456") && code.equals("1010")) {
//                System.out.println("登录成功！！！");
//                break;
//            } else {
//                System.out.println("登录失败");
//            }
//            if (c == 5) {
//                System.out.println("账号密码已错误" + c + "次账号已被冻结!!!");
//            }
//        }
//    }
//}
//#######自动化#######
//public class Main {
//    public static void main(String[] args) throws Exception{
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.blockbox.ink");
//        driver.findElement(By.xpath("(//a[@href='javascript:;'])[1]")).click();
//        driver.findElement(By.xpath("(//p[@class='chakra-text css-0'])[2]")).click();
//        driver.findElement(By.xpath("//input[@id='field-25']")).sendKeys("15892587377");
//        driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
//        Thread.sleep(2000);//线程休眠
//        driver.quit();
//    }
//}
//######装箱和封箱######
//public class Main {
//    public static void main(String[] args){
//        int a=100;
//        Integer c=a;
//        int d=c;
//        System.out.println("d="+d);
//        Integer c1=100;
//        System.out.println("c等价于c1返回结果为"+c.equals(c1));
//    }
//}
//######引用变量######
//public class Main{
//    public static void main(String[] args){
//        //创建类的对象
//        DATA a=new DATA();
//        // 对象名.变量名调用实例变量（全局变量）
//        System.out.println(a.name);
//        System.out.println(a.age);
//        // 对象名.变量名调用静态变量（类变量）
//        System.out.println(a.website);
//        System.out.println(a.url);
//        // 类名.变量名调用静态变量（类变量）
//        System.out.println(DATA.website);
//        System.out.println(DATA.url);
//    }
//}
//方法参数变量
//public class Main{
//    //声明方法参数变量
//    public static void testFUN(int n){
//        System.out.println(n);
//    }
//    public static void main(String[] args){
//        testFUN(99);//调用方法传参
//    }
//}
//代码快局部变量
//public class Main {
//    public static void test(){
//        try {
//            System.out.println("你好 java");
//            throw new NullPointerException("test");//手动触发异常
////            System.out.println("Hello!");
//        }catch (NullPointerException a){
//            a.printStackTrace();
//            System.out.println("Hello!1");
//        }
//    }
//    public static void main(String[] args) {
//        test();
//    }
//}
//######获取当前时间是星期几######
//public class Main {
//    public static void main(String[] args){
//        Calendar calendar=Calendar.getInstance();//获取当前时间
//        int a=calendar.get(Calendar.DAY_OF_WEEK)-1;//获取星期的第几日
//    }
//}
//######九九乘法表######
//public class Main {
//    public static void main(String[] aegs){
//        for(int a=1;a<10;a++){
//            for(int b=1;b<=a;b++){
//                System.out.print(a+"*"+b+"="+a*b+"\t");//"\t" 每次结束之后增加一个空格
//            }System.out.println();//循环结束后，进行换行
//        }
//    }
//}
//######杨辉三角形######
//public class Main {
//    public static int num(int x,int y){
//        if(y==1||y==x){
//            return 1;
//        }
//        int c=num(x-1,y-1)+num(x-1,y);
//        return c;
//    }
//    public static void calculate(int row){
//        for(int a=1;a<=row;a++){
//            for(int c=1;c<=row-a;c++){
//                System.out.print(" ");
//            }
//            for(int c=1;c<=a;c++){
//                System.out.print(num(a,c)+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args){
//        Scanner a=new Scanner(System.in);
//        System.out.print("三角形行数：");
//        int row=a.nextInt();
//        calculate(row);
//    }
//}
//转换数值类型
//public class Main {
//    public static void main(String[] args){
//        DATA d=new DATA();
//        //将字符串转化为int型
//        int x=Integer.parseInt(d.a);
//        //将静态变量字符串转化为float型
//        float y=Float.parseFloat(d.c);
//        float z=x+y;
//        System.out.println(z);
//    }
//}
//标题截取
//public class Main {
//    public static void main(String[] args){
//        DATA x=new DATA();
//        System.out.println(x.f.substring(7,25));
//        System.out.println(x.g.substring(0,20));
//        for(int a=1;a<=x.e.length;a++){
//            if(x.e[a].length()>10){
//                System.out.println(x.e[a].substring(0,10)+"...");
//            }else{
//                System.out.println(x.e[a]);
//            }
//        }
//    }
//}
//替换；replace()替换指定字符(串)；replaceFirst()替换第一个字符串；replaceAll()替换所有的字符串
//public class Main {
//    public static void main(String[] args){
//        DATA a=new DATA();
//        System.out.println(a.f.replace("*","+"));//替换所有
//    }
//}
//比较字符串equals()区分大小写；equalsIgnoreCase()不区分大小写：compareTo()按字典顺序比较字符串的大小
//public class Main {
//    public static void main(String[] args){
//        DATA a=new DATA();
//        if(a.a.equals(a.b)==true){
//            System.out.println("GOOD");
//        }else{
//            System.out.println("NO GOOD");
//        }
//    }
//}
//根据字符查找：只能在字符串里面查找
//public class Main {
//    public static void main(String[] args){
//        DATA a=new DATA();
//        int b=a.f.indexOf("新");
//        System.out.println(b);
//    }
//}
//public class Main {
//    public static void main(String[] args){
//        StringBuffer a=new StringBuffer();//StringBuffer()可变字符串类，可向里面不断追加字符串
//        DATA x=new DATA();
//        String q= StringUtils.join(x.e);//StringUtils.join()将字符数组变为字符串
//        for(int t=0;t<3;t++) {
//            if(t==0){
//                a.append(x.f);
//            }else if(t==1){
//                a.append(x.g);
//            }else{
//                a.append(q);
//            }
//        }
//        System.out.println(a);//capacity()查看a的容量;
//    }
//}
//获得随机数：random()
//public class Main {
//    public static void main(String[] args){
////        DATA str=new DATA();
//        Random rand=new Random();
//        int rand1= rand.nextInt(100);
//        System.out.println(rand1);
//    }
//}
//使用Matcher()里的find()和group()方法依次取出特定字符;
//public class Main {
//    public static void main(String[] args){
//        DATA a=new DATA();
//        Matcher a1= Pattern.compile("((13\\d)|(15\\d))\\d{8}").matcher(a.h);
//        while (a1.find()) {
//            System.out.println(a1.group());
//        }
//    }
//}
