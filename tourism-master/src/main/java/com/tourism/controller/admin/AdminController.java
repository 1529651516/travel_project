package com.tourism.controller.admin;

import com.tourism.common.HttpResult;
import com.tourism.entity.User;
import com.tourism.service.UserService;
import com.tourism.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/index")
    public String view(HttpServletRequest request,String userId){
        User user=userService.findById(userId);
        // iCBFileService.getICBImageUrl("http://10.4.3.13:6888/dacx/temp/10.4.199.174/440003/00004413000000000000064001/2.tif ","test" ,"00004413000000000000064001", 2);

        request.getSession().setAttribute("username",user.getUsername());
        return "/admin/index";
    }

    @RequestMapping(value="/flot")
    public String flot(HttpServletRequest request){
        // iCBFileService.getICBImageUrl("http://10.4.3.13:6888/dacx/temp/10.4.199.174/440003/00004413000000000000064001/2.tif ","test" ,"00004413000000000000064001", 2);
        return "/admin/flot";
    }

    @RequestMapping(value="/content")
    public String content(HttpServletRequest request){
        // iCBFileService.getICBImageUrl("http://10.4.3.13:6888/dacx/temp/10.4.199.174/440003/00004413000000000000064001/2.tif ","test" ,"00004413000000000000064001", 2);
        return "/admin/content";
    }

    @RequestMapping(value="/loginhtml")
    public String login(HttpServletRequest request){
        // iCBFileService.getICBImageUrl("http://10.4.3.13:6888/dacx/temp/10.4.199.174/440003/00004413000000000000064001/2.tif ","test" ,"00004413000000000000064001", 2);
        return "/admin/login";
    }
    @RequestMapping(value="/login")
    @ResponseBody
    public HttpResult<User> logincheck(HttpServletRequest request, String username, String password){
        // iCBFileService.getICBImageUrl("http://10.4.3.13:6888/dacx/temp/10.4.199.174/440003/00004413000000000000064001/2.tif ","test" ,"00004413000000000000064001", 2);
        User user=userService.findByName(username);
        HttpResult result=new HttpResult();
        if(user==null){
           result.setCode(500);
           result.setMsg("user is not find!");
        }else {
            if(!StringUtils.trim(password) .equals(user.getPassword())||!StringUtils.trim(username).equals(user.getUsername())){
               result.setMsg("username or password is error!");
                result.setCode(500);
            }
        }
        result.setData(user);
        return result;
    }


}
