package unit;

import java.sql.*;
public class DBunit {
    private static String user="root";
    private static String password="031122";
    private static String url="jdbc:mysql://localhost:3306/score?serverTimezone=GMT";
    private static String driver="com.mysql.cj.jdbc.Driver";

    private static Connection conn=null;
    private static PreparedStatement pst=null;
    private static ResultSet rs=null;

    //加载驱动
    static{
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //获取连接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    //资源释放
    public static void release(){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(pst!=null){
            try {
                pst.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
