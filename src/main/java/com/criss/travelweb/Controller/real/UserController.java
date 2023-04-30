package com.criss.travelweb.Controller.real;

import com.criss.travelweb.Controller.utils.R;
import com.criss.travelweb.Controller.utils.Result;
import com.criss.travelweb.Dao.UserDao;
import com.criss.travelweb.Entity.Book;
import com.criss.travelweb.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/all")  //http://localhost/user/all
    public Result getAll() {
        return new Result(true, userDao.getAll());
    }

    @GetMapping("/all2")  //http://localhost/user/all2
    public List<User> getAll2() {
        return userDao.getAll();
    }

  /* 这个自己写的why cannot
    @GetMapping("{id}")  //http://localhost/user/1
    public User getById(@PathVariable Integer id){
        return userDao.getById(id);
    }*/
  @GetMapping("{id}")
  public Result<User> getByID(@PathVariable Integer id) {
      //return service.getById(id);
      return new Result<User>(true, userDao.getById(id));
  }

    @GetMapping("{username}")  //http://localhost/user/cris
    public User getByName(@PathVariable String username){
        return userDao.getByName(username);
    }

    @GetMapping("{email}")  //http://localhost/user/cris
    public User getByEmail(@PathVariable String email){
        return userDao.getByEmail(email);
    }

    //删除
    @DeleteMapping("{id}")
    public User deleteById(@PathVariable Integer id){
        System.out.println("根据id post删除...");
        return userDao.deleteById(id);
    }

    //INSERT INTO t_user (id,name, password) VALUES(#{id}, #{name}, #{password})
    @PutMapping
    public R update(@RequestBody User User) {
        return new R(true, userDao.update(User,null));
    }


    @PostMapping
    public boolean insert(@RequestBody User user) {
        return userDao.insert(user)>0;
    }

    /*@PutMapping 只能有一个@PutMapping
    public User update2(@RequestBody User user) {
        return userDao.update(user);
    }
    */
    //INSERT INTO t_user (id,name, password) VALUES(#{id}, #{name}, #{password})
  /*  @PostMapping 只能有一个@PostMapping
    public User insert(@RequestBody Integer id, @RequestBody String name, @RequestBody String password,@RequestBody String email) {
        return userDao.insert(id,name,password, email);
    }
*/
}
