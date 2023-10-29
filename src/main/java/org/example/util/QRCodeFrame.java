package org.example.util;

import javax.swing.*;
import java.awt.*;

public class QRCodeFrame extends JFrame {

    private String qrcode;

    //外部调用这个函数加载窗口，显示二维码
    public void launchFrame(String qrcode) throws InterruptedException {
        this.qrcode = qrcode;
        this.setTitle("支付二维码, 15秒后关闭");
        this.setVisible(true);
        this.setSize(540, 540);//大小
        this.setLocation(400, 200);//左上角位置

        //指定要从本地加载的二维码的路径
        JPanel jPanel = new QRCodeFrameImage(this.qrcode);
        this.getContentPane().add(jPanel);
        //设置始终在窗体层最上面
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int n = 15;
        while(true){
            if(n <= 0){
                System.exit(-1);
            }
            Thread.sleep(1000);
            this.setTitle("支付二维码, "+ n +"秒后关闭");
            n--;
            this.repaint();
        }

    }



}