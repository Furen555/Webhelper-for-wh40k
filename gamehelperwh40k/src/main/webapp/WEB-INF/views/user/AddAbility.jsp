<%@ page contentType="text/html; UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="card">
	<div class="card-header">Add new weapon</div>
	<div class="card-body">
		<form action="/addability" method="POST">
			<div class="form-group">
				<label>Name</label> <input type="text" class="form-control" name="name" placeholder="Enter name of ability">
			</div>
			<div class="form-group">
				<label>Description</label> <textarea input type="text" class="form-control" name="discription" placeholder="Enter description"></textarea> 
			</div>
			<div class="form-group">
				<label for="inputState">Fraction</label> <select name="fraction" class="form-control">
					<option selected>Space Marines</option>
					<option>Necrones</option>
					<option>Adeptus Mechanicus</option>
					<option>Imperial guard</option>
				</select>
			</div>

			<button type="submit" class="btn btn-primary">Add</button>
			<a href="/user/home" class="btn btn-outline-danger">Cancel</a>
		</form>

	</div>
</div>