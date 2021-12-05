package cn.gaoxinit.gmall.user.service.imp;


import cn.gaoxinit.gmall.bean.UmsMember;
import cn.gaoxinit.gmall.bean.UmsMemberReceiveAddress;
import cn.gaoxinit.gmall.service.UserService;
import cn.gaoxinit.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import cn.gaoxinit.gmall.user.mapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMember> getUserId(String userId) {
        Example e=new Example(UmsMember.class);
        e.createCriteria().andEqualTo("Id",userId);
        List<UmsMember> umsMembers = userMapper.selectByExample(e);
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String umsMemberId) {
        Example e=new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId", umsMemberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(e);
        return umsMemberReceiveAddresses;
    }

    public static void main(String[] args) {
        System.out.println("再次修改看能否成功上传");
    }
}
