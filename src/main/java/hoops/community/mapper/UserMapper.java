package hoops.community.mapper;

import hoops.community.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("insert into sys.USER(name,account_id,token,gmt_create,gmt_modified) values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}
