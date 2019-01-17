<%--
  Created by IntelliJ IDEA.
  User: tungct
  Date: 2019-01-02
  Time: 00:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- shop-area start -->
<div class="shop-area">
	<div class="container">
		<div class="row">
			<!-- left-sidebar start -->
			<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">
				<!-- widget-categories start -->
				<aside class="widget widget-categories">
					<h3 class="sidebar-title">Categories</h3>
					<ul class="sidebar-menu">
						<c:forEach items="${categoryInfos }" var="categoryInfo">
							<li><a href="#">${categoryInfo.name }</a> <span
								class="count">(${categoryInfo.productInfos.size() })</span></li>
						</c:forEach>
					</ul>
				</aside>
				<!-- widget-categories end -->
				<!-- shop-filter start -->
				<aside class="widget shop-filter">
					<h3 class="sidebar-title">Filter selection</h3>
					<div class="info_widget">
						<div class="price_filter">
							<div id="slider-range"></div>
							<div class="price_slider_amount">
								<input type="text" id="amount" name="price"
									placeholder="Add Your Price" /> <input type="submit"
									value="Filter" />
							</div>
						</div>
					</div>
				</aside>
				<!-- shop-filter end -->
				<!-- filter-by start -->
				<aside class="widget filter-by">
					<h3 class="sidebar-title">Product price</h3>
					<ul class="sidebar-menu">
						<li><a href="#">L</a> <span class="count">(1)</span></li>
						<li><a href="#">M</a> <span class="count">(1)</span></li>
						<li><a href="#">S</a> <span class="count">(1)</span></li>
						<li><a href="#">XL</a> <span class="count">(1)</span></li>
						<li><a href="#">XXL</a> <span class="count">(1)</span></li>
					</ul>
				</aside>
				<!-- filter-by end -->
				<!-- widget start -->
				<aside class="widget filter-by">
					<h3 class="sidebar-title">Color</h3>
					<ul class="sidebar-menu">
						<li><a href="#">Black</a> <span class="count">(1)</span></li>
						<li><a href="#">White</a> <span class="count">(8)</span></li>
						<li><a href="#">Orange</a> <span class="count">(5)</span></li>
						<li><a href="#">Blue</a> <span class="count">(7)</span></li>
						<li><a href="#">Yellow</a> <span class="count">(11)</span></li>
						<li><a href="#">Brown</a> <span class="count">(16)</span></li>
						<li><a href="#">red</a> <span class="count">(9)</span></li>
					</ul>
				</aside>
				<!-- widget end -->
				<!-- widget start -->
				<aside class="widget widget-categories">
					<h3 class="sidebar-title">Recent Product</h3>
					<div class="recent-product">
						<div class="single-product">
							<div class="product-img">
								<a href="single-product.html"> <img src="img/product/12.jpg"
									alt="" /> <img class="secondary-img" src="img/product/18.jpg"
									alt="" />
								</a>
							</div>
							<div class="product-content">
								<h3>
									<a href="single-product.html">Lorem ipsum dolor</a>
								</h3>
								<div class="price">
									<span>$80.00</span> <span class="old">$90.11</span>
								</div>
							</div>
						</div>
						<div class="single-product">
							<div class="product-img">
								<a href="single-product.html"> <img src="img/product/22.jpg"
									alt="" /> <img class="secondary-img" src="img/product/18.jpg"
									alt="" />
								</a>
							</div>
							<div class="product-content">
								<h3>
									<a href="single-product.html">Lorem ipsum dolor</a>
								</h3>
								<div class="price">
									<span>$80.00</span> <span class="old">$90.11</span>
								</div>
							</div>
						</div>
						<div class="single-product">
							<div class="product-img">
								<a href="single-product.html"> <img src="img/product/14.jpg"
									alt="" /> <img class="secondary-img" src="img/product/18.jpg"
									alt="" />
								</a>
							</div>
							<div class="product-content">
								<h3>
									<a href="single-product.html">Lorem ipsum dolor</a>
								</h3>
								<div class="price">
									<span>$80.00</span> <span class="old">$90.11</span>
								</div>
							</div>
						</div>
					</div>
				</aside>
				<!-- widget end -->
				<!-- widget-tags start -->
				<aside class="widget product-tag">
					<h3 class="sidebar-title">Popular Tags</h3>
					<ul>
						<li><a href="#">Top</a></li>
						<li><a href="#">Fashion</a></li>
						<li><a href="#">Collection</a></li>
						<li><a href="#">Women</a></li>
						<li><a href="#">men</a></li>
						<li><a href="#">gallery</a></li>
						<li><a href="#">new</a></li>
						<li><a href="#">Collection men</a></li>
						<li><a href="#">Top</a></li>
						<li><a href="#">Fashion</a></li>
						<li><a href="#">Collection</a></li>
						<li><a href="#">best</a></li>
						<li><a href="shop.html">cloth</a></li>
					</ul>
				</aside>
				<!-- widget-tags end -->
				<aside class="widget sale-off hidden-sm">
					<div class="sale-off-carosel">
						<div class="single-sale">
							<a href="#"> <img src="img/product/16.jpg" alt="" />
								<h2>sale off</h2>
							</a>
						</div>
						<div class="single-sale">
							<a href="#"> <img src="img/product/5.jpg" alt="" />
								<h2>sale off</h2>
							</a>
						</div>
						<div class="single-sale">
							<a href="#"> <img src="img/product/6.jpg" alt="" />
								<h2>sale off</h2>
							</a>
						</div>
						<div class="single-sale">
							<a href="#"> <img src="img/product/7.jpg" alt="" />
								<h2>sale off</h2>
							</a>
						</div>
						<div class="single-sale">
							<a href="#"> <img src="img/product/4.jpg" alt="" />
								<h2>sale off</h2>
							</a>
						</div>
					</div>
				</aside>
			</div>
			<!-- left-sidebar end -->
			<div class="col-md-9 col-sm-12 col-xs-12">
				<div class="shop-content">
					<!-- Nav tabs -->
					<ul class="shop-tab" role="tablist">
						<li><span class="sorting-name"> View as: </span></li>
						<li role="presentation" class="active"><a href="#home"
							aria-controls="home" role="tab" data-toggle="tab"><i
								class="fa fa-th" aria-hidden="true"></i></a></li>
						<li role="presentation"><a href="#profile"
							aria-controls="profile" role="tab" data-toggle="tab"><i
								class="fa fa-th-list" aria-hidden="true"></i></a></li>
					</ul>
					<div class="short-by">
						<span class="sorting-show"> Sort by:</span> <select>
							<option value="volvo">popularity</option>
							<option value="saab">Default</option>
							<option value="mercedes">average rating</option>
							<option value="audi">newness</option>
							<option value="audi">low to high</option>
							<option value="audi">high to low</option>
						</select>
					</div>
					<div class="shop-show">
						<span class="sorting-show"> Show:</span> <select>
							<option value="volvo">9</option>
							<option value="saab">10</option>
							<option value="mercedes">11</option>
							<option value="audi">12</option>
							<option value="audi">15</option>
							<option value="audi">16</option>
						</select>
					</div>
					<div class="shop-breadcrumb">
						<ul>
						<spring:url value="/shop" var="urlShop"></spring:url>
						
							<c:forEach begin="1" end="${totalPage }" var="page" step="1">
								<c:choose>
									<c:when test="${page==currentPage }">
										<li class="pagging active"><a href="${urlShop }?page=${page}">${page}</a></li>
									</c:when>
									<c:otherwise>
										<li><a class="pagging" href="${urlShop }?page=${page}">${page }</a></li>
									</c:otherwise>
								</c:choose>
							</c:forEach>
							
							<li><a href="#"><i class="fa fa-angle-right"></i></a></li>
						</ul>
						
					</div>

					<div class="clear"></div>
					<!-- Tab panes -->
					<div class="tab-content">
						<div role="tabpanel" class="tab-pane active" id="home">
							<div class="row" >
								<!-- single-product start -->
								<c:forEach items="${productInfos }" var="productInfo">
									<spring:url value="/client/assets/img/product" var="urlImage"></spring:url>
									<div class="col-md-3 col-sm-4">
										<div class="single-product" style="margin-top: 10px;">
											<div class="product-img">
												<a href="single-product.html"> <img
													src="${urlImage }/${productInfo.image}" alt="" /> <img
													class="secondary-img" src="img/product/2.jpg" alt="" />
												</a> <span class="tag-line">new</span>
												<div class="product-action">
													<div class="button-top">
														<a href="#" data-toggle="modal"
															data-target="#productModal"><i class="fa fa-search"></i></a>
														<a href="#"><i class="fa fa-heart"></i></a>
													</div>
													<div class="button-cart">
														<button>
															<i class="fa fa-shopping-cart"></i> add to cart
														</button>
													</div>
												</div>
											</div>
											<div class="product-content">
												<h3>
													<a href="single-product.html">${productInfo.name }</a>
												</h3>
												<div class="price">
													<span>${productInfo.price }</span> <span class="old">$90.11</span>
												</div>
											</div>
										</div>
									</div>
								</c:forEach>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- shop-area end -->
