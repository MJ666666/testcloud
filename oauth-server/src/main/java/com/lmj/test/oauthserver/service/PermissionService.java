package com.lmj.test.oauthserver.service;

import com.lmj.test.oauthserver.entity.SysPermission;

import java.util.List;


public interface PermissionService {

    List<SysPermission> findByUserId(Integer userId);

}