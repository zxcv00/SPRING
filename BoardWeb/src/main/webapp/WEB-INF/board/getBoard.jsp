<%@page import="com.mirim.biz.impl.BoardDAO"%>
<%@page import="com.mirim.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">

<%
	// ���ǿ� ����� �Խñ� ������ ����
	// BoardVO board = (BoardVO) session.getAttribute("board");
%>
<title>�� ��</title>
</head>
<body>
<center>
	<h1>�� ��</h1>
	<a href="logout.do">Log-out</a>
	
	<hr>
	<form action="updateBoard.do" method="post">
	<input name="seq" type="hidden" value="${board.seq}" />
	
	<table border="1" cellpadding="0" cellspaceing="0">
		<tr>
			<td bgcolor="orange" width="70">����</td>
			<td align="left"><input name="title" type="text" value="${board.title}"></td>
		</tr>
		<tr>
			<td bgcolor="orange">�ۼ���</td>
			<td align="left">${board.writer}</td>
		</tr>
		<tr>
			<td bgcolor="orange">����</td>
			<td align="left"><textarea name="content" rows="10" cols="40">${board.content}</textarea></td>
		</tr>
		<tr>
			<td bgcolor="orange">�����</td>
			<td align="left">${board.regDate}</td>
		</tr>
		<tr>
			<td bgcolor="orange">��ȸ��</td>
			<td align="left">${board.cnt}</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="�� ����">	
			</td>
		</tr>
	</table>
	</form>
	<hr>
	<a href="insertBoard.jsp">�� ���</a>&nbsp;&nbsp;&nbsp;
	<a href="deleteBoard.do?seq=${board.seq}">�� ����</a>&nbsp;&nbsp;&nbsp;
	<a href="getBoardList.do">�� ���</a>
</center>
</body>
</html>