package cn.gaoxinit.gmall.service;



import cn.gaoxinit.gmall.bean.UmsMember;
import cn.gaoxinit.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;


public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMember> getUserId(String userId);

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String umsMemberId);

    // int removeUser(int umsMember);
}
