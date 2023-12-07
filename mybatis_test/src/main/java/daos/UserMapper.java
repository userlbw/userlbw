package daos;

import entitys.User;

import java.util.List;
//映射器接口的方法名和mapper.xml的id保持一致
//映射器接口的名字和mapper.xml的namespace保持一致
public interface UserMapper {
    public List<User> selectUsers();
    public  void insertUsers(User user);

}
