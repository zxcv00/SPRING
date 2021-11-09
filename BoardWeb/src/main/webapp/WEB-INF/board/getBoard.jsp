<%@page import="com.mirim.biz.impl.BoardDAO"%>
<%@page import="com.mirim.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">

<%
	// 세션에 저장된 게시글 정보를 꺼냄
	// BoardVO board = (BoardVO) session.getAttribute("board");
%>
<title>글 상세</title>
</head>
<body>
<center>
	<h1>글 상세</h1>
	<a href="logout.do">Log-out</a>
	
	<hr>
	<form action="updateBoard.do" method="post">
	<input name="seq" type="hidden" value="${board.seq}" />
	
	<table border="1" cellpadding="0" cellspaceing="0">
		<tr>
			<td bgcolor="orange" width="70">제목</td>
			<td align="left"><input name="title" type="text" value="${board.title}"></td>
		</tr>
		<tr>
			<td bgcolor="orange">작성자</td>
			<td align="left">${board.writer}</td>
		</tr>
		<tr>
			<td bgcolor="orange">내용</td>
			<td align="left"><textarea name="content" rows="10" cols="40">${board.content}</textarea></td>
		</tr>
		<tr>
			<td bgcolor="orange">등록일</td>
			<td align="left">${board.regDate}</td>
		</tr>
		<tr>
			<td bgcolor="orange">조회수</td>
			<td align="left">${board.cnt}</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="글 수정">	
			</td>
		</tr>
	</table>
	</form>
	<hr>
	<a href="insertBoard.jsp">글 등록</a>&nbsp;&nbsp;&nbsp;
	<a href="deleteBoard.do?seq=${board.seq}">글 삭제</a>&nbsp;&nbsp;&nbsp;
	<a href="getBoardList.do">글 목록</a>
</center>
</body>
</html>