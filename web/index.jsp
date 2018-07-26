<%--
  Created by IntelliJ IDEA.
  User: Marina
  Date: 26.07.2018
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Home work #2</title>
</head>
<body>
<form action="question" method="POST">
  <b>Your Name is:</b><br>
  <input type ="text" size="30"><br>
  </p>
  <p>
    <b>Your Surname is:</b><br>
    <input type ="text" size="30"><br>
  </p>
  </p>
  <p><b>Your Age is:</b><br>
    <input type ="radio" name="humanage" value="child">7-12<br>
    <input type ="radio" name="humanage" value="teenager">13-17<br>
    <input type ="radio" name="humanage" value="young">18-21<br>
    <input type ="radio" name="humanage" value="average">22-60<br>
    <input type ="radio" name="humanage" value="ages">61-75<br>
    <input type ="radio" name="humanage" value="old">76-90<br>
  </p>
  <b>How mach you spend time studying in the week:</b><br>
  <input type ="radio" name="study" value="notstudy">Just llisten in the class<br>
  <input type ="radio" name="study" value="few">1 hour<br>
  <input type ="radio" name="study" value="little">2-3 hour<br>
  <input type ="radio" name="study" value="middle">4-7 hour<br>
  <input type ="radio" name="study" value="amidle">8-15hour<br>
  <input type ="radio" name="study" value="lotof">16-29 hour<br>
  <input type ="radio" name="study" value="lotsof">30 or more hour<br>
  </p>
  <p><input type="submit" name ="send" value="Send">
  </p>
</form>
</body>
</html>