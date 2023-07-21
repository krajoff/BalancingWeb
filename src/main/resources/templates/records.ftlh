<!DOCTYPE html>
<html>
<head> <title>NEWS</title>
</head>
<body>
<form action = "/" method="get">
<input type="text" name="mode"/><br><br>
</form>
<#list records as record>
    <div>
        <p><b>${record.mode}</b> <a href="/record/${record.id}">...</a></p>

    </div>
    <#else>
       <h3> нет записи </h3>
</#list>
add record
<form action = "records/create" method="post">
Режим <input type="text" name="mode"/><br><br>
</form>

</body>
</html>