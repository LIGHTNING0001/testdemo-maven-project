package org.example.domain.acquiring;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GenQRCodeReq {
    /**
     * 子商户编号
     */
    private String subMerchantNo;
    /**
     * 商户订单号，商户系统内部订单号
     */
    private String tranNo;
    /**
     * 支付类型
     */
    private PayType payType;
    /**
     * 后端返回地址
     */
    private String returnUrl;
    /**
     * 前端返回地址
     */
    private String pageUrl;
    /**
     *  订单金额
     */
    private String orderAmt;
    /**
     * 商品信息
     */
    private String goodsInfo;
    /**
     * 请求地址
     */
    private String requestDate;
    /**
     * 扩展字段
     */
    private String extend;
    /**
     * 重复支付
     */
    private String reusePay;
    /**
     * 扩展信息
     */
    private Memo memo;
}
