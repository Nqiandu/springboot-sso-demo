package com.xxx.springboot.sso.service;

import com.xxx.springboot.sso.utils.HttpClientUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Value("${sso_base_url}")
    public String baseUrl;
    @Value("${sso_access_path}")
    public String accessPath;
    @Value("${sso_access_login_path}")
    public String accessLoginPath;
    @Value("${sso_login_param}")
    public String loginParam;

    public String chekLogin(String cookieValie) {
        return HttpClientUtil.doGet(baseUrl+accessPath+cookieValie);
    }

}
