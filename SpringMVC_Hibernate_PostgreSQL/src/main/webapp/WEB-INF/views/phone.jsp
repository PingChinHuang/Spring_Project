<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Phone Page</title>
</head>
<body>
<h1>Add a Phone</h1>
<c:url var="addAction" value="/phones/add" ></c:url>
<form:form action="${addAction}" commandName="phone">
<table>
	<c:if test="${!empty phone.name}">
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:label path="id" readonly="true" size="8" disabled="true" />
			<form:hidden path="id" />
		</td>
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="name">
				<spring:message text="Name" />
			</form:label>
		</td>
		<td>
			<form:input path="name" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="review">
				<spring:message text="Review" />
			</form:label>
		</td>
		<td>
			<form:input path="review" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty phone.name}">
				<input type="submit" value="<spring:message text="Edit Phone"/>"/>
			</c:if>
			<c:if test="${empty phone.name}">
				<input type="submit" value="<spring:message text="Add Phone"/>"/>
			</c:if>
		</td>
	</tr>
</table>
</form:form>
<br>

<h3>Phone List</h3>
<c:if test="${!empty listPhones}">
	<table class="tg">
		<tr>
			<th width="80">ID</th>
			<th width="120">Phone Name</th>
			<th width="120">Review</th>
			<th width="120">Action</th>
		</tr>
		<c:forEach items="${listPhones}" var="phone">
			<tr>
				<td>${phone.id}</td>
				<td>${phone.name}</td>
				<td>${phone.review}</td>
				<td>
					<a href="<c:url value='/edit/${phone.id}'/>" class="button">Edit</a>
					<a href="<c:url value='/remove/${phone.id}'/>" class="button">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>
</html>