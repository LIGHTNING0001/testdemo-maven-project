package org.example.domain.acquiring;


import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Memo {

    /**
     * 交易结束时间
     */
    private String timeExpire;

    /**
     * 限制卡类型
     */
    private String paylimit;

    /**
     * 终端用户IP
     */
    private String spbillCreateIp;

    /**
     * 经度
     */
    private String longitude;
    /**
     * 维度
     */
    private String latitude;


}
