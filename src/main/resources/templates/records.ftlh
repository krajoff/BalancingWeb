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
  <li>Mode is type of generator/motor load.</li>
  <li>Magnitude and phase of vibration is a value and a phase of
  vibration from peak to peak.</li>
  <li>Magnitude and phase of weight is a value  and a phase of
  weight installed on the shaft.</li>
  <li>The reference number is a measurement number as a
  reference to the previous state of the machine.</li>
  <li>The state is an on/off switch. It is used to take into
  account in the averaging of values when calculating the total load.</li>
</ul>

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
            <div class="divTableHead">State</div>
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
    <form action="/record/create" method="post">
        <div class="divTableRow">
            <div class="divTableCell"></div>
            <div class="divTableCell"><input type="text" name="mode"/></div>
            <div class="divTableCell"><input type="number" name="mvibration"/></div>
            <div class="divTableCell"><input type="number" name="pvibration"/></div>
            <div class="divTableCell"><input type="number" name="mweight"/></div>
            <div class="divTableCell"><input type="number" name="pweight"/></div>
            <div class="divTableCell"><input type="number" name="reference"/></div>
            <div class="divTableCell"><input type="number" name="stage"/></div>
        </div>

    </div>

</div>
<input type="submit" value="Add record"/>
</form>
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


  <form action = "/" method="get">
    <input type="text" name="mode"/><br><br>
  </form>
</body>
</html>