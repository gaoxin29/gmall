package cn.gaoxinit.gmall.user.mapper;


import cn.gaoxinit.gmall.bean.UmsMember;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


@Repository
public interface UserMapper extends Mapper<UmsMember> {
    //List<UmsMember> selectAllUser();

    //UmsMember selectUserId(String userId);

    //int deleteUser(int umsMember);

    //List<UmsMember> selectAllUser()=UserMapper.
}
