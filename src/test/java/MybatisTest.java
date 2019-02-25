import com.zhuky.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

public class MybatisTest {

    @Test
    public void test1(){
        // 指定全局配置文件
        String resource = "mybatis-config.xml";
        //读取配置文件
        InputStream is = null;
        //构建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = null;
        SqlSession sqlSession = null;
        try{
            is = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            //构建session
            sqlSession = sqlSessionFactory.openSession();

            User user = sqlSession.selectOne("MyMapper.selectUser", 1);
            System.out.println(user);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(sqlSession != null){
                sqlSession.close();
            }
        }

    }

}
