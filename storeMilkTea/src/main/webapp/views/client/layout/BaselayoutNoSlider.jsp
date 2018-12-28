<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="">
<meta name="author" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<spring:url value="/client/assets/css/bootstrap.min.css" var="bootstrapCss" />
<spring:url value="/client/assets/css/animate.css" var="animateCss" />
<spring:url value="/client/assets/css/jquery-ui.min.css" var="jqueyryUiCss" />
<spring:url value="/client/assets/css/meanmenu.min.css" var="meanmenuCss" />
<spring:url value="/client/assets/css/owl.carousel.css" var="carouselCss" />
<spring:url value="/client/assets/lib/css/nivo-slider.css" var="nivosliderCss" />
<spring:url value="/client/assets/css/font-awesome.min.css"
	var="fontCss" />
<spring:url value="/client/assets/customCss/style.css" var="styleCss" />
<spring:url value="/client/assets/css/responsive.css" var="responsiveCss" />
<spring:url value="/client/assets/js/vendor/modernizr-2.8.3.min.js"
	var="modernizrJs" />
	<spring:url value="/client/assets/js/vendor/jquery-1.12.0.min.js"
	var="jqueyMinJs" />
	<spring:url value="/client/assets/js/bootstrap.min.js"
	var="bootstrapMinJs" />
	<spring:url value="/client/assets/js/owl.carousel.min.js"
	var="owlcarouselminJs" />
	<spring:url value="/client/assets/js/jquery.meanmenu.js"
	var="jquerymeanmenuJs" />
	<spring:url value="/client/assets/js/jquery-ui.min.js"
	var="jqueryuiminJs" />
	<spring:url value="/client/assets/lib/js/jquery.nivo.slider.pack.js"
	var="jquerynivosliderpackJs" />
	<spring:url value="/client/assets/lib/js/nivo-active.js"
	var="nivoactiveJs" />
	<spring:url value="/client/assets/js/wow.min.js"
	var="wowminJs" />
	<spring:url value="/client/assets/js/plugins.js"
	var="pluginsJs" />
	<spring:url value="/client/assets/js/main.js"
	var="mainJs" />
	
<link rel="stylesheet" href="${bootstrapCss}" />
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
<link rel="stylesheet" href="${animateCss}" />
<link rel="stylesheet" href="${jqueyryUiCss}" />
<link rel="stylesheet" href="${meanmenuCss}" />
<link rel="stylesheet" href="${carouselCss}" />
<link rel="stylesheet" href="${nivosliderCss}" />
<link rel="stylesheet" href="${styleCss}" />
<link rel="stylesheet" href="${responsiveCss}" />
<script src="${modernizrJs}" type="text/javascript"></script>

<title><tiles:insertAttribute name="title" ignore="true" /></title>
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
	
	<script src="${jqueyMinJs}" type="text/javascript"></script>
	<script src="${bootstrapMinJs}" type="text/javascript"></script>
	<script src="${owlcarouselminJs}" type="text/javascript"></script>
	<script src="${jquerymeanmenuJs}" type="text/javascript"></script>
	<script src="${jqueryuiminJs}" type="text/javascript"></script>
	<script src="${jquerynivosliderpackJs}" type="text/javascript"></script>
	<script src="${nivoactiveJs}" type="text/javascript"></script>
	<script src="${wowminJs}" type="text/javascript"></script>
	<script src="${pluginsJs}" type="text/javascript"></script>
	<script src="${mainJs}" type="text/javascript"></script>