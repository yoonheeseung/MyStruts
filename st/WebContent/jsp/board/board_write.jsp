<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Struts2 프레임웍 공부</title>
<script type="text/javascript" src="./js/jquery.js"></script>
<script type="text/javascript" src="./js/board.js"></script>
</head>
<body>
<form method="post" action="board_write_ok.action" onsubmit="return check()">
<table align="center" border="1">
<tr>
<th colspan="2">struts2 글쓰기</th>
</tr>
<tr>
<th>이름</th>
<td>
<s:textfield name="board_name" id="board_name" theme="simple" cssStyle="width:100px;"/>
<%-- s:textfield태그는 스트럿츠2태그로서 한 줄 입력박스를 만든다. input type="text"와 같다. --%>
</td>
</tr>
<tr>
<th>제목</th>
<td>
<s:textfield name="board_title" id="board_title" theme="simple" cssStyle="width:330px;"/>
</td>
</tr>
<tr>
<th>비밀번호</th>
<td>
<s:password name="board_pwd" id="board_pwd" theme="simple" cssStyle="width:100px;"/>
<%-- s:password 스트럿츠2테그는 입력박스 입력값을 암호화 한다.
   즉, input type="password"와 같다. --%>
</td>
</tr>
<tr>
<th>글내용</th>
<td>
<s:textarea name="board_cont" id="board_cont" rows="9" cols="38" theme="simple"/>
<%--s:textarea 스트럿츠2태그는 한줄이상 입력박스를 만든다.
   textarea와 같다. 다른 점은 s:textarea에서는 value속성을 
   사용할 수 있다. 그리고, textarea에서는 반드시 
   <textarea></textarea>로 처리해야한다. --%>
   </td>
   </tr>
   <tr>
   <th colspan="2">
   <input type="submit" value="작성"/>
   <input type="reset" value="취소" onclick="$('#board_name').focus();"/>
   </th>
   </tr>
</table>
</form>
</body>
</html>