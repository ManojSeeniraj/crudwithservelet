<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Document</title>
    <style>
    /* Center the avatar image inside this container */
    body{

      background-image: url("https://previews.123rf.com/images/romastudio/romastudio1603/romastudio160300280/54088843-healthy-food-background-studio-photo-of-different-fruits-on-white-wooden-table-high-resolution-produ.jpg");
    

    }


    </style>
</head>
<body>

    <!-- Navbar (sit on top) -->
<div class="w3-top">
  
        <div class="w3-bar w3-white w3-padding w3-card" style="letter-spacing:4px;">
          <a href="#home" class="w3-bar-item w3-button">Welcome ${message}</a>
          <!-- Right-sided navbar links. Hide them on small screens -->
          <div class="w3-right w3-hide-small">
            
            <a href="home.jsp" class="w3-bar-item w3-button">Back To Index</a>
          </div>
        </div>
      </div>
    
<br>
<br>
<br>
    <div class="w3-container w3-padding-64" id="contact">
        <h1 style="color: white">Contact</h1><br>
        
        <form method="POST" action='/UserDetailController?action=contactUser' name="frmAddUser">
          
          <p><input class="w3-input w3-padding-16" type="email" placeholder="Email" required name="emailidhome"></p>
          <p><input class="w3-input w3-padding-16" type="text" placeholder="Phone Number" required name="phonehome"></p>
          
          <p><button class="w3-button w3-light-grey w3-section" type="submit">SEND MESSAGE</button></p>
        </form>


        
      </div>
</body>
</html>