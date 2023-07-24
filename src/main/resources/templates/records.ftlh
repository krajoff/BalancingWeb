<!DOCTYPE html>
<html>
  <head>
  <title>Single plane balancing</title>
  <link rel="stylesheet" href="/css/style.css" />
</head>
<body>
  <h1>Single plane balancing application</h1>
  <h2>How to use the application:</h2>
  <ul>Fill in the fields in the table:
    <li>Mode is type of generator/motor load; </li>
    <li>Vibration magnitude and vibration phase
    are magnitude and phase of vibration from peak to peak. </li>
    <li>Weight magnitude and weight phase are value and
    phase of weight installed on the shaft </li>
  </ul>
  <form action = "/" method="get">
    <input type="text" name="mode"/><br><br>
  </form>

<div class="divTable blueTable">
    <div class="divTableHeading">
        <div class="divTableRow">
            <div class="divTableHead">id</div>
            <div class="divTableHead">Mode</div>
            <div class="divTableHead">Vibration <br> magnitude</div>
            <div class="divTableHead">Vibration <br> phase</div>
            <div class="divTableHead">Weight <br> magnitude</div>
            <div class="divTableHead">Weight <br> phase</div>
            <div class="divTableHead">Reference</div>
            <div class="divTableHead">Stage</div>
        </div>
    </div>
    <div class="divTableBody">
    <#list records as record>
        <div class="divTableRow">
            <div class="divTableCell">${record.id}</div>
            <div class="divTableCell">${record.mode}</div>
            <div class="divTableCell">${record.mvibration}</div>
            <div class="divTableCell">${record.pvibration}</div>
            <div class="divTableCell">${record.mweight}</div>
            <div class="divTableCell">${record.pweight}</div>
            <div class="divTableCell">${record.reference}</div>
            <div class="divTableCell">${record.stage}</div>
        </div>
    <#else>
    <h3> нет записи </h3>
    </#list>
    </div>
</div>



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