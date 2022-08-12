package com.yishu.cloud.VO;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class YishuUserAddVO {

    @NotNull
    private String userName;

    @NotNull
    private String password;

    private Long userLevel;

}
