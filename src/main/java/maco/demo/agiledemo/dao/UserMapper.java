package maco.demo.agiledemo.dao;

import maco.demo.agiledemo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * UserMapper
 *
 * @author: songqiang
 * @date: 2019/12/21
 */
@Mapper
public interface UserMapper {
    @Select("select * from user")
    User getAdmin();
}
