<%@page import="VoHuyBean.VoHuyBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"">
</head>
<body>
	<div class="container">
		<form action="VoHuyController" method="post">
			<input type="text" name="txttk">
			<input type="submit" name="tx" value="Search">
		</form>

		<%
			ArrayList<VoHuyBean> ds;
		if (request.getAttribute("lstma") != null) {
			ds = (ArrayList<VoHuyBean>) request.getAttribute("lstma");
		} else
			ds = (ArrayList<VoHuyBean>) request.getAttribute("lsttin");
		%>
		
			<%
				int n = ds.size();
			for (int i = 0; i < n; i++) {
			%>
				<p>Tiêu đề: <%=ds.get(i).getTieude() %> </p><br>
				<p>Tóm tắt: <%=ds.get(i).getTomtat() %> </p><br>
				<p>Ngày đưa tin: <%=ds.get(i).getNgayduatin() %> </p><br>
				<p>Nội dung: <%=ds.get(i).getNoidung() %> </p><br>
				<p>----------------------------------------------- </p>
			<%
				}
			%>
	</div>
</body>
</html>