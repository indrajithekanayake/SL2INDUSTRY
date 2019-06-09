<%-- 
    Document   : categoryLogin
    Created on : Mar 27, 2019, 10:06:24 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>category Login</title>
        <jsp:include page="bootstrap.html"/>
    </head>
    <body style="background-color:#b4e7ea">
        <jsp:include page="navbar.jsp" />
    <section id="about">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-lg-offset-2 text-center">
                        <h2 class="section-heading">Login As...!</h2>
                        <hr class="light">
                    </div>
                </div>
                        <div class="col-md-4 col-sm-6 col-xs-12 text-center" >
                            <a href="loginAdmin.jsp">
                                <div style="background-color:#b4e7ea" class="thumbnail" style='min-width:300px; width:100%; height:300px;' >
                                    <img style="background-color:#b4e7ea" class="card-img-top" style='height: 220px;' src="img/admin.png" alt="Card image cap">
                                        <div class="card-block">
                                            <h4 class="card-title">Admin</h4>
                                        </div>
                                </div> 
                            </a>
                        </div>
                        <div class="col-md-4 col-sm-6 col-xs-12 text-center" >
                            <a href="loginUser.jsp">
                                <div style="background-color:#b4e7ea" class="thumbnail" style='min-width:300px; width:100%; height:300px;'>
                                    <img style="background-color:#b4e7ea" class="card-img-top" style='height: 220px;' src="img/stu.png" alt="Card image cap">
                                        <div class="card-block">
                                            <h4 class="card-title">University Student</h4>
                                        </div>
                                </div> 
                            </a>
                        </div>
                
                <div class="col-md-4 col-sm-6 col-xs-12 text-center">
                            <a href="loginPeople.jsp">
                                <div style="background-color:#b4e7ea" class="thumbnail" style='min-width:300px; width:100%; height:300px;'>
                                    <img style="background-color:#b4e7ea" class="card-img-top" style='height: 220px;' src="img/22.png" alt="Card image cap">
                                        <div class="card-block">
                                            <h4 class="card-title">Industry People</h4>
                                        </div>
                                </div> 
                            </a>
                        </div>  
            </div>
        </section>
    </body>
</html>
