package maco.demo.agiledemo.service;

import maco.demo.agiledemo.dao.UserMapper;
import maco.demo.agiledemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 *
 * @author: songqiang
 * @date: 2019/12/21
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getAdmin(){
        return userMapper.getAdmin();
    }

}
