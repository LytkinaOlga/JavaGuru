<!DOCTYPE html> 
<html lang=en\>
<head> 
    <meta charset=UTF-8>
    <title>Timer Index</title> 
</head> 
<body align=center>
<h1> cool school jsp</h1>
<a href="/school/students">all students</a>
<a href="/school/students/add">add student</a>
<p>Here goes message
<%
    out.print(request.getAttribute("message"));
%>
</p>
</body> 
</html>