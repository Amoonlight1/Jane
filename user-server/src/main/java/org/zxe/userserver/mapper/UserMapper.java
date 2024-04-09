package org.zxe.userserver.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.zxe.userserver.pojo.User;

@Mapper
public interface UserMapper  {
    @Select("select * from user where id='2'")
    User find(Integer id);
}
