package com.yishu.cloud.controller;

import com.yishu.cloud.VO.YishuUserAddVO;
import com.yishu.cloud.dao.YishuUserDao;
import com.yishu.cloud.dao.po.YishuUserPo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class YishuUserBaseController {

    @Autowired
    private YishuUserDao yishuUserDao;

    @PostMapping("/yishu/user/add")
    public String add(@RequestBody YishuUserAddVO vo){

        YishuUserPo selectPo = new YishuUserPo();
        selectPo.setUserName(vo.getUserName());
        YishuUserPo resultPo = yishuUserDao.selectOne(selectPo);
        if(resultPo == null){
            selectPo.setPassword(vo.getPassword());
            // 默认添加的是普通用户
            if(vo.getUserLevel() == null){
                selectPo.setUserLevel(2L);
            }else{
                selectPo.setUserLevel(vo.getUserLevel());
            }
            try {
                int row = yishuUserDao.insert(selectPo);
                if(row == 1)return "创建用户成功";
                else return "创建用户失败";
            }catch (Exception e){
                log.info(e.getMessage());
            }


        }
        return "已存在用户名";

    }

//    @PostMapping("/yishu/user/delete")
//    public String delete(){
//        return null;
//    }

}
