<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <title>Document</title>
</head>

<style>
    .bg-image{
        background-image: url("https://previews.123rf.com/images/romastudio/romastudio1603/romastudio160300280/54088843-healthy-food-background-studio-photo-of-different-fruits-on-white-wooden-table-high-resolution-produ.jpg");
       
    }
    

    /* Full-width inputs */

    input[type=text]
     {
        width: 15%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
        border-radius: 10px;
    }

    /* Set a style for all buttons */

    button {
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 100%;
    }
    .admin{
        background-color: #4CAF50;
        color: white;
        padding: 14px 20px;
        margin: 8px 0;
        border: none;
        cursor: pointer;
        width: 10%;
        border-radius: 10px;
        

    }

    /* Add a hover effect for buttons */

    button:hover {
        opacity: 0.8;
    }

    /* Extra style for the cancel button (red) */

    .cancelbtn {
        width: auto;
        padding: 10px 18px;
        background-color: #f44336;
    }

    /* Center the avatar image inside this container */

    .imgcontainer {
        text-align: center;
        margin: 24px 0 12px 0;
    }

    /* Avatar image */

    img.avatar {
        width: 40%;
        border-radius: 50%;
    }

    /* Add padding to containers */

    .container {
        padding: 16px;
    }

    /* The "Forgot password" text */

    span.psw {
        float: right;
        padding-top: 16px;
    }

    /* Change styles for span and cancel button on extra small screens */

    @media screen and (max-width: 300px) {
        span.psw {
            display: block;
            float: none;
        }
        .cancelbtn {
            width: 100%;
        }
    }
</style>

<body>
       <a  style="padding-left: 1120px;"   href="/CrudOperations?action=list"><button type="submit" class="admin">Active Users</button></a>



   <h1 style="text-align: center;">Insert Food Item</h1>

   <form method="POST" action='./databaseServelet' name="frmAddUser">

    <div class="imgcontainer">
        <!-- <img src="https://d47ro1qos1hnj.cloudfront.net/media/itemdetails/2017/Sep/1_1504264780.jpg"    height="250" width="150" alt="Avatar" class="avatar"> -->
    </div>

    <div class="container">
        


        <label for="id">
            <b>Id</b>
        </label>
        <input type="text" placeholder="id" name="id" >


        <label for="Name">
            <b>Name</b>
        </label>
        <input type="text" placeholder="Food Name" name="name" required>
        
        
        <label for="Price">
            <b>Price</b>
        </label>
        <input type="text" placeholder="Food Price" name="price" required>
    
        <label for="Taste">
            <b>Taste</b>
        </label>
        <input type="text" placeholder="Food Taste" name="taste" required>


        <label for="Discount">
            <b>Discount</b>
        </label>
        <input type="text" placeholder="Food Discount" name="discount" required>


        <button type="submit">Submit Food</button>
        <label>
            <input type="checkbox" checked="checked" name="remember"> Remember me
        </label>
    </div>

    <div class="container"">
        
      
    </div>
</form>

   <div align="center" class="w3-container">
    <table  <table class="w3-table-all" border="1" cellpadding="5">
    
        <caption>
            <h2>List of Food</h2>
        </caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Taste</th>
            <th>Discount</th>

           
        </tr>
        <c:forEach var="foodList" items="${foodList}">
            <tr>
                <td class="w3-hover-green">
                    <c:out value="${foodList.id}" />
                </td>
                <td class="w3-hover-blue" >
                    <c:out value="${foodList.name}" />
                </td>
                <td class="w3-hover-yellow">
                    <c:out value="${foodList.price}" />
                </td>
                <td class="w3-hover-pink">
                    <c:out value="${foodList.taste}" />
                </td>
                <td class="w3-hover-orange">
                    <c:out value="${foodList.discount}" />
                </td>
                

              
               
            </tr>
        </c:forEach>
    </table>
</div>
    
</div>
</body>
</html>