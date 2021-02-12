<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
</head>
<body>

<h2>Registration Page</h2>

<form action="/admin/registration" method="post">
    username: <input type="text" name="name"/>
    password: <input type="text" name="password"/>
    email: <input type="text" name="email"/>
    phone: <input type="text" name="phone"/>

    <select name="role">
        <option value="staff">staff</option>
        <option value="manager">manager</option>
        <option value="admin">admin</option>
    </select>

    <input type="submit" value="registration">
</form>

<#list employeeList as employee>
   <p>${employee.name}, ${employee.phone}, ${employee.email}, ${employee.password}</p>
</#list>
</body>
</html>