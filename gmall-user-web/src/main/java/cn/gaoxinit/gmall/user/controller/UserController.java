package cn.gaoxinit.gmall.user.controller;


import cn.gaoxinit.gmall.bean.UmsMember;
import cn.gaoxinit.gmall.bean.UmsMemberReceiveAddress;
import cn.gaoxinit.gmall.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String umsMemberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses=userService.getReceiveAddressByMemberId(umsMemberId);
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> UmsMembers =userService.getAllUser();
        return UmsMembers;
    }

    /*@RequestMapping("getUserId")
    @ResponseBody
    public UmsMember getUserId(String userId){
        UmsMember umsMember=userService.getUserId(userId);
        return umsMember;
    }*/

    /*@RequestMapping("removeUser")
    @ResponseBody
    public int removeUser(int umsMember){
       //int i = userService.removeUser(umsMember);
        return 1;
    }*/

    /*@RequestMapping("addUser")
    @ResponseBody
    public int addUser(@Param UmsMember umsMember)*/



}
