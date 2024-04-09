package org.zxe.orderserver.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.zxe.orderserver.pojo.Order;

@Mapper
public interface OrderMapper {
    @Select("select * from orders where user_id='2'")
    Order find(Integer userid);

}
