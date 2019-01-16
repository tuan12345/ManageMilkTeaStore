<%--
  Created by IntelliJ IDEA.
  User: jocker
  Date: 11/01/2019
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="shortcut icon" type="image/x-icon" href="/client/assets/img/favicon.ico">
    <!-- Place favicon.ico in the root directory -->

    <!-- stylesheets -->
    <c:forEach var="css" items="${stylesheets}">
        <link rel="stylesheet" type="text/css" href="<c:url value="${css}"/>">
    </c:forEach>
    <!-- end stylesheets -->
</head>
<body>
    <input id="token-status" type="text" name="status" value="${status}" hidden="hidden">
    <div id="popup-confirm-token" class="popup-wrap">
        <div class="popup-box">
            <h2 id="token-title"></h2>
            <h3 id="messageConfirm"></h3>
            <button href="" id="bt-create-token" class="button-container hidden">Create token</button>
            <button id="bt-success" class="button-container bg-success">OK</button>
        </div>
    </div>
    <!-- scripts -->
    <c:forEach var="script" items="${javascripts}">
        <script src="<c:url value="${script}"/>"></script>
    </c:forEach>
    <%-- End scripts --%>
</body>
</html>
