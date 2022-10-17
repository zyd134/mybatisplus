package com.zhang.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * InnoDB free: 6144 kB
 * </p>
 *
 * @author astupidcoder
 * @since 2022-10-17
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Users extends Model {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;


}
