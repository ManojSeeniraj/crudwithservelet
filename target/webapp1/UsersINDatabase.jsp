<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
            width: 30%;
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

    
    
    <div align="center" class="w3-container">
        <table  <table class="w3-table-all" border="1" cellpadding="5">
        
            <caption>
                <h2>List of Users</h2>
            </caption>
            <tr>
               
                <th>Name</th>
                <th>Age</th>
                <th> Address</th>
                <th>Mobile_Number</th>
                <th>Mail_id</th>
                <th>Comments</th>
                <th>Action To perform</th>
    
               
            </tr>
        
        <c:forEach var="userProfile" items="${userProfile}">
            <tr>
                <td class="w3-hover-green">
                    <c:out value="${userProfile.name}" />
                </td>
                <td class="w3-hover-yellow">
                        <c:out value="${userProfile.age}" />
                </td>
                <td class="w3-hover-orange">
                        <c:out value="${userProfile.address}" />
                </td>
                <td class="w3-hover-blue">
                        <c:out value="${userProfile.mobile_number}" />
                </td>
                <td class="w3-hover-purple">
                        <c:out value="${userProfile.mail_address}" />
                </td>
                <td class="w3-hover-pink">
                        <c:out value="${userProfile.comments}" />
                </td>
                
                <td>
                        <a href="/CrudOperations?action=edit&name=<c:out value="${userProfile.name}" />"><button>Edit</button></a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/CrudOperations?action=delete&name=<c:out value="${userProfile.name}" />"><button>Delete</button></a>
                    </td>

              
               
            </tr>
        </c:forEach>
        </table>
    </div>
</body>
</html>