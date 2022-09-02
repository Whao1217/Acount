<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	名&nbsp;字：<input type="text" name="username" value="请输入用户名" size="20" maxlength="6"/><br/>
	<br/>
	密&nbsp;码：<input type="password" name="pass" value="" size="20" maxlength="10"/><br/>
	<br/>
	性别：<input type="radio" name="sex" value="nan" checked="checked"/><img src="Male.jpg"/>男
		 <input type="radio" name="sex" value="nv"/><img src="Female.jpg"/>女<br/>
	<br/>
	爱好：<input type="checkbox" value="lioatian" name="hobby"/>聊天
		 <input type="checkbox" value="yundong" name="hobby"/>运动<br/>
	<br/>
	出生日期：<input name="byear" value="yyyy" size="4" maxlength="4"/>
	&nbsp;年
	<select name="bmon">
		<option value="" selected>[选择月份]</option>
		<option value="0">一月</option>
		<option value="1">二月</option>
		<option value="2">三月</option>
		<option value="3">四月</option>	
		<option value="4">五月</option>
		<option value="5">六月</option>
		<option value="6">七月</option>
		<option value="7">八月</option>
		<option value="8">九月</option>
		<option value="9">十月</option>
		<option value="10">十一月</option>
		<option value="11">十二月</option>
	</select>
	月&nbsp;
	<input name="bday" value="dd" size="2" maxlength="2"/>
	日
	<br/>
	<br/>
	<br/>
	<br/>
	<input type="submit" name="tijiao" value="提交"/>
	&nbsp;
	<input name="reset" type="reset" value="重填"/>
</body>
</html>