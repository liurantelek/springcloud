package com.lr.controller;

import com.lr.pojo.User;
import com.lr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getuserbyid")
    public User getUserById(HttpServletRequest request, Model model){
        String id=request.getParameter("id");
        if(id==null||"".equals(id)){
            id="2";
        }
            int userId=Integer.parseInt(id);
        User user=userService.getUserById(userId);
        return user;
    }
    @ResponseBody
    @RequestMapping("/insertuser")
    public User insertUser(HttpServletRequest request, Model model){
       User user=new User();
        String user_name=request.getParameter("user_name");
        String user_password=request.getParameter("user_password");
        String age=request.getParameter("age");
        user.setAge(Integer.parseInt(age));
        user.setUserName(user_name);
        user.setUserPassword(user_password);
       int status=userService.insertUser(user);
        return user;
    }

    @ResponseBody
    @RequestMapping("/updateuser")
    public User  updateUser(HttpServletRequest request, Model model){
        String id=request.getParameter("id");
        int userId=Integer.parseInt(id);
       User user=userService.getUserById(userId);
           user.setUserPassword("hahahah");
        int status=userService.updateUser(user);
       return user;
    }

    @ResponseBody
    @RequestMapping("/deleteuser")
    public String deleteByPrimaryKey(HttpServletRequest request, Model model){
        String id=request.getParameter("id");
        if(id==null||"".equals(id)){
            id="1";
        }
        int userId=Integer.parseInt(id);
        int status=userService.deleteUserByPrimaryKey(userId);
        if(1==status){
            return "删除成功";
        }
        return "删除失败";

    }



}
