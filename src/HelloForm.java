
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.Serial;
//
//@WebServlet("/HelloForm")
//public class HelloForm extends HttpServlet {
//
//    @Serial
//    private static final long serialVersionUID = 1L;
//
//
//    public HelloForm() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // 设置响应内容类型
//        response.setContentType("text/html;charset=UTF-8");
//
//        PrintWriter out = response.getWriter();
//        String title = "使用 GET 方法读取表单数据";
//        // 处理中文
//        String name =new String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");
//        String docType = "<!DOCTYPE html> \n";
//        out.println(docType +
//                "<html>\n" +
//                "<head><title>" + title + "</title></head>\n" +
//                "<body color=\"#f0f0f0\">\n" +
//                "<h1 align=\"center\">" + title + "</h1>\n" +
//                "<ul>\n" +
//                "  <li><b>用户</b>："
//                + name + "\n" +
//                "  <li><b>密码</b>："
//                + request.getParameter("password") + "\n" +
//                "</ul>\n" +
//                "</body></html>");
//    }
//
//    // 处理 POST 方法请求的方法
//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doGet(request, response);
//    }
//}
