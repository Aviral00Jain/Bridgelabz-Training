<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>

<head>
    <title>Edit User</title>
</head>

<body>

    <h1>Edit User</h1>

    <form action="/users/update" method="post">

        <input type="hidden"
               name="id"
               value="${user.id}">

        <label>Name:</label>

        <input type="text"
               name="name"
               value="${user.name}">

        <br><br>

        <label>Email:</label>

        <input type="email"
               name="email"
               value="${user.email}">

        <br><br>

        <label>Password:</label>

        <input type="password"
               name="password"
               value="${user.password}">

        <br><br>

        <button type="submit">
            Update
        </button>

    </form>

    <br>

    <a href="/users">
        Back to Users
    </a>

</body>

</html>