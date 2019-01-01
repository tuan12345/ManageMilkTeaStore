<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<spring:url value="/" var="urlHome" />
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<spring:url value="/client/assets/img/slider/s1.jpg" var="s1" />
<spring:url value="/login" var="UrlLogin" />
<spring:url value="/client/assets/img/slider/s2.jpg" var="s2" />
<spring:url value="/client/assets/img/slider/s3.jpg" var="s3" />
<spring:url value="/client/assets/img/logo-white-text.png" var="logowhitetext" />
<spring:url value="/client/assets/img/banner/banner-tratraicaytuoi.png"
	var="bannerTraiCay" />

<header class="header-pos sticky-top">
	<!-- header-bottom-area start -->
	<div class="header-bottom-area">
		<div class="container">
			<div class="inner-container">
				<div class="row">
					<div class="col-md-2 col-sm-4 col-xs-5">
						<div class="logo">
							<a href="index.html"><img src="${logowhitetext }" alt="" /></a>
						</div>
					</div>
					<div class="col-md-8 hidden-xs hidden-sm">
						<div class="main-menu">
							<nav>
								<ul>
									<li><a href="http://bit.do/bromq">home</a>
										<ul>
											<li><a href="index.html">home page</a></li>
										</ul></li>
									<li><a href="about.html">about</a></li>
									<li><a href="blog.html">blog</a></li>
									<li class="static"><a href="shop.html">shop</a>
										<div class="mega-menu">
											<div class="mega-left">
												<span> <a href="shop.html" class="mega-title">WOMEN
														CLOTH </a> <a href="shop.html">casual shirt</a> <a
													href="shop.html">rikke t-shirt</a> <a href="shop.html">mia
														top </a> <a href="shop.html">muscle tee </a>
												</span> <span> <a href="shop.html" class="mega-title">MEN
														CLOTH </a> <a href="shop.html">casual shirt</a> <a
													href="shop.html">rikke t-shirt</a> <a href="shop.html">mia
														top </a> <a href="shop.html">muscle tee </a>
												</span> <span> <a href="shop.html" class="mega-title">WOMEN
														JEWELRY </a> <a href="shop.html">necklace </a> <a
													href="shop.html">chunky short striped </a> <a
													href="shop.html">samhar cuff</a> <a href="shop.html">nail
														set </a>
												</span> <span> <a href="shop.html" class="mega-title">WOMEN
														JEWELRY </a> <a href="shop.html">necklace </a> <a
													href="shop.html">chunky short striped </a> <a
													href="shop.html">samhar cuff</a> <a href="shop.html">nail
														set </a>
												</span> <span> <a href="shop.html" class="mega-title">WOMEN
														JEWELRY </a> <a href="shop.html">necklace </a> <a
													href="shop.html">chunky short striped </a> <a
													href="shop.html">samhar cuff</a> <a href="shop.html">nail
														set </a>
												</span>
											</div>
											<div class="mega-right">
												<span class="mega-menu-img"> <a href="shop.html"><img
														alt="" src="${bannerTraiCay }"></a>
												</span>
											</div>
										</div></li>
									<li><a href="shop.html">cloth</a>
										<div class="mega-menu mega-menu-2">
											<span> <a href="shop.html" class="mega-title">WOMEN
													CLOTH </a> <a href="shop.html">casual shirt</a> <a
												href="shop.html">rikke t-shirt</a> <a href="shop.html">mia
													top </a> <a href="shop.html">muscle tee </a>
											</span> <span> <a href="shop.html" class="mega-title">MEN
													CLOTH </a> <a href="shop.html">casual shirt</a> <a
												href="shop.html">rikke t-shirt</a> <a href="shop.html">mia
													top </a> <a href="shop.html">muscle tee </a>
											</span> <span> <a href="shop.html" class="mega-title">WOMEN
													JEWELRY </a> <a href="shop.html">necklace </a> <a
												href="shop.html">chunky short striped </a> <a
												href="shop.html">samhar cuff</a> <a href="shop.html">nail
													set </a>
											</span> <span class="mega-menu-img"> <a href="shop.html"><img
													alt="" src="${tratraicaytuoi }"></a>
											</span>
										</div></li>
									<li><a href="#">pages</a>
										<ul>
											<li><a href="about.html">about</a></li>
											<li><a href="blog.html">blog</a></li>
											<li><a href="blog-2-column.html">blog 2 column</a></li>
											<li><a href="blog-full-width.html">blog full width</a></li>
											<li><a href="blog-right-sidebar.html">blog right
													sidebar</a></li>
											<li><a href="single-blog.html">single blog</a></li>
											<li><a href="single-blog-video.html">single blog
													video</a></li>
											<li><a href="cart.html">shopping cart</a></li>
											<li><a href="checkout.html">checkout</a></li>
											<li><a href="wishlist.html">wishlist</a></li>
											<li><a href="contact.html">contact</a></li>
											<li><a href="login.html">login</a></li>
											<li><a href="shop.html">shop</a></li>
											<li><a href="product-details.html">product details</a></li>
											<li><a href="shop-full-width.html">shop full width</a></li>
											<li><a href="shop-right-sidebar.html">shop right
													sidebar</a></li>
											<li><a href="404.html">404 error</a></li>
										</ul></li>
									<li><a href="contact.html">contact</a></li>
								</ul>
							</nav>
						</div>
					</div>
					<div class="col-md-2 col-sm-8 col-xs-7 header-right">
						<div class="my-cart">
							<div class="total-cart">
								<a href="cart.html"> <i class="fa fa-shopping-cart"></i> <span>2</span>
								</a>
							</div>
							<ul>
								<li>
									<div class="cart-img">
										<a href="#"><img alt="" src="/client/assets/img/cart/1.png"></a>
									</div>
									<div class="cart-info">
										<h4>
											<a href="#">Vestibulum suscipit</a>
										</h4>
										<span>£165.00 <span>x 1</span></span>
									</div>
									<div class="del-icon">
										<i class="fa fa-times-circle"></i>
									</div>
								</li>
								<li>
									<div class="cart-img">
										<a href="#"><img alt="" src="/client/assets/img/cart/1.png"></a>
									</div>
									<div class="cart-info">
										<h4>
											<a href="#">Vestibulum suscipit</a>
										</h4>
										<span>£165.00 <span>x 1</span></span>
									</div>
									<div class="del-icon">
										<i class="fa fa-times-circle"></i>
									</div>
								</li>
								<li class="cart-border">
									<div class="subtotal-text">Subtotal:</div>
									<div class="subtotal-price">£300.00</div>
								</li>
								<li><a class="cart-button" href="checkout.html">view
										cart</a> <a class="checkout" href="checkout.html">checkout</a></li>
							</ul>
						</div>
						<div class="user-meta">
							<a href="#"><i class="fa fa-cog"></i></a>
							<ul>
								<security:authorize access="isAuthenticated()">
									<li><a href="#">My Account</a></li>

								</security:authorize>

								<li><a href="#">Wish list</a></li>
								<li><a href="#">Checkout</a></li>
								<li><a href="#">Testimonial</a></li>
								<security:authorize access="isAnonymous()">
									<li><a href="${UrlLogin }">Log in</a></li>
								</security:authorize>
								<security:authorize access="isAuthenticated()">
									<li>
										<form action="<c:url value='/j_spring_security_logout' />"
											method="post">
											<input type="hidden" name="${_csrf.parameterName}"
												value="${_csrf.token}" /> <input type="submit"
												value="Log out">
										</form>
									</li>
								</security:authorize>

							</ul>
						</div>
						<div class="header-search">
							<i class="fa fa-search"></i>
							<div class="header-form">
								<form action="#">
									<input type="text" placeholder="search" />
									<button>
										<i class="fa fa-search"></i>
									</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- header-bottom-area end -->
	<!-- mobile-menu-area start -->
	<div class="mobile-menu-area visible-xs visible-sm">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="mobile-menu">
						<nav id="dropdown">
							<ul>
								<li><a href="index.html">Home</a>
									<ul>
										<li><a href="index.html">Homepage Page</a></li>
									</ul></li>
								<li><a href="about.html">About</a></li>
								<li><a href="blog.html">blog</a></li>
								<li><a href="shop.html">Shop</a>
									<ul>
										<li><a href="#">WOMEN CLOTH</a>
											<ul>
												<li><a href="shop.html">casual shirt</a></li>
												<li><a href="shop.html">rikke t-shirt</a></li>
												<li><a href="shop.html">mia top </a></li>
												<li><a href="shop.html">muscle tee</a></li>
											</ul></li>
										<li><a href="#">MEN CLOTH</a>
											<ul>
												<li><a href="shop.html">casual shirt</a></li>
												<li><a href="shop.html">rikke t-shirt</a></li>
												<li><a href="shop.html">mia top </a></li>
												<li><a href="shop.html">muscle tee</a></li>
											</ul></li>
										<li><a href="#">WOMEN JEWELRY</a>
											<ul>
												<li><a href="shop.html">necklace </a></li>
												<li><a href="shop.html">chunky short striped</a></li>
												<li><a href="shop.html">samhar cuff </a></li>
												<li><a href="shop.html">nail set</a></li>
											</ul></li>
									</ul></li>
								<li><a href="shop.html">Footwear </a></li>
								<li><a href="#">Pages</a>
									<ul>
										<li><a href="about.html">about</a></li>
										<li><a href="blog.html">blog</a></li>
										<li><a href="blog-2-column.html">blog 2 column</a></li>
										<li><a href="blog-full-width.html">blog full width</a></li>
										<li><a href="blog-right-sidebar.html">blog right
												sidebar</a></li>
										<li><a href="single-blog.html">single blog</a></li>
										<li><a href="single-blog-video.html">single blog
												video</a></li>
										<li><a href="cart.html">shopping cart</a></li>
										<li><a href="checkout.html">checkout</a></li>
										<li><a href="wishlist.html">wishlist</a></li>
										<li><a href="contact.html">contact</a></li>
										<li><a href="login.html">login</a></li>
										<li><a href="shop.html">shop</a></li>
										<li><a href="product-details.html">product details</a></li>
										<li><a href="shop-full-width.html">shop full width</a></li>
										<li><a href="shop-right-sidebar.html">shop right
												sidebar</a></li>
										<li><a href="404.html">404 error</a></li>
									</ul></li>
								<li><a href="contact.html">Contact</a></li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- mobile-menu-area end -->
