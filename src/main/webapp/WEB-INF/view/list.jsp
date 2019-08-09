<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
     <%
    	String basePath=request.getContextPath();
    
    	pageContext.setAttribute("basePath", basePath);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/js/jquery-1.8.2.min.js"></script>
<LINK href="resources/css/index2.css" type="text/css" rel="stylesheet">
</head>
<body>
<form action="list" method="post">
	查询内容<input type="text" name="zname" value="${zname}">
	<input type="submit" value="搜索">
</form>
<table>
	<tr>
		<td><input type="button" value="全选" onclick="chk(1)"></td>
		<td>序号</td>
		<td>植物名称</td>
		<td>描述</td>
		<td>类别</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${list}" var="s">
		<tr>
			<td><input type="checkbox" name="ck" value="${s.tid}"></td>
			<td>${s.tid}</td>
			<td>${s.zname}</td>
			<td>${s.ms}</td>
			<td>${s.tname}</td>
			<td>
				<input type="button" value="删除" onclick="del(${s.tid})">
				<input type="button" value="修改" onclick="toUpdate(${s.tid})">
				<input type="button" value="查看" onclick="toCha(${s.tid})">
			</td>
		</tr>
	</c:forEach>
	<tr>
		<td><input type="button" value="添加" onclick="toadd()">
		<input type="button" value="批量删除" onclick="delAll()">
		</td>
		<td colspan="11">${fenye}</td>
	</tr>
</table>
<script type="text/javascript">
	function toUpdate(tid){
		location.href="toUpdate?tid="+tid
	}
	function toadd(){
		location.href="toadd";
	}
	function toCha(){
		location.href="toCha?tid="+tid;
	}
	function del(tid){
		var a=confirm("您确认删除tid为"+tid+"的数据吗")
		if(a){
			$.post("del",{tid:tid},function(obj){
				if(obj){
					alert("删除成功")
					location.reload();
				}else{
					alert("删除失败")
				}
			})
		}
	}
	function chk(flag){
		if(flag==1){
			$("[name='ck']").prop("checked",true)
		}
		
	}
	function delAll(){
		var tid="";
		$("[name='ck']:checked").each(function(){
			tid+=","+$(this).val();
		})
		tid=tid.substring(1);
		del(tid)
	}
</script>
</body>
</html>