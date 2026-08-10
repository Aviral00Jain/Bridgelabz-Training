<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>

<head>
    <title>Users</title>
</head>

<body>

    <h1>All Users</h1>

    <table border="1">

        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Actions</th>
        </tr>

        <c:forEach var="user" items="${users}">

            <tr>

                <td>${user.id}</td>

                <td>${user.name}</td>

                <td>${user.email}</td>

                <td>

                    <a href="/users/edit/${user.id}">
                        Edit
                    </a>

                    &nbsp;

                    <a href="/users/delete/${user.id}">
                        Delete
                    </a>

                </td>

            </tr>

        </c:forEach>

    </table>

</body>

</html>