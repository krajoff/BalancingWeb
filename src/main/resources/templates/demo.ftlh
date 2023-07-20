<!DOCTYPE html>
<html>
<head> <title>NEWS</title>
</head>
<body>
<#list records as record>
    <div>
        <p><b>${record.mode}</b>${record.mVibration}<a href="/product/${record.id}">...</a></p>

    </div>
    <#else>
        нет записи
</#list>
add record
<form action = "records/create" method="post">
<input type="text" name="rate"/><br><br>
</form>

</body>
</html>