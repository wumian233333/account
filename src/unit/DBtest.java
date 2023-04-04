package unit;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBtest {
    public static void main(String[] args){
        //8.准备连接数据库的资源
        //用户名
        String user="root";
        //密码
        String password="031122";
        //url.写法固定
        String url="jdbc:mysql://localhost:3306/score?serverTimezone=GMT";
        //驱动。写法固定
        String driver="com.mysql.cj.jdbc.Driver";

        try {
            //1.加载驱动
            Class.forName(driver);


            //2.获取连接
            java.sql.Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("链接成功");


        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

