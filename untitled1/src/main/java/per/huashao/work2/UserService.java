package per.huashao.work2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import per.huashao.work2.UserDao;

@Component
public class UserService {

    UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public String GetUser()
    {
        //调用userDao的方法
        return userDao.UserSaying();
    }

    public UserDao getUserDao() {
        return userDao;
    }
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}