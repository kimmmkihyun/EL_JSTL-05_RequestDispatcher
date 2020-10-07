<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
calc\end.jsp<br>
<%
	int result = (Integer) request.getAttribute("sum");
%>

<%=request.getParameter("su1") %> +
<%=request.getParameter("su2") %> = 
<%=result %>