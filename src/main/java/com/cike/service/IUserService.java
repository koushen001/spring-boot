package com.cike.service;

import com.cike.common.ServerResponse;
import com.cike.entity.User;

public interface IUserService {
    ServerResponse findAll();

    ServerResponse<User> save(User user);

    ServerResponse delete(Integer id);
}
