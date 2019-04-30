package com.snail.service;

import com.snail.model.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @classDesc: 功能描述:(...)
 * @author: lipan
 * @createTime: 2018/1/20
 */
public interface UserService {

    User save(User user);

    User findByUsername(String username);

    User findOne(long id);

}
