<%@ page import="by.bntu.fitr.poisit.lytkins.students.bean.Student" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html lang=en> 
<head> 
    <meta charset=UTF-8> 
    <title>timer</title> 
</head> 
<body align=center> 
<h1> page from jsp with attribute</h1>
<%
    out.print(request.getAttribute("message"));
%>
<table align=center> 
    <tr> 
            <th>id</th> 
            <th>name</th> 
            <th>lastName</th> 
            <th>email</th> 
            <th>age</th> 
        </tr>
    <%
        for (Student s : (List<Student>)request.getAttribute("studentList")) {
            out.println(
                    "    <tr>\n" +
                            "        <td>" + s.getId() + "</td>\n" +
                            "        <td><a href=\"/school/student/"+(s.getId()) +"\">" + s.getName() + "</a></td>\n" +
                            "        <td>" + s.getLastName() + "</td>\n" +
                            "        <td>" + s.getAge() + "</td>\n" +
                            "    </tr>\n");
        }
    %>


        <tr>
            <th>id</th> 
            <th>name</th> 
            <th>lastName</th> 
            <th>email</th> 
            <th>age</th> 
        </tr> 
</table> 
</body> 
</html>