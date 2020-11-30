<%@ page import="by.bntu.fitr.poisit.lytkins.students.bean.Student" %>
<!DOCTYPE html>
<html lang=en>
<head>
    <meta charset=UTF-8>
    <title>timer</title>
</head>
<body >
<h1> This one will never change! Page from jsp</h1>
<%
    out.print(request.getAttribute("message"));
%>
<table >
    <tr>
        <td>
            <img src=https://upload.wikimedia.org/wikipedia/commons/a/a0/Reuni%C3%A3o_com_o_ator_norte-americano_Keanu_Reeves_%28cropped%29.jpg
                 width=150px
                 height=150px/>
        </td>
        <td>
            <%
                Student s = (Student) request.getAttribute("student");
                out.print(s.getName() + " " + s.getLastName() + " <br />");
            %>
            <br /> </td>

        </tr>
        </table>
        </body>
        </html>