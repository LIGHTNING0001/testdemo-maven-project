package org.example.domain.testcases;

import org.springframework.core.annotation.Order;
import org.testng.annotations.Test;

public class PayApiTest {

    @Order(1)
    @Test(description = "测试 - 商户系统先调用该接口在慧收钱支付服务后台生成预支付链接")
    void testPayLink(){

        // 用户主扫


    }


    @Order(3)
    @Test(description = "测试 - 查询订单状态")
    void testPayOrderQuery(){

        // 数据库查询订单号



    }

    @Order(2)
    @Test(description = "测试 - 交易回调")
    void testPayCallback(){



    }

    @Order(4)
    @Test(description = "测试 - 退款")
    void testRefund(){

        
    }

    @Order(5)
    @Test(description = "测试 - 退款回调")
    void testRefundCallback(){

    }

    @Order(6)
    @Test(description = "测试 - 退款查询")
    void testRefundQuery(){

    }
}
