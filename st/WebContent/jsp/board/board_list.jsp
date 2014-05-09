<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- 스트럿츠 2 태그 라이브러리 --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>스트럿츠 게시판 목록</title>
</head>
<body>
	<table align="center" border="1">
		<tr>
			<th colspan="5">스트럿츠 2 목록</th>
		</tr>
		<tr>
			<td align="right" colspan="5">총 게시물 수:<s:property	value="totalCount" /></td>
		</tr>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>이름</th>
			<th>조회수</th>
			<th>날짜</th>
		</tr>
		<s:iterator value="list">
			<%-- 스트럿츠2 태그로서 목록갯수만큼 반복자를 구해서 반복  --%>
			<tr>
				<th><s:property value="board_no" /></th>
				<th><a href="board_cont.action?num=<s:property value="board_no" />">
				 <s:property value="board_title" /></a>
				 </th>
				<th><s:property value="board_name" /></th>
				<th><s:property value="board_hit" /></th>
				<th><s:property value="board_date" /></th>
			</tr>
		</s:iterator>
		<tr>
			<th colspan="5"><input type="button" value="입력"
				onclick="location='board_write.action'" /></th>
		</tr>
	</table>
</body>
</html>