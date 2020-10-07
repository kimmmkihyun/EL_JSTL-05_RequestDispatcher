<%@page import="myPkg.Person2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
PersonResult_김기현.jsp<br>

<%
	Person2 p2 = (Person2) request.getAttribute("p2");
%>

이름 : <%=p2.getName() %><br>
나이 : <%=p2.getAge() %><br>
성별 : <%=p2.getGender() %><br>
취미 : <%=p2.getHobby() %><br>

p2 : <%=p2.toString() %> <br>
p2-1 : <%=p2 %> <br>
<!-- 참조변수만 쓰면 toString 호출된다 -->