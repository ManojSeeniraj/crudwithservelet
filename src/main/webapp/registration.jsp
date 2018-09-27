<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   
</head>

<style>
    form {
        border: 3px solid #f1f1f1;
    }

    /* Full-width inputs */

    input[type=text],
    input[type=password],
    input[type=email] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
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

             
  

    <h1 style="text-align: center">!!RegistrationForm!!</h1>

    
    <form method="POST" action='/UserServelet?action=insertUser' name="frmAddUser">


        <div class="container">
            


            <label for="Email">
                <b>Email</b>
            </label>
            <input type="email" placeholder="email" name="registeremail" required>


            <label for="psw">
                <b>Password</b>
            </label>
            <input type="password" placeholder="Enter Password" name="registerPass" required>





            <button type="submit">Register</button>
            <label>
                <input type="checkbox" checked="checked" name="remember"> Remember me
            </label>
        </div>

        <div class="container" style="background-color:#f1f1f1">
            <button type="button" class="cancelbtn">Cancel</button>
            <span class="psw">User
                <a href="">Registration</a>
            </span>
        </div>
    </form>
</body>

</html>