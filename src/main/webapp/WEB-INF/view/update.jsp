<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
    <%@ taglib prefix="fx" uri="http://www.springframework.org/tags/form" %>
     <%
    	String basePath=request.getContextPath();
    
    	pageContext.setAttribute("basePath", basePath);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<LINK href="resources/css/index2.css" type="text/css" rel="stylesheet">
</head>
<body>
<fx:form action="add" method="post" commandName="zw">
	植物名称<fx:input path="zname"/><br>
	植物描述<fx:input path="ms"/><br>
	植物分类<fx:select path="tid">
		<fx:option value="0">请选择植物分类</fx:option>
		<fx:options items="${list}" itemLabel="tname" itemValue="tid"/>
	</fx:select>
	<button>修改</button>
</fx:form>



</body>
</html>