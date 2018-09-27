<!DOCTYPE html>
<html>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
body {font-family: "Times New Roman", Georgia, Serif;background-image:url("https://previews.123rf.com/images/romastudio/romastudio1603/romastudio160300280/54088843-healthy-food-background-studio-photo-of-different-fruits-on-white-wooden-table-high-resolution-produ.jpg");}
h1,h2,h3,h4,h5,h6 {
    font-family: "Playfair Display";
    letter-spacing: 5px;
}
</style>
<body>

<!-- Navbar (sit on top) -->
<div class="w3-top">
  <div class="w3-bar w3-white w3-padding w3-card" style="letter-spacing:4px;">
    <a href="#home" class="w3-bar-item w3-button">Welcome ${message}</a>
    <!-- Right-sided navbar links. Hide them on small screens -->
    <div class="w3-right w3-hide-small">
      <a href="#about" class="w3-bar-item w3-button">About</a>
      <a href="#menu" class="w3-bar-item w3-button">Inbox</a>
      <a href="contacts.jsp" class="w3-bar-item w3-button">Contact</a>
      <a href='/UserDetailController?action=listuser' class="w3-bar-item w3-button">My Details</a>
      <a href='UserProfile.jsp' class="w3-bar-item w3-button">User Profile</a>

    </div>
  </div>
</div>

<!-- Header -->
<!-- <header class="w3-display-container w3-content w3-wide" style="max-width:1600px;min-width:500px" id="home">
  <img class="w3-image" src="https://png.pngtree.com/thumb_back/fw800/back_pic/00/03/78/93561fba1a37108.jpg" style="filter: invert();" alt="Hamburger Catering" width="1600" height="500">
  <div class="w3-display-bottomleft w3-padding-large w3-opacity">
    <h1 class="w3-xxlarge" style="color: white">Le Catering</h1>
  </div>
</header> -->

<!-- Page content -->
<div class="w3-content" style="max-width:1100px">

  <!-- About Section -->

  
  <hr>
  
  <!-- Menu Section -->
  <div class="w3-row w3-padding-64" id="menu">
    <div class="w3-col l6 w3-padding-large">
      <div class="w3-container w3-padding-64" id="contact">
        <h1>Inbox Us</h1><br>
        <p>We Are Waiting To see Your Reviews.</p>
        <form method="POST" action='/UserDetailController?action=inboxmail' name="frmAddUser">
          
          <p><input class="w3-input w3-padding-16" type="email" placeholder="Email" required name="emailidhome"></p>
          <p><input class="w3-input w3-padding-16" type="date" placeholder="date" required name="datehome"></p>
          <p><input class="w3-input w3-padding-16" type="text" placeholder="form" required name="fromhome"></p>
          <p><input class="w3-input w3-padding-16" type="text" placeholder="to" required name="tohome"></p>
          <p><input class="w3-input w3-padding-16" type="text" placeholder="Subject" required name="subjecthome"></p>
          <p><input class="w3-input w3-padding-16" type="message" placeholder="Message" required name="messagehome"></p>

          
          <p><button class="w3-button w3-light-grey w3-section" type="submit">SEND MESSAGE</button></p>
        </form>
      </div>   
    </div>
    
    
  </div>

  <hr>

  
  
<!-- End page content -->


</body>
</html>
