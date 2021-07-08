package object_oriented;

/**
 * @name 类的封装
 * @Date 2021/6/30
 * */
public class encapsulation {
    private String name;
    private int age;
    private String phone;
    private String addres;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age<18 || age>40){
            this.age=20;
        }else {
            this.age=age;
        }
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getAddres(){
        return addres;
    }
    public void setAddres(String addres){
        this.addres=addres;
    }
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
//        practice  practice=new practice("张强");
//        System.out.println(practice);
//        practice practice1=new practice("王博",21);
//        System.out.println(practice1.info());
//        practice cnt1 = new practice();    // 建立第一个实例
//        System.out.println("数量："+cnt1.getCount());    // 输出1
//        practice cnt2 = new practice();    // 建立第二个实例
//        System.out.println("数量："+cnt2.getCount());    // 输出2
//        cnt2 = null;    // 销毁实例2
//        try {
//            System.gc();    // 清理内存
//            Thread.sleep(1000);    // 延时1000毫秒
//            System.out.println("数量："+cnt1.getCount());    // 输出1
//        } catch(InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
