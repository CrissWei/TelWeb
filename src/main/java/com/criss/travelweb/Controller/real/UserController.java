package com.criss.travelweb.Controller.real;

import com.criss.travelweb.Controller.utils.Result;
import com.criss.travelweb.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/all")  //http://localhost/user/all
    public Result getAll() {
        return new Result(true, userDao.getAll());
    }
}
