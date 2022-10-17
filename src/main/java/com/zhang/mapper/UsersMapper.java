package com.zhang.mapper;

import com.zhang.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * InnoDB free: 6144 kB Mapper 接口
 * </p>
 *
 * @author astupidcoder
 * @since 2022-10-17
 */
public interface UsersMapper extends BaseMapper<Users> {

    List<Users> findAllUser();
}
