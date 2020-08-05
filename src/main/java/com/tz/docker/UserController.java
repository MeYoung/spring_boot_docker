package com.tz.docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author shijin.huang
 * @Classname UserController
 * @Description
 */
@RestController
public class UserController {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @RequestMapping("/getUserInfo")
    public Object getUserInfo() {
/*        for(int i = 0;i<10;i++){
            UserBean userBean = new UserBean();
            userBean.setName("name"+i);
            userBean.setAge(12);
            userBean.setJob("3333:"+i);
            userBean.setSex("1");
            userInfoRepository.save(userBean);
        }*/
        List<UserBean> all = userInfoRepository.findAll();
        return all;
    }
}
