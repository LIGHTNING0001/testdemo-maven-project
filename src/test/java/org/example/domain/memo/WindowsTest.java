package org.example.domain.memo;

import org.example.util.QRCodeFrame;
import org.example.util.QrcodeUtils;
import org.testng.annotations.Test;

import javax.swing.*;
import java.nio.file.Paths;

public class WindowsTest {



    @Test
    void test(){
        JFrame jf = new JFrame();

        jf.setTitle("支付窗口");
        jf.setBounds(200, 200, 800, 600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while(true){}
    }

    @Test
    void test1() throws Exception {

        String context = "http://test";
        String filePath = "1.png";

        // 保存二维码图片
        QrcodeUtils.createQrcode(context, Paths.get(filePath));
        QRCodeFrame qrCodeFrame = new QRCodeFrame();
        qrCodeFrame.launchFrame(filePath);

    }

}
