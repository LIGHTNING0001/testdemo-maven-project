package org.example.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class CommonResp {

    /**
     * 方法名
     */
    private String method;

    /**
     * 接口版本号
     */
    private String verison;

    /**
     * 请求格式
     */

    private String format;

    /**
     * 商户号
     */

    private String merchantNo;

    /**
     * 签名机制
     */

    private String signType;

    /**
     *
     * 业务请求方式
     */

    private String signContent;

    private String sign;

}
