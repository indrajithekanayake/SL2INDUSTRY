<%-- 
    Document   : Adminnew
    Created on : Apr 7, 2019, 3:09:15 PM
    Author     : HP
--%>
<%-- 
    Document   : delete
    Created on : Apr 6, 2019, 9:05:55 PM
    Author     : Yachith Perera
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Admin Panel</title>

        <!-- Bootstrap -->
        <jsp:include page="bootstrap.html"/>
        
        <link href="css/web.css" rel="stylesheet">



    </head>

    <body id="page-top">

        <jsp:include page="navbar.jsp" />
        

        <header style="background-image: url('img/ss.jpg');">
            <div class="header-content">
                <div class="header-content-inner">
                    <h1 id="homeHeading" style="color:white"><b>Admin Panel</b></h1>
                    
                    <hr class="light">
                    <p></p>
                    <div class="row">
                        <div class="col-lg-8 col-lg-offset-2 text-center">
                            
                            
                            
                            <a href="Astudentview.jsp" class="btn btn-xl btn-info" style=" width: 220px;">Edit Student Details</a>
                            <br><br>
                            <a href="Aindustryview.jsp" class="btn btn-xl btn-info" style=" width: 220px;">Edit Industry Details </a>
                            <br><br>
                  </div> 

                    </div> 
                </div>
            </div>
        </header>
      
     </body>
</html>

