package com.criss.travelweb.Controller.real;

import com.criss.travelweb.Controller.utils.R;
import com.criss.travelweb.Controller.utils.Result;
import com.criss.travelweb.Dao.PostDao;
import com.criss.travelweb.Entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired   //BaseMapper<T>接口
    private PostDao postDao;

    @GetMapping("/all")  //成功  http://localhost/post/all
    public List<Post> getAllPost(){
        //System.out.println("M 所有的post...");
        return postDao.getAll();
    }

    @GetMapping("/all2") //成功  http://localhost/post/all2
    public R<Post> getAllPostR(){
        //System.out.println("所有的post...");
        return new R(true,postDao.getAll());
    }
    // why cannot
  /*  @GetMapping("{postId}")
    public Post getById(@PathVariable Integer postId){
        System.out.println("根据id post查找...");
        return postDao.getById(postId);
    }*/

    @GetMapping("{postId}")
    public Result<Post> getByID(@PathVariable Integer postId) {
        //return service.getById(id);
        return new Result<Post>(true, postDao.getById(postId));
    }

    //like search
    @GetMapping("{title}")
    public List<Post> getLikePost(@PathVariable String title){
        return postDao.getLike(title);
    }
    //like search
    @GetMapping("{title}/{content}")
    public List<Post> getLikePost( @PathVariable String title, @PathVariable String content){
        return postDao.getLike(title,content);
    }

    //删除
    @DeleteMapping("{id}")
    public Post deleteById(@PathVariable Integer id){
        System.out.println("根据id post删除...");
        return postDao.deleteById(id);
    }

    //INSERT INTO t_user (id,name, password) VALUES(#{id}, #{name}, #{password})
    @PutMapping
    public R update(@RequestBody Post post) {
        return new R(true, postDao.update(post,null));
    }

    //INSERT INTO t_user (id,name, password) VALUES(#{id}, #{name}, #{password})
    @PostMapping
    public Post insert(@RequestBody Integer id, @RequestBody String title, @RequestBody String content) {
        return postDao.insert(id,title,content);
    }


}
