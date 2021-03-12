package top.yms.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.yms.pojo.MyUser;

public interface UserMapper {
    @Select("SELECT id,username,password FROM t_user WHERE id = #{userId}")
    MyUser getUser(@Param("userId") Integer userId);
}
