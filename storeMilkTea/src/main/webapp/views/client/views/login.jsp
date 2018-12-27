<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/" var="homeUrl"></spring:url>

<div class="login-area">
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<div class="login-content">
					<h2 class="login-title">Login</h2>
					<p>Hello,Welcome to your account</p>
					<div class="social-sign">
						<a href="#"><i class="fa fa-facebook"></i> Sign in with
							facebook</a> <a class="twitter" href="#"><i class="fa fa-twitter"></i>
							Sign in with twitter</a>
					</div>
					<form action="<c:url value='/j_spring_security_login' />"
						method="POST">
						<label>User Name</label> <input type="text" placeholder="Username"
							name="username" autofocus /> <label>Password</label> <input
							type="password" name="password" placeholder="Password" />
						<div class="login-lost">
							<span class="log-rem"> <input type="checkbox"
								name="remember-me" /> <label>Remember me!</label>
							</span> <span class="forgot-login"> <a href="#">Forgot your
									password?</a>
							</span>
						</div>
						<input class="login-sub" type="submit" value="Login" /> <input
							type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
					</form>
				</div>
			</div>
			<div class="col-md-6">
				<div class="login-content login-margin">
					<h2 class="login-title">create a new account</h2>
					<p>Create your own Unicase account.</p>
					<form action="#">
						<label>Email Address</label> <input type="text" /> <input
							class="login-sub" type="submit" value="sign up" />
					</form>
					<div class="sign-up-today">
						<h2 class="login-title">sign up today and you'll be able to:</h2>
						<ul>
							<li><span> <i class="fa fa-check-square-o"></i> <span>speed
										your way through the checkout</span>
							</span></li>
							<li><span> <i class="fa fa-check-square-o"></i> <span>track
										your order easily</span>
							</span></li>
							<li><span> <i class="fa fa-check-square-o"></i> <span>keep
										a record of your all purchase</span>
							</span></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>