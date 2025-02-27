package com.wapgyj.userservice.mapper;

import com.wapgyj.userservice.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wapGYJ
 * @since 2025-01-31
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
