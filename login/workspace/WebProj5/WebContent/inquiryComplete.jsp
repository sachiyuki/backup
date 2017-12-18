<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>お問い合わせ　受付完了</title>
</head>
<body>

<table>
<tbody>
	<tr>
		<th>名前</th>
		<th>お問い合わせの種類</th>
		<th>お問い合わせ内容</th>
	</tr>

	<s:iterator value="#session.inquiryDTOList">
	<tr>
		<td><s:property value="name"/></td>
		<td>
		<s:if test='qtype=="company"'>会社について</s:if>
		<s:if test='qtype=="product"'>製品について</s:if>
		<s:if test='qtype=="support"'>アフターサポートについて</s:if>
		</td>
		<td><s:property value="body"/></td>
	</tr>
	</s:iterator>
</tbody>
</table>

</body>
</html>