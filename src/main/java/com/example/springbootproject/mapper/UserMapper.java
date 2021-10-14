package com.example.springbootproject.mapper;

import com.example.springbootproject.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * created by on 2021/10/14
 * 描述：用户UserMapper映射接口
 *
 * @author ZSAndroid
 * @create 2021-10-14-19:34
 */

@Mapper
public interface UserMapper {
    //findAllUserInfo 是 UserMapper.xml 定义的查询全部用户信息的id，因为查询结果可能是多个用户数据，即为集合，而集合装的类型，就是User
    //步骤2：这里引入了 UserMapper.xml 的id，然后同样也需要在UserService中定义同样的
    List<User> findAllUserInfo();
}
