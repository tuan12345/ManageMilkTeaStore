<%--
  Created by IntelliJ IDEA.
  User: jocker
  Date: 05/01/2019
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<tiles:importAttribute name="javascripts"/>
<tiles:importAttribute name="stylesheets"/>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <title><tiles:insertAttribute name="title" ignore="true"/></title>

    <!-- stylesheets -->
    <c:forEach var="css" items="${stylesheets}">
        <link rel="stylesheet" type="text/css" href="<c:url value="${css}"/>">
    </c:forEach>
    <!-- end stylesheets -->


    <!-- scripts -->
    <c:forEach var="script" items="${javascripts}">
        <script src="<c:url value="${script}"/>"></script>
    </c:forEach>
</head>

<body>

<div id="notfound">
    <div class="notfound">
        <div class="notfound-404">
            <tiles:insertAttribute name="context"/>
        </div>
        <a href="${homePage}">Go TO Homepage</a>
    </div>
</div>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>

