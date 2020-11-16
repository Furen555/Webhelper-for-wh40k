<%@ page contentType="text/html; UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<a href="#" class="btn btn-outline-info">Добавить ростер</a>
<c:if test="${CURRENT_ACCOUNT.login eq 'admin'}">
	<a href="/addweapon" class="btn btn-outline-info">Добавить оружие</a>
	<a href="/addability" class="btn btn-outline-info">Добавить способность</a>
	<a href="#" class="btn btn-outline-info">Добавить доп вооружение</a>
	<a href="#" class="btn btn-outline-info">Добавить модель</a>
	<a href="#" class="btn btn-outline-info">Добавить юнит</a>
</c:if>



<table class="table">
	<thead class="thead-light">
		<tr>
			<th scope="col">#</th>
			<th scope="col">Название</th>
			<th scope="col">Фракция</th>
			<th scope="col"></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${rosters}" var="roster">

			<tr>
				<th scope="row">${roster.id}</th>
				<td>${roster.name}</td>
				<td>${roster.fraction}</td>
				<td><a href="/viewroster?focusId=${roster.id }" class="btn btn-outline-info">Открыть</a>
				 <a href="/editroster?focusId=${roster.id }" class="btn btn-outline-warning">Редактировать</a> 
				 <a href="/deleteroster?focusId=${roster.id }" class="btn btn-outline-danger">Удалить</a></td>
			</tr>

		</c:forEach>
	</tbody>
</table>
