package org.example.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class CommonResp {

    private String method;

    private String verison;

    private String format;

    private String merchantNo;

    private String signType;

    private String signContent;

    private String sign;

}
