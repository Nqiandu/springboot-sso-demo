package com.xxx.springboot.sso.utils;

import java.util.UUID;

/**
 * @Description
 *      UUID工具类
 **/
public class UUIDUtil {

    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

}
