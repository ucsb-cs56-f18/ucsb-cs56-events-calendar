<!DOCTYPE html>
<html>

 <head>
  <title>Events</title>
  <#include "head.ftl" />
 </head>

 <body>

  <#include "navbar.ftl" />
  <h1>Events</h1>
  <!-- <p>A list of events should pop on this page for users to view</p> -->
  <table>
    <tr>
      <th>Name</th>
      <th>Location</th>
      <th>Date</th>
    </tr>

    <#list events as event>
    <tr>
      <td>${event.name}</td>
      <td>${event.location}</td>
      <td>${event.time}</td>
    </tr>
    </#list>
  </table>
 </body>

</html>
