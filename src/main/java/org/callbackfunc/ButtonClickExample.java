package org.callbackfunc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickExample {

    public static void main(String[] args) {
        // 创建一个 JFrame 作为窗口
        JFrame frame = new JFrame("Event Driven Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // 创建一个按钮
        JButton button = new JButton("Click Me");

        // 添加按钮的事件监听器
        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // 回调方法：按钮被点击时调用
                onButtonClicked(e);
            }
        });

        // 将按钮添加到窗口
        frame.getContentPane().add(button);

        // 显示窗口
        frame.setVisible(true);
    }

    // 回调方法：按钮点击时执行
    public static void onButtonClicked(ActionEvent e) {
        System.out.println("Button was clicked!");
    }
}
