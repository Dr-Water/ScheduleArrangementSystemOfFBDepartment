package cn.edu.shnu.fb.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.edu.shnu.fb.infrastructure.persistence.UserDao;

/**
 * Created by bytenoob on 15/12/2.
 */
@Repository
public class UserRepository {
    @Autowired
    UserDao userDao;

    public User authOK(String username , String password){
        User user = userDao.findByUsernameEquals(username);
        if(user == null) return null;
        else if(user.getPassword().equals(password)){
            return user;
        }else{
            return null;
        }
    }
}