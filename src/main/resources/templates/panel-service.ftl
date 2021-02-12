<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Service Page</title>
</head>
<body>

<h2>Service Page</h2>

<form action="/manager/service" method="post">
    serviceType: <input type="text" name="serviceType"/>
    price: <input type="number" name="price"/>

    <input type="submit" value="create">
</form>

<#list serviceList as service>
    <p>${service.serviceType}, ${service.price}</p>
</#list>
</body>
</html>