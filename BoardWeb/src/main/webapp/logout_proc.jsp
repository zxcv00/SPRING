<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<% 
	// 1. �������� ����� ���� ��ü�� ���� ����
	session.invalidate();

	// 2. ���� ���� ��, ���� ȭ������ �̵�
	response.sendRedirect("login.jsp");
%>