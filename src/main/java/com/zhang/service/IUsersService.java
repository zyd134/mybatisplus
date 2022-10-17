package com.zhang.service;

import com.zhang.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * InnoDB free: 6144 kB 服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2022-10-17
 */
public interface IUsersService extends IService<Users> {

    List<Users> findAllUser();

}
