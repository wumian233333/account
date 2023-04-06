import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        String Tel = request.getParameter("tel");
        String passWord = request.getParameter("password");
        Account account = new Account(Tel,passWord);
    AccountDaoImpl accountDao = new AccountDaoImpl();
        try {
        accountDao.login(account,request,response);
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
