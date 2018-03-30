package com.winter.service.impl;

import com.github.pagehelper.PageHelper;
import com.winter.mapper.UserMapper;
import com.winter.model.User;
import com.winter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public int addUser(User user) {
        return mapper.insert(user);
    }

    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(1,1);
        return mapper.selectAllUser();
    }
}
