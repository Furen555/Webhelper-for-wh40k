<%@ page contentType="text/html; UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="card">
	<div class="card-header">Add new weapon</div>
	<div class="card-body">
		<form action="/addweapon" method="POST">
			<div class="form-group">
				<label>Name</label> <input type="text" class="form-control" name="name" placeholder="Enter name">
			</div>
			<div class="form-group">
				<label>Range</label> <input type="text" class="form-control" name="range" placeholder="Enter range">
			</div>
			<div class="form-group">
				<label>Type</label> <input type="text" class="form-control" name="type" placeholder="Enter type">
			</div>
			<div class="form-group">
				<label>S</label> <input type="text" class="form-control" name="s" placeholder="Enter strenght">
			</div>
			<div class="form-group">
				<label>Ap</label> <input type="text" class="form-control" name="ap" placeholder="Enter armor penetration">
			</div>
			<div class="form-group">
				<label>D</label> <input type="text" class="form-control" name="d" placeholder="Enter damage">
			</div>
			<div class="form-group">
				<label>Ability</label>
				<textarea input type="text" class="form-control" name="ability" placeholder="Enter ability"></textarea>
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
			<a href="/user/home" class="btn btn-outline-danger">Back to rosters</a>
		</form>

	</div>
</div>