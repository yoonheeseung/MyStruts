<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>스트럿츠 2 게시판 내용보기</title>
<script>
function open_win(url,name){
	window.open(url, name, "scrollbars=yes,width=500,height=500");
	//자바스크립트에서 window객체 하위의 open()메서드는 새로운 이벤트 창을 만든다.
	//open(공치창경로 또는 파일명,공지창이름, 공지창 속성)
	//폭이 500,높이 500이고, 스크롤 바가 생성되는 공지창을 만듬
}

</script>
</head>
<body>
<table align="center" border="1">
<tr>
<th colspan="2">스트럿츠 2 게시판 내용</th>
</tr>
<tr>
<th>번호</th>
<td><s:property value="num" /></td>
</tr>
<tr>
<th>제목</th>
<td>
<s:property value="boardVo.board_title" />
</td>
</tr>
<tr>
<th>조회수</th>
<td><s:property value="boardVo.board_hit" /></td>
</tr>
<tr>
<th>내용</th>
<td><s:property value="boardVo.board_cont" /></td>
</tr>
<tr>
<th colspan="2">
<input type="button" value="수정"
 onclick="open_win('checkFormAction.action?num=<s:property value="num" />','edit')" />
<input type="button" value="삭제" onclick="open_win('checkFormAction.action?num=<s:property value="num" />','del')" />
<input type="button" value="목록" onclick="location='listAction.action'" />
</th>
</tr>
</table>
</body>
</html>