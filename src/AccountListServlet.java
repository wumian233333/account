import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "AccountListServlet", value = "/AccountListServlet")
public class AccountListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        String docType = "<!DOCTYPE html> \n";
        //调用事件：FindAll
        AccountDao accountDao = new AccountDaoImpl();
        List<Account> accounts = accountDao.FindAll();
        for (Account account : accounts) {
             System.out.print("卡号："+account.getKahao()+"\t "+"姓名："+account.getUsername()+"\t "+"余额："+account.getBalance());
             System.out.println();
        }


    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
