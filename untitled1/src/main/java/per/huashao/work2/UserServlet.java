package per.huashao.work2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserServlet{
    UserService userService;
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public String getUser(){
        return userService.GetUser();
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
