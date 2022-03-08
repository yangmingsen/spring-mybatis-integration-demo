package top.yms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import top.yms.pojo.MyUser;

import java.util.List;


public interface UserMapper {
    @Select("SELECT id,username,password FROM test WHERE id = #{userId}")
    MyUser getUser(@Param("userId") Integer userId);


    @Select("Select * from test")
    List<MyUser> getUserList();
}
