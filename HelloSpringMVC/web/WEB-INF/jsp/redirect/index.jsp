<%--
  Created by IntelliJ IDEA.
  User: wug
  Date: 2016/1/28 0028
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring Page Redirection</title>
</head>
<body>
<h2>Spring Page Redirection</h2>

<p>Click below button to redirect the result to new page</p>
<form:form method="GET" action="redirect">
    <table>
        <tr>
            <td>
                <input type="submit" value="Redirect Page"/>
            </td>
        </tr>
    </table>
</form:form>

<form:form method="GET" action="staticPage">
    <table>
        <tr>
            <td>
                <input type="submit" value="Static Page"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
