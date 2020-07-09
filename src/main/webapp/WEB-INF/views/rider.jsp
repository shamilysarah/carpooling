
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Providers List</h1>
    <br/><br/>
    <table border="1" cellpadding="10">
            <tr>
                <th>Username</th>
                <th>Carnum</th>
                <th>Origin</th>
                <th>Destination</th>
                <th>Starttime</th>
                <th>Vacancy</th>
                <th>Amount</th>
            </tr>
        
		  <c:forEach items="${providerList}" var="product">
		  <tr>
                <td>${product.username}</td>
                <td>${product.carnum}</td>
                <td>${product.origin}</td>
                <td>${product.destination}</td>
                <td>${product.starttime}</td>
                <td>${product.vacancy}</td>
                <td>${product.amount}</td>
               <td> 
            <a href = "${pageContext.request.contextPath}/choosedcar/${product.username}">ChooseCar</a>
			</td>	|
			
            
				</tr>
		</c:forEach>
	</table>
</body>
</html>