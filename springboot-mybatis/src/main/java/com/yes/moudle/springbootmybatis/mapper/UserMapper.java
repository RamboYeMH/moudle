package com.yes.moudle.springbootmybatis.mapper;

import com.yes.moudle.springbootmybatis.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author yemingheng
 * @since 2020/2/10 14:26
 * 操作数据库 相当于dao层
 */

@Repository
public interface UserMapper
{
	User Sel(int id);
}
