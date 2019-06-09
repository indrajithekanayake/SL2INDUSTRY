<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>SL2INDUSTRY | Register</title>

    <!-- Favicon -->
    <link rel="shortcut icon" href="assets/img/favicon.ico" type="image/x-icon">

    <!-- Main style sheet -->
    <link href="assets/css/register.css" rel="stylesheet">
</head>
<body>
<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
<link href="//netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">

<div class="testbox">
    <button style="float: right" onclick="location.href='index.jsp'">X</button>
    <h1 style="margin-left: 25px">Student Registration</h1>

    <form action="/">
        <hr>
        <label id="icon" for="name"><i class="icon-user"></i></label>
        <input type="text" name="name" id="name" placeholder="Name" required/></br></br>
        <label id="icon" for="name"><i class="icon-shield"></i></label>
        <input type="password" name="name" id="name" placeholder="Password" required/>
        <label id="icon" for="name"><i class="icon-shield"></i></label>
        <input type="password" name="name" id="name" placeholder="Retype Password" required/>
        <label id="icon" for="name"><i class="icon-envelope "></i></label>
        <input type="text" name="name" id="name" placeholder="Email" required/>
        <label id="icon" for="name"><i class="icon-shield icon-rotate-270"></i></label>
        <input type="text" name="name" id="name" placeholder="University" required/>
        </br>
        <hr>
        <div class="gender">
            <input type="checkbox" value="None" id="male" name="gender" checked/>
            <label for="male" class="checkbox" chec><p>Subscribe our newsletter to stay updated</p></label>

        </div>
        <h5 style="margin-left: 20px">Are you registered member? <a href="signin.jsp" style="color: red">Sign In</a><br>.</h5>
        <p>By clicking Register, you agree on our <a href="#" style="color: red">terms and condition</a>.</p>
        <a href="#" class="button">Register</a>
    </form>
</div>
</body>
</html>