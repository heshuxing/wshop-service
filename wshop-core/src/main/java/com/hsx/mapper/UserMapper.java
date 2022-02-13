package com.hsx.mapper;

import com.hsx.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


/**
 * UserMapper
 *
 * @author shuxing.he
 * @date 2022/2/12
 */
@Mapper
@Repository
public interface UserMapper {

    public User queryUserByName(String username);

}
