<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
calc\start.jsp<br>


<%
	String context = request.getContextPath();
	out.println(context);

%>
<!-- 프로젝트에서 start.do url을 맵핑하게 해야한다. -->
<form action="<%=context %>/start.do" method="post">

	숫자1 : <input type="text" name="su1" value="11"><br>
	숫자2 : <input type="text" name="su2" value="22"><br>
	
	<input type="submit" value="전송">
</form>