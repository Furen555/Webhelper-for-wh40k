<%@ page contentType="text/html; UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
	
		
		<div class="card">
			<div class="card-header">Please login</div>
			<div class="card-body">
				<form action="/login" method="POST">
					<div class="form-group">
						<label>Login</label>
						<input type="text" class="form-control" name="login" placeholder="Enter your login">
					</div>
					<div class="form-group">
						<label>Password</label>
						<input type="password" class="form-control" name="password" placeholder="Password">
						<small id="emailHelp" class="form-text text-muted"><a class="nav-link" href="#foo" data-toggle="modal" data-target="#exampleModal">Forget
								password</a></small>
					</div>
					<button type="submit" class="btn btn-primary">Sign in</button>
					<a href="/registration" class="btn btn-success">Registration</a>
				</form>

			</div>
		</div>

