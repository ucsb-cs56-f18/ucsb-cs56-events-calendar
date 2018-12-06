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
<<<<<<< HEAD
  <h3> UCSB Men's Basketball games for the remainder of winter quarter: </h3>
  <p> Home Games </p>
  <ul>
    <li> 11/29 Sacremento State 7pm </li>
    <li> 12/8 Arkansas-Pine Bluff 7pm </li>
    <li> 12/22 Idaho St. 2pm </li>
  </ul>
  <p> Away Games </p>
  <ul>
    <li> 12/2 Washington 5pm @ Seattle, Washington </li>
    <li> 12/15 Rice 12pm @ Houston, Texas </li>
    <li> 12/19 Nebraska-Omaha 5pm </li>
  </ul>
  <p> </p>
=======

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

>>>>>>> b6f9ee90b61b922258d1ef39033c752ae445c8b8
 </body>

</html>
