package gobang;

import javax.swing.*;
import java.awt.*;
/**
 * @author :user
 * @createDte :2021/6/22
 * @description :创建窗口*/
public class MyChessFrame extends JFrame {
    public MyChessFrame(){
        //设置窗体标题
        this.setTitle("五子棋");
        //设置窗体大小
        this.setSize(500,400);
        //设置窗体初始位置
//        jf.setLocation(400,100);
        //设置窗体大小是否可以变化（窗口最大化按钮是否可以点击）
        this.setResizable(true);
        //关闭窗体时，结束程序运行
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //获取屏幕宽度
        int width= Toolkit.getDefaultToolkit().getScreenSize().width;
        //获取屏幕高度
        int heigth=Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setLocation((width-400)/2,(heigth-400)/2);
        //设置窗体是否显示
        this.setVisible(true);
    }
}
