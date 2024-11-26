package SWING;
import javax.swing.*;
public class HelloSwing {
    public static void main(String[] args){
        JFrame frame=new JFrame("Hello Swing");//窗口名称
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//告诉程序在关闭窗口时要退出
        frame.setSize(300,100);//窗口大小
        frame.setVisible(true);//没有这一行什么都看不到
    }

}
