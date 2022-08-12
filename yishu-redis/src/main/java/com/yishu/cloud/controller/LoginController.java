package com.yishu.cloud.controller;

import com.yishu.cloud.VO.LoginVO;
import com.yishu.cloud.dao.YishuUserDao;
import com.yishu.cloud.dao.po.YishuUserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private YishuUserDao yishuUserDao;

    @PostMapping("/yishu/login")
    public String login(@RequestBody LoginVO vo){

        String userName = vo.getUserName();
        String passWord = vo.getPassWord();

        YishuUserPo po = new YishuUserPo();
        po.setUserName(userName);
        YishuUserPo result = yishuUserDao.selectOne(po);
        if(result == null){
            return "不存在该用户";
        }
        if(!result.getPassword().equals(passWord)){
            return "密码错误";
        }

        return "登录成功";
    }

}
