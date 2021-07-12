package com.hrm.service;


import com.hrm.pojo.Login;
import com.hrm.pojo.UserInfo;

import java.util.List;

/**
 * @author zjw
 * @package hrm
 * @Date 2021/7/9
 * @Time 15:54
 */
public interface LoginService {

    String findById(String username);

    String findByPermission(String username);

    int registerUser(Login login);

    int findIdbyName(String username);

    int setUserInfo(UserInfo userInfo);
}
