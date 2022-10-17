package com.zhang.service.impl;

import com.zhang.entity.Users;
import com.zhang.mapper.UsersMapper;
import com.zhang.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * InnoDB free: 6144 kB 服务实现类
 * </p>
 *
 * @author astupidcoder
 * @since 2022-10-17
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> findAllUser() {
        return usersMapper.findAllUser();
    }

}
