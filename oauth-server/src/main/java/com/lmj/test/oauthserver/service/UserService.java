package com.lmj.test.oauthserver.service;


import com.lmj.test.oauthserver.entity.SysUser;

/**
 * @author ChengJianSheng
 * @date 2019-02-12
 */
public interface UserService {

    SysUser getByUsername(String username);
}