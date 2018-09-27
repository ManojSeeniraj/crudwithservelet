<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">

<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>
body{

  background-image:url("https://previews.123rf.com/images/romastudio/romastudio1603/romastudio160300219/54088690-organic-food-background-studio-photo-of-different-fruits-and-vegetables-on-white-wooden-table-high-r.jpg");
}


/* comment */
</style>

<body>
 
  <br>
  <br>
  <br>
  <a onclick="fetchall()" style="padding-left: 50px;"><button class="btn btn-success"> My Inbox</button></a>
  <a onclick="contactchall()"><button class="btn btn-success"> Go for contact</button></a>
  <a onclick="showall()"><button class="btn btn-success"> showall</button></a>
  <div class="container">
    <h2 class="text-center">My Details</h2>

 

   


        <p id="box"></p>

        <p id="demo"></p>

        <p id="showall"></p>

   

        <script>
          function fetchall() {
            var i, x = "";
            // alert(${employeeJsonString});
            var names = JSON.stringify(${ inboxString });
            var object = JSON.parse(names);

            for (var i in object) {
              x += "<table class='table'>";
              x += "<thead>";
              x += "<tr>";
              x += "<th>" + "Email" + "</th>";
              x += "<th>" + "Date" + "</th>";
              x += "<th>" + "From" + "</th>";
              x += "<th>" + "To" + "</th>";
              x += "<th>" + "Subject" + "</th>";
              x += "<th>" + "Message" + "</th>";
              x += "</tr>";
              x += "<tbody>";
              // x += "<h5><b>" + "Your inbox Details" + "</b></h5>";
              x += "<h5><td class='success'>" + object[i].emailid + "</td></h5>";
              x += "<h5><td class='danger'>" + object[i].date + "</td></h5>";
              x += "<h5><td class='info'>" + object[i].from + "</td></h5>";
              x += "<h5><td class='warning'>" + object[i].to + "</td></h5>";
              x += "<h5><td class='success'>" + object[i].subject + "</td></h5>";
              x += "<h5><td class='danger'>" + object[i].message + "</td></h5>";
              x += "</tbody >";
              x += "</table>";

            }
            document.getElementById("box").innerHTML = x;



          }



          function contactchall() {
            var i, x = "";
            alert(${contactString });
            var contactnames = JSON.stringify(${ contactString });
            alert(contactnames);
            var object = JSON.parse(contactnames);

            for (var i in object) {
              x += "<table class='table'>";
              x += "<thead>";
              x += "<tr>";
              x += "<th>" + "Email" + "</th>";
              x += "<th>" + "Phone Number" + "</th>";
              x += "</tr>";
              x += "<tbody>";
              // x += "<h5><b>" + "Your inbox Details" + "</b></h5>";
              x += "<h5><td class='success'>" + object[i].emailid + "</td></h5>";
              x += "<h5><td class='danger'>" + object[i].phone + "</td></h5>";


            }
            document.getElementById("demo").innerHTML = x;
          }


          function showall() {
            var i,x="";
            alert(${ShowAllString});
            var fullshow=JSON.stringify(${ShowAllString});
            var fullobject=JSON.parse(fullshow);

           for (var i in fullobject) {
              x += "<table class='table'>";
              x += "<thead>";
              x += "<tr>";
              x += "<th>" + "Email" + "</th>";
              x += "<th>" + "Date" + "</th>";
              x += "<th>" + "From" + "</th>";
              x += "<th>" + "To" + "</th>";
              x += "<th>" + "Subject" + "</th>";
              x += "<th>" + "Message" + "</th>";
              x += "<th>" + "contact" + "</th>";
              x += "</tr>";
              x += "<tbody>";
              // x += "<h5><b>" + "Your inbox Details" + "</b></h5>";
             
              x += "<h5><td class='success'>" + fullobject[i].emailid + "</td></h5>";
              for  (var j in fullobject[i].inboxes){
               
                x += "<h5><td class='danger'>" + fullobject[i].inboxes[j].date+ "</td></h5>";
                x += "<h5><td class='info'>" + fullobject[i].inboxes[j].from + "</td></h5>";
                x += "<h5><td class='warning'>" + fullobject[i].inboxes[j].to + "</td></h5>";
                x += "<h5><td class='success'>" + fullobject[i].inboxes[j].subject + "</td></h5>";
                x += "<h5><td class='danger'>" +fullobject[i].inboxes[j].message + "</td></h5>";
               
                
              }
              for(var k in fullobject[i].contacts){
                x += "<h5><td class='success'>" + fullobject[i].contacts[k].phone+ "</td></h5>";
               
               
              }
              
            
              
              x += "</tbody >";
              x += "</table>";

            }
            document.getElementById("box").innerHTML = x;



          }
        </script>










      </tbody>
    </table>
  </div>

</body>

</html>