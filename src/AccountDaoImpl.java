import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import unit.DBunit;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class AccountDaoImpl implements AccountDao {

    @Override
    public void add(Account account) {
        // TODO Auto-generated method stub
        try {
            //获取连接
            //Java中当然可以在一个类中调用另一个类的静态公有方法
            Connection conn=DBunit.getConnection();
            //代表了具体的业务
            //因为写死了所以妨碍了通用工具类的通用性
            //数据库字段的值
            /*用知insert语句：　INSERT INTO table1(id, name, address) VALUES(1, ygl, 'beijing')，该语句主要适用于sql和PL/SQL。*/
            //用户输入来的内容未知，所以用占位符‘?’
            //values中的内容皆被视作为字符串，因此这个时候在里面写入的方法只具有展示性，不具有功能性
            String sql="insert into user(username,password,ID,kahao,tel,sex,balance)values(?,?,?,?,?,?,?)";
		    /*（作用是将将sql指令发送给mysql执行）*/

            PreparedStatement pst=conn.prepareStatement(sql);

            //执行前确定前端传过来的是什么
            pst.setString(1, account.getUsername());
            pst.setString(2, account.getPassword());
            pst.setString(3,account.getID());
            pst.setString(4,account.getKahao());
            pst.setString(5,account.getTel());
            pst.setString(6,account.getSex());
            pst.setDouble(7,account.getBalance());
            //增删改：executeupdate()
            //查：executequery()
            int num=pst.executeUpdate();
            if(num>0){
                out.println("注册成功!!!");
            }
            else{
                out.println("注册失败...");

            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{

            try {
                DBunit.release();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public void login(Account account,HttpServletRequest request, HttpServletResponse response) throws SQLException {
        try {
            Connection conn = DBunit.getConnection();
            PreparedStatement pst = conn.prepareStatement("select * from user where tel=? and password=?");
            pst.setString(1, account.getTel());
            pst.setString(2, account.getPassword());
            //执行sql语句
            ResultSet rs = pst.executeQuery();
            //处理结果
            if (rs.next()) {
                //转发
                request.getRequestDispatcher("connection.jsp").forward(request, response);
            } else {
                //失败
                 request.setAttribute("errorMessage","电话号码或者密码错误，请重新登录！");
                 request.getRequestDispatcher("login.jsp").forward(request,response);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        } finally{

            try {
                DBunit.release();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    @Override
    public void update(Account account) {

    }

    @Override
    public List<Account> FindAll() {
        List<Account> accounts=new ArrayList<Account>();
        try {
            Connection conn=DBunit.getConnection();
            String sql="select * from user";
            PreparedStatement pst=conn.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                //结果集封装为对象
                Account account=new Account();

                account.setUsername(rs.getString("username"));
                account.setPassword(rs.getString("password"));
                account.setID(rs.getString("id"));
                account.setKahao(rs.getString("kahao"));
                account.setTel(rs.getString("tel"));
                account.setSex(rs.getString("sex"));
                account.setBalance(rs.getDouble("balance"));
                //对象添加到集合中
                accounts.add(account);

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{

            try {
                DBunit.release();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return accounts;
    }
}
