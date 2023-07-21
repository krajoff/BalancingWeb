<!DOCTYPE html>
<html>
<head> <title>NEWS</title>
</head>
<body>
<h1 style="color: #5e9ca0; text-align: left;">Single plane balancing application</h1>
<h2 style="color: #2e6c80;">How to use the applicating:</h2>

<form action = "/" method="get">
<input type="text" name="mode"/><br><br>
</form>
<#list records as record>
<table>
    <tr>
        <th wigth="80">id</th>
        <th wigth="80">Mode</th>
        <th wigth="80">mVibration</th>
        <th wigth="80">pVibration</th>
        <th wigth="80">mWeight</th>
        <th wigth="80">pWeight</th>
        <th wigth="80">Reference</th>
        <th wigth="80">Stage</th>
    </tr>

    <tr>
        <td>${record.id}</td>
        <td>${record.mode}</td>
        <td>${record.mvibration}</td>
        <td>${record.pvibration}</td>
        <td>${record.mweight}</td>
        <td>${record.pweight}</td>
        <td>${record.reference}</td>
        <td>${record.stage}</td>
    </tr>
<#else>
<h3> нет записи </h3>

</table>
</#list>
<hr>


<form action="/record/create" method="post">
    Mode: <input type="text" name="mode"/><br><br>
    vibration magnitude: <input type="number" name="mvibration"/><br><br>
    vibration phase: <input type="number" name="pvibration"/><br><br>
    weight magnitude: <input type="number" name="mweight"/><br><br>
    weight phase: <input type="number" name="pweight"/><br><br>
    reference: <input type="number" name="reference"/><br><br>
    stage: <input type="number" name="stage"/><br><br>
    <input type="submit" value="Add record"/>
</form>

</body>
</html>