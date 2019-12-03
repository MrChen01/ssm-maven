package com.company.ssmmaven.service;

import com.company.ssmmaven.dao.UserMapper;
import com.company.ssmmaven.model.User;
import com.company.ssmmaven.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 陈卓信
 * Date: 2019/12/2
 * Time: 21:03
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        UserExample userExample = new UserExample();
        return userMapper.selectByExample(userExample);
    }
}
