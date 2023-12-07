package services;

import daos.UserMapper;
import entitys.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class UserService {
    private static SqlSessionFactory sqlSessionFactory;
    static{
        try {
            InputStream ins = Resources.getResourceAsStream("mybatis-config.xml");
            //读取配置文件
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(ins);
            //根据配置文件信息创建sqlsessionfactory 对象
           //SqlSession sqlSession=sqlSessionFactory.openSession();
            //产生sqlsession等于connection对象
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void insertUser(User user){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        sqlSession.insert("UserMapper.insertUsers",user);
        sqlSession.commit();
        sqlSession.close();
    }
    public List<User> getAllUsers(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        // List<User> l=sqlSession.selectList("UserMapper.selectUsers",User.class);
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        List<User> l=userMapper.selectUsers();
        sqlSession.commit();//提交事务
        sqlSession.close();
        return l;
    }

    public static void main(String[] args) {
//       List<User> l=new UserService().getAllUsers();
//        System.out.println(l);
 //       new UserService().insertUser(new User("liu1","lbw",1,"122222","142","no"));

    }
}
