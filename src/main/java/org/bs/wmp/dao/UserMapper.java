package org.bs.wmp.dao;

import org.bs.wmp.domain.User;

public interface UserMapper {

    User selectById(Integer id);

    int insert(User record);

    int update(User record);

    int deleteById(Integer id);
}