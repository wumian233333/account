<%--
  Created by IntelliJ IDEA.
  User: 无勉
  Date: 2023/3/6
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head >
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>派蒙银行</title>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<%--  <link rel="stylesheet" type="text/css" href="Hello.css">--%>
</head>

<body >
<%-- <div><img  src="images/paimeng.jpg" /></div>--%>
<div align="center">
  <h1>欢迎来到派蒙银行</h1>
<%--  <p>重置浏览器大小查看效果。</p>--%>
</div>

<div align="center" style="background: #333333" class="container-fluid">
  <a href="#">链接</a>
  <a href="#">链接</a>
  <a href="#">链接</a>
</div>
<div align="center" style="background: #f2f2f2" class="container-fluid">
<form action="AccountAddServlet" method="get">
  <table>
    <tr>
      <td>姓名：</td>
        <%--        <input type="text" name="name">--%>
      <td>
            <label for="name" class="sr-only">姓名:</label>
            <input type="text" name="name" id="name" class="form-control" placeholder="" required="" autofocus="">
      </td>
    </tr>

    <tr>
      <td>密码：</td>
      <td>
          <div>
<%--              <input type="password" name="password" />--%>
                <label for="password" class="sr-only">密码:</label>
                <input type="text" name="password" id="password" class="form-control" placeholder="" required="" autofocus="">
          </div>
      </td>
    </tr>

    <tr>
      <td>银行卡号：</td>
      <td>
          <div>
<%--              <input type="text" name="kahao">--%>
              <label for="kahao" class="sr-only">银行卡号:</label>
              <input type="text" name="kahao" id="kahao" class="form-control" placeholder="" required="" autofocus="">
          </div>
      </td>
    </tr>

    <tr>
      <td>身份证号：</td>
      <td>
          <div>
<%--              <input type="text" name="id">--%>
              <label for="id" class="sr-only">银行卡号:</label>
              <input type="text" name="id" id="id" class="form-control" placeholder="" required="" autofocus="">
          </div>
      </td>
    </tr>

    <tr>
      <td>电话号码： </td>
      <td>
          <div>
<%--              <input type="text" name="tel">--%>
                <label for="tel" class="sr-only">电话号码:</label>
                <input type="text" name="tel" id="tel" class="form-control" placeholder="" required="" autofocus="">
          </div>
      </td>
    </tr>

    <tr>
      <td>  性别：</td>
      <td>
          <div>
<%--              <input type="text" name="sex">--%>
              <label for="sex" class="sr-only">性别:</label>
              <input type="text" name="sex" id="sex" class="form-control" placeholder="" required="" autofocus="">
          </div>
      </td>
    </tr>

    <tr>
        <td></td>
      <td><button class="btn btn-lg btn-primary btn-block" type="submit">登录</button></td>
    </tr>

  </table>
</form>
</div>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</body>
</html>
