package org.zxe.orderserver.service;

import org.zxe.orderserver.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.zxe.orderserver.pojo.Order;
import org.zxe.orderserver.pojo.User;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RestTemplate restTemplate;
    public Order findById(Integer id){
        Order order=orderMapper.find(id);
        String url="http://user-server/user/"+order.getUserId();
        User user=restTemplate.getForObject(url,User.class);
        order.setUser(user);
        return order;
    }
}
