import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTest {

    @Test
    public void jdbcTest(){
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try{
            // 加载驱动
            Class.forName("com.mysql.jdbc.Driver");

            // 获取连接
            String url = "jdbc:mysql://localhost:3306/ssmdemo";
            String user = "root";
            String passwd = "1";
            conn = DriverManager.getConnection(url, user, passwd);

            String sql = "select * from tb_user a where a.id = ?";
            pst = conn.prepareStatement(sql);

            // 设置参数
            pst.setInt(1, 1);
            // 执行查询
            rs = pst.executeQuery();

            //处理结果集
            while (rs.next()){
                System.out.println(rs.getString("user_name"));
                System.out.println(rs.getInt("age"));
            }


        }
        catch (Exception ex){
            ex.printStackTrace();
        }finally {
            try{
                if(rs != null){
                    rs.close();
                }

                if(pst != null){
                    pst.close();
                }

                if(conn != null){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
