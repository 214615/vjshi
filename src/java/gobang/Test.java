package gobang;

import automation.Rectangle;
import automation.Triangle;
import automation.practice;

//public class Test {
//    public static void main(String[] args) {
//        final MyChessFrame mf = new MyChessFrame();
//        int result = JOptionPane.showConfirmDialog(mf, "是否开始游戏？");
//        if (result == 0) {
//            JOptionPane.showConfirmDialog(mf, "开始游戏");
//        } else if (result == 1) {
//            int kill=JOptionPane.showConfirmDialog(mf, "游戏结束");
//            if(kill==0){
//                mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            }
//        } else {
//            int res = JOptionPane.showConfirmDialog(mf, "请重新选择");
//            for (int x = 1; x < 99; x++) {
//                if (res == 0) {
//                    JOptionPane.showConfirmDialog(mf, "是否开始游戏？");
//                }else {
//                            mf.addWindowListener(new WindowAdapter() {
//                                @Override
//                                public void windowClosing(WindowEvent e) {
//                                    mf.setVisible(false);
//                                    System.exit(0);
//                                }
//                            });
//                }
//            }
//        }
//    }
//}
//        String input= JOptionPane.showInputDialog("姓名:");
//        if(input!=null){
//            System.out.println(input);
//            //显示一个消息对话框,主要用来提示信息
//            JOptionPane.showMessageDialog(mf,"姓名为:"+input);
//        }else{
//            JOptionPane.showMessageDialog(mf,"请重新输入！");
//        }
public class Test {
    public static void main(String[] args){
        practice age;
        age=new Rectangle(1.7,1.5);
        System.out.println(age.area());
        age=new Triangle(10,10);
        System.out.println(age.area());
    }
}