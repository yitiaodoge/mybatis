package com.winter.service;

import com.github.pagehelper.PageInfo;
import com.winter.model.User;

public interface UserService {

    int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);
}
