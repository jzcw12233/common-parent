package com.jzcw.ssm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jzcw.ssm.dao.UserMapper;
import com.jzcw.ssm.entity.User;

@Service
public class UserServiceImpl {
    @Autowired 
    private UserMapper userMapper ;
    
    public List<User> queryUserAll(){
        
        return null;
    }
    
}