</header>
<!-- header end -->
<!-- home slider start -->
<div class="slider-container">
	<!-- Slider Image -->
	<div id="mainSlider" class="nivoSlider slider-image">
		<img src="${s1 }" alt="main slider" title="#htmlcaption1" /> <img
			src="${s2 }" alt="main slider" title="#htmlcaption2" /> <img
			src="${s3 }" alt="main slider" title="#htmlcaption2" />

	</div>
	<!-- Slider Caption 1 -->
	<div id="htmlcaption1" class="nivo-html-caption slider-caption-1">
		<div class="slider-progress"></div>
		<div class="slide1-text">
			<div class="middle-text">
				<div class="cap-dec wow bounceInDown" data-wow-duration="0.9s"
					data-wow-delay="0s">
					<h3>beverage collection in 2018</h3>
				</div>
				<div class="cap-title wow bounceInRight" data-wow-duration="1.2s"
					data-wow-delay="0.2s">
					<h1>Top soft drinks</h1>
				</div>
				<div class="cap-readmore wow bounceInUp" data-wow-duration="1.3s"
					data-wow-delay=".5s">
					<a href="#">shop now</a>
				</div>
			</div>
		</div>
	</div>
	<!-- Slider Caption 2 -->
	<div id="htmlcaption2" class="nivo-html-caption slider-caption-2">
		<div class="slider-progress"></div>
		<div class="slide1-text">
			<div class="middle-text">
				<div class="cap-dec wow bounceIn" data-wow-duration="0.7s"
					data-wow-delay="0s">
					<h3>trendy summer collection 2016</h3>
				</div>
				<div class="cap-title wow bounceIn" data-wow-duration="1s"
					data-wow-delay="0.2s">
					<h1>Top fashion for women</h1>
				</div>
				<div class="cap-readmore wow bounceIn" data-wow-duration="1.1s"
					data-wow-delay=".5s">
					<a href="#">shop now</a>
				</div>
			</div>
		</div>
	</div>
	<div id="htmlcaption3" class="nivo-html-caption slider-caption-1">
		<div class="slider-progress"></div>
		<div class="slide1-text">
			<div class="middle-text">
				<div class="cap-dec wow bounceInDown" data-wow-duration="0.9s"
					data-wow-delay="0s">
					<h3>trendy summer collection 2016</h3>
				</div>
				<div class="cap-title wow bounceInRight" data-wow-duration="1.2s"
					data-wow-delay="0.2s">
					<h1>Top fashion for men</h1>
				</div>
				<div class="cap-readmore wow bounceInUp" data-wow-duration="1.3s"
					data-wow-delay=".5s">
					<a href="#">shop now</a>
				</div>
			</div>
		</div>
	</div>
</div>
