<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <title>QuizApp</title>
  <base href="">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <link href="signUp.css" rel="stylesheet">
  <title></title>
  
</head>
<!-- 
<div id="sec1"  >
    <div  class="container" >
  
       <div class="header"> 
           <h2> REGESTRATION FORM </h2> 
       </div> 

       <form class="form" action="regestration" id="form"  >
           <div class="form-control">
              <label>Username</label>
              <input type="text" name="name" placeholder="Enter your FullName">
            </div>
    
            <div class="form-control">
               <label>Email</label>
               <input type="Email" name="email"  placeholder="Enter your Email" >
            </div>
            
            <div class="form-control">
               <label>Phone Number</label>
               <input type="number" name="number"  placeholder="Enter your Phone Number" >
            </div>
            
            <div class="form-control">
               <label>Password</label>
               <input type="Password" name="password" placeholder="Enter your Password" >
             
            </div>
         
            <div class="form-control">
               <label>Conform Password</label>
               <input type="password" name="confirmPassword"  placeholder=" Conform Password" >
              
            </div>
            
              <input type="submit" value="Submit" class="btn" name="">  

        </form>
  
    </div>
    
</div> 

<script>
    function validateForm() {
        var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("confirmPassword").value;
        
        if (password != confirmPassword) {
            alert("Passwords do not match");
            return false;
        }
        return true;
    }
</script>
-->

<h2>Registration Form</h2>
    <form action="/register" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="name" required><br><br>
        <label for="username">UserEmail:</label>
        <input type="text" id="username" name="email" required><br><br>
        <label for="username">UserNumber:</label>
        <input type="text" id="username" name="number" required><br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>
        <label for="confirmPassword">Confirm Password:</label>
        <input type="password" id="confirmPassword" name="confirmPassword" required><br><br>
        <input type="submit" value="Register">
    </form>

