<%--
  Created by IntelliJ IDEA.
  User: 无勉
  Date: 2023/4/5
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <link rel="stylesheet" href="singin.css">
</head>
<body class="text-center">

    <form class="form-signin" action="LoginServlet">
        <img class="mb-4" src="images/signin.jpg" alt="小小派蒙" width="100" height="100">
        <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
        <div>
            <%
                String errorMessage = (String)request.getAttribute("errorMessage");
                if(errorMessage==null)
                    errorMessage = "请输入电话号码和密码";
            %>
            <span class="mb-3"><%=errorMessage%></span>
        </div>
        <label for="tel" class="sr-only">TelephoneNumber</label>
        <input type="text" name="tel" id="tel" class="form-control" placeholder="TelephoneNumber" required="" autofocus="">
        <label for="password" class="sr-only">Password</label>
        <input type="password" name="password" id="password" class="form-control" placeholder="Password" required="">
        <div class="checkbox mb-3">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        <p class="mt-5 mb-3 text-muted">© 2023</p>
    </form>

<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</body>
</html>
