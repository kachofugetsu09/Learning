package SWING;
import javax.swing.*;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class SubmitLabelManipulationTask {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Hello Swing");
        JLabel label = new JLabel("A Lable");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//告诉程序在关闭窗口时要退出
        frame.setSize(300, 100);//窗口大小
        frame.setVisible(true);//没有这一行什么都看不到
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                label.setText("123");
            }
        });
    }
}