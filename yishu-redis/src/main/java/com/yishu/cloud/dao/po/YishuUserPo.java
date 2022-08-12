package com.yishu.cloud.dao.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Table( name ="yishu_user" )
public class YishuUserPo implements Serializable {

    @Column(name = "id" )
    @Id
    private Long id;

    /**
     * 用户权限等级
     */
    @Column(name = "user_level" )
    private Long userLevel;

    /**
     * 用户名
     */
    @Column(name = "user_name" )
    private String userName;

    /**
     * 密码
     */
    @Column(name = "password" )
    private String password;


}
