import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/AccountAddServlet")
public class AccountAddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("name");
        String passWord = request.getParameter("password");
        String ID = request.getParameter("id");
        String kahao = request.getParameter("kahao");
        String Tel = request.getParameter("tel");
        String Sex = request.getParameter("sex");
        Account account = new Account(userName,passWord,ID,kahao,Tel,Sex);
        AccountDaoImpl accountDao = new AccountDaoImpl();
        accountDao.add(account);
        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
