<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 확인</title>
<script src="./js/jquery.js"></script>
<script>
function check(){
	if($.trim($("#pwdarg").val())==""){
		alert("비밀번호를 입력하세요!");
		$("#pwdarg").val("").focus();
		return false;
	}
}
</script>

</head>
<body>
	<form method="post" action="checkAction.action"
		onsubmit="return check()">
		<s:hidden name="num" value="%{num}" />
		<%-- s:hidden 은 스트럿츠2 태그로서 input type=hidden과 같다. --%>
		<table align="center" border="1">
			<tr>
				<th colspan="2">비밀번호 확인</th>
			</tr>
			<tr>
				<th>비밀번호 입력</th>
				<td><s:password name="pwdarg" id="pwdarg" theme="simple"
						cssStyle="width:100px;" /></td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="확인" /> <input
					type="reset" value="취소" onclick="$('#pwdarg').focus();" /></th>
			</tr>
		</table>
	</form>
</body>
</html>