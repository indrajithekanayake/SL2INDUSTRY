<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <title>SL2INDUSTRY | Home</title>

    <!-- Favicon -->
    <link rel="shortcut icon" href="assets/img/favicon.ico" type="image/x-icon">

    <!-- Font awesome -->
    <link href="assets/css/font-awesome.css" rel="stylesheet">
    <!-- Bootstrap -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">   
    <!-- Slick slider -->
    <link rel="stylesheet" type="text/css" href="assets/css/slick.css">          
    <!-- Fancybox slider -->
    <link rel="stylesheet" href="assets/css/jquery.fancybox.css" type="text/css" media="screen" /> 
    <!-- Theme color -->
    <link id="switcher" href="assets/css/theme-color/default-theme.css" rel="stylesheet">          

    <!-- Main style sheet -->
    <link href="assets/css/style.css" rel="stylesheet">    

   
    <!-- Google Fonts -->
    <link href='https://fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Roboto:400,400italic,300,300italic,500,700' rel='stylesheet' type='text/css'>
    

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


  </head>
  <body id="body" >
  <div id="abc">
      <!-- Popup Div Starts Here -->
      <div id="popupContact" style="overflow:hidden;">
          <!-- Contact Us Form -->
          <form action="#" id="form" method="post" name="form">
              <img id="close" src="images/3.png" onclick ="div_hide()">
              <h2>Contact Us</h2>
              <hr>
              <input id="name" name="name" placeholder="Name" type="text">
              <input id="email" name="email" placeholder="Email" type="text">
              <textarea id="msg" name="message" placeholder="Message"></textarea>
              <a href="javascript:20%check_empty()" id="submit">Send</a>
          </form>
      </div>
      <!-- Popup Div Ends Here -->
  </div>
  <!--START SCROLL TOP BUTTON -->
    <a class="scrollToTop" href="#">
      <i class="fa fa-angle-up"></i>
    </a>
  <!-- END SCROLL TOP BUTTON -->

  <!-- Start header  -->
  <header id="mu-header">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="mu-header-area">
            <div class="row">
              <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                <div class="mu-header-top-left">
                  <div class="mu-top-email">
                    <i class="fa fa-envelope"></i>
                    <span>ekanayakeindrajith@gmail.com</span>
                  </div>
                  <div class="mu-top-phone">
                    <i class="fa fa-phone"></i>
                    <span>(071) 310 1658</span>
                  </div>
                </div>
              </div>
              <div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
                <div class="mu-header-top-right">
                  <nav>
                    <ul class="mu-top-social-nav">
                      <li><a href="#"><span class="fa fa-facebook"></span></a></li>
                      <li><a href="#"><span class="fa fa-twitter"></span></a></li>
                      <li><a href="#"><span class="fa fa-google-plus"></span></a></li>
                      <li><a href="#"><span class="fa fa-linkedin"></span></a></li>
                      <li><a href="#"><span class="fa fa-youtube"></span></a></li>
                    </ul>
                  </nav>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </header>
  <!-- End header  -->

  <!-- Start menu -->
  <section id="mu-menu">
    <nav class="navbar navbar-default" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <!-- LOGO -->
          <!-- TEXT BASED LOGO -->
          <a class="navbar-brand" href="index.jsp"><i class="fa fa-university"></i><span>SL2Industry</span></a>
          <!-- IMG BASED LOGO  -->
          <!-- <a class="navbar-brand" href="index.jsp"><img src="assets/img/logo.png" alt="logo"></a> -->
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul id="top-menu" class="nav navbar-nav navbar-right main-nav">
            <li class="active"><a href="index.jsp">Home</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">About<span class="fa fa-angle-down"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="#mu-about-us">About Us</a></li>
                <li><a href="course-detail.jsp">Our Mission</a></li>
                  <li><a href="vision.jsp">Our Vision</a></li>
              </ul>
            </li>
              <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown">News<span class="fa fa-angle-down"></span></a>
                  <ul class="dropdown-menu" role="menu">
                      <li><a href="/STUDENT/ViewNew.jsp">Job Opportunities</a></li>
<!--                      <li><a href="ViewNew.jsp">Meetups</a></li>-->
                  </ul>
              </li>
            <li><a href="contact.jsp">Contact</a></li>

            <li><a href="#" id="mu-search-icon"><i class="fa fa-search"></i></a></li>
                <li><a id="popup" onclick="div_show()" href="http://localhost:8080/STUDENT/categoryLogin.jsp"  onmouseover="this.style.color='#f44242'" onmouseout="this.style.color='#333333'" >Sign in</a></li>
                    <li><a id="popup" onclick="div_show()" href="http://localhost:8080/STUDENT/categorySignup.jsp"  onmouseover="this.style.color='#f44242'" onmouseout="this.style.color='#333333'" >Register</a></li>
              
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
  </section>
  <!-- End menu -->

  <!-- Start search box -->
  <div id="mu-search">
    <div class="mu-search-area">
      <button class="mu-search-close"><span class="fa fa-close"></span></button>
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <form class="mu-search-form">
              <input type="search" placeholder="Type Your Keyword(s) & Hit Enter">
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- End search box -->
  <!-- Start Slider -->
  <section id="mu-slider">
    <!-- Start single slider item -->
    <div class="mu-slider-single">
      <div class="mu-slider-img">
        <figure>
          <img src="assets/img/slider/slider1.jpg" alt="img">
        </figure>
      </div>
      <div class="mu-slider-content">
        <h4>Welcome To SL2Industry</h4>
        <span></span>
        <h2>LEARN  APPLY  PROGRESS</h2>
        <p>SL2INDUSTRY delivers a dynamic platform for Universities to showcase the latest technology solutions and licensing opportunities to a diverse array of corporations and other organisations seeking solutions.</p>
        <a href="#mu-about-us" class="mu-read-more-btn">ABOUT US</a>
      </div>
    </div>
    <!-- Start single slider item -->
    <!-- Start single slider item -->
    <div class="mu-slider-single">
      <div class="mu-slider-img">
        <figure>
          <img src="assets/img/slider/slider2.jpg" alt="img">
        </figure>
      </div>
      <div class="mu-slider-content">
        <h4>Welcome to our Blog</h4>
        <span></span>
        <h3><b>POWER IS GAINED BY SHARING KNOWLEDGE,NOT HOLDING IT.</b></h3>
        <p>A blog is your digital portal to share your ideas, meetups, job opportunities  online. It’s text and multimedia without ink stains or Facebook distractions.</p>
        <a href="blog-archive.jsp" class="mu-read-more-btn">OUR BLOG</a>
      </div>
    </div>
    <!-- Start single slider item -->
    <!-- Start single slider item -->
    <div class="mu-slider-single">
      <div class="mu-slider-img">
        <figure>
          <img src="assets/img/slider/slider3.jpg" alt="img">
        </figure>
      </div>
      <div class="mu-slider-content">
        <h4>Welcome to our Forum</h4>
        <span></span>
        <h3><b>EXCLUSIVELY FOR EDUCATION</b></h3>
        <p>The first principle of free society is an untrammeled flow of words in an open Forum</p>
        <a href="#" class="mu-read-more-btn">OUR FORUM</a>
      </div>
    </div>
    <!-- Start single slider item -->    
  </section>
  <!-- End Slider -->
  <!-- Start service  -->
  <section id="mu-service">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="mu-service-area">
            <!-- Start single service -->
            <div class="mu-service-single">
              <span class="fa fa-book"></span>
              <h3>Learn Online</h3>
              <p>We facilitate many features to enhance the knowledge and get new ideas to R&D.</p>
            </div>
            <!-- Start single service -->
            <!-- Start single service -->
            <div class="mu-service-single">
              <span class="fa fa-users"></span>
              <h3>Industrial Exposure</h3>
              <p>We are a bridge which filling the gap between university and industry.</p>
            </div>
            <!-- Start single service -->
            <!-- Start single service -->
            <div class="mu-service-single">
              <span class="fa fa-table"></span>
              <h3>Aware Meetups</h3>
              <p>We are providing a place to host your events, meetups and industrial tech talks.</p>
            </div>
            <!-- Start single service -->
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- End service  -->

  <!-- Start about us -->
  <section id="mu-about-us">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="mu-about-us-area">           
            <div class="row">
              <div class="col-lg-6 col-md-6">
                <div class="mu-about-us-left">
                  <!-- Start Title -->
                  <div class="mu-title">
                    <h2>About Us</h2>              
                  </div>
                  <!-- End Title -->
                  <p>In Sri Lanka university industry collaboration is only limited to industry talks, workshops and guest lectures. That also only limited to urban universities in the island. Strong collaboration among the society is a way to develop this country. So, in this small island why we can’t be getting together and lift the community and country as well.  SL 2 INDUSTRY is the platform for fill this gap. Through this platform the provided collaboration can be vary as follows,</p>
                  <ul>
                    <li>Research collaboration: </li>
                    <li>Career collaboration:</li>
                    <li>Event collaboration:</li>
                  </ul>
                </div>
              </div>
              <div class="col-lg-6 col-md-6">
                  <div class="mu-about-us-right">
                      <iframe width="560" height="315" src="https://www.youtube.com/embed/lWz-46NPqdk" frameborder="0" allowfullscreen></iframe>
                  </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- End about us -->

  <!-- Start about us counter -->
  <section id="mu-abtus-counter">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="mu-abtus-counter-area">
            <div class="row">
              <!-- Start counter item -->
              <div class="col-lg-3 col-md-3 col-sm-3">
                <div class="mu-abtus-counter-single">
                  <span class="fa fa-book"></span>
                  <h4 class="counter">10</h4>
                  <p>Blog Articles</p>
                </div>
              </div>
              <!-- End counter item -->
              <!-- Start counter item -->
              <div class="col-lg-3 col-md-3 col-sm-3">
                <div class="mu-abtus-counter-single">
                  <span class="fa fa-users"></span>
                  <h4 class="counter">200</h4>
                  <p>Students</p>
                </div>
              </div>
              <!-- End counter item -->
              <!-- Start counter item -->
              <div class="col-lg-3 col-md-3 col-sm-3">
                <div class="mu-abtus-counter-single">
                  <span class="fa fa-flask"></span>
                  <h4 class="counter">5</h4>
                  <p>Meetups</p>
                </div>
              </div>
              <!-- End counter item -->
              <!-- Start counter item -->
              <div class="col-lg-3 col-md-3 col-sm-3">
                <div class="mu-abtus-counter-single no-border">
                  <span class="fa fa-user-secret"></span>
                  <h4 class="counter">20</h4>
                  <p>Professionals</p>
                </div>
              </div>
              <!-- End counter item -->
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- End about us counter -->

  <!-- Start features section -->
  <section id="mu-features">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 col-md-12">
          <div class="mu-features-area">
            <!-- Start Title -->
            <div class="mu-title">
              <h2>Our Features</h2>
              <p>SL2INDUSTRY delivers a dynamic platform for Universities to showcase the latest technology solutions and licensing opportunities to a diverse array of corporations and other organisations seeking solutions.</p>
            </div>
            <!-- End Title -->
            <!-- Start features content -->
            <div class="mu-features-content">
              <div class="row">
                <div class="col-lg-4 col-md-4  col-sm-6">
                  <div class="mu-single-feature">
                    <span class="fa fa-book"></span>
                    <h4>Our Blog</h4>
                    <p>A blog is your digital portal to share your ideas, meetups, job opportunities  online. It’s text and multimedia without ink stains or Facebook distractions.</p>
                    <a href="#">Read More</a>
                  </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                  <div class="mu-single-feature">
                    <span class="fa fa-users"></span>
                    <h4>Network with Expert Professionals</h4>
                    <p>Power is gained by sharing the knowledge, not holding it</p>
                    <a href="#">Read More</a>
                  </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                  <div class="mu-single-feature">
                    <span class="fa fa-laptop"></span>
                    <h4>Do your research</h4>
                    <p>Industry is the best place to start your researches.Do you have a passion of R&D, but lack of ideas and mentor? This is the right place for you to start. </p>
                    <a href="#">Read More</a>
                  </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                  <div class="mu-single-feature">
                    <span class="fa fa-microphone"></span>
                    <h4>Meetups</h4>
                    <p>We are providing a place to host your events, meetups and industrial tech talks.</p>
                    <a href="#">Read More</a>
                  </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                  <div class="mu-single-feature">
                    <span class="fa fa-film"></span>
                    <h4>Chat with professionals</h4>
                    <p>By signing up with our forum you can chat with professionals as well as your colleagues and enhance your knowledge.</p>
                    <a href="#">Read More</a>
                  </div>
                </div>
                <div class="col-lg-4 col-md-4 col-sm-6">
                  <div class="mu-single-feature">
                    <span class="fa fa-certificate"></span>
                    <h4>Comming Soon...</h4>
                    <p>This might be the feature you are looking for. Stay connected for more amazing things.</p>
                    <a href="#">Read More</a>
                  </div>
                </div>
              </div>
            </div>
            <!-- End features content -->
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- End features section -->


  <!-- Start testimonial -->
  <section id="mu-testimonial">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="mu-testimonial-area">
            <div id="mu-testimonial-slide" class="mu-testimonial-content">
              <!-- start testimonial single item -->
             
              <!-- end testimonial single item -->
              <!-- start testimonial single item -->
              <div class="mu-testimonial-item">
                <div class="mu-testimonial-quote">
                  <blockquote>
                    <p>This will be a powerful tool for university students for build up their career</p>
                  </blockquote>
                </div>
                <div class="mu-testimonial-img">
                  <img src="assets/img/feedback-20.png" alt="img">
                </div>
                <div class="mu-testimonial-info">
                  <h4>Indrajith Ekanayake</h4>
                  <span>Happy Student<br>NSBM Green University(Undergraduate)</span>
                </div>
              </div>
              <!-- end testimonial single item -->


            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- End testimonial -->

  <!-- Start from blog -->
  <section id="mu-from-blog">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="mu-from-blog-area">
            <!-- start title -->
            <div class="mu-title">
              <h2>From Blog</h2>
              <p>A blog is your digital portal to share your ideas, meetups, job opportunities online. It’s text and multimedia without ink stains or Facebook distractions.</p>
            </div>
            <!-- end title -->  
            <!-- start from blog content   -->
            <div class="mu-from-blog-content">
              <div class="row">
                <div class="col-md-4 col-sm-4">
                  <article class="mu-blog-single-item">
                    <figure class="mu-blog-single-img">
                      <a href="#"><img src="assets/img/blog/blog-1.png" alt="img"></a>
                      <figcaption class="mu-blog-caption">
                        <h3><a href="#">What is 5G?</a></h3>
                      </figcaption>                      
                    </figure>
                    <div class="mu-blog-meta">
                      <a href="#">By Admin</a>
                      <a href="#">02 April 2019</a>
                      <span><i class="fa fa-comments-o"></i>0</span>
                    </div>
                    <div class="mu-blog-description">
                      <p>5G networks are the next generation of mobile internet connectivity, offering faster speeds and more reliable connections on smartphones and other devices than ever before.</p>
                      <a class="mu-read-more-btn" href="https://www.techradar.com/news/what-is-5g-everything-you-need-to-know">Read More</a>
                    </div>
                  </article>
                </div>
                <div class="col-md-4 col-sm-4">
                  <article class="mu-blog-single-item">
                    <figure class="mu-blog-single-img">
                      <a href="#"><img src="assets/img/blog/blog-2.jpg" alt="img"></a>
                      <figcaption class="mu-blog-caption">
                        <h3><a href="#">UI/UX</a></h3>
                      </figcaption>                      
                    </figure>
                    <div class="mu-blog-meta">
                      <a href="#">By Admin</a>
                      <a href="#">28 March 2019</a>
                      <span><i class="fa fa-comments-o"></i>0</span>
                    </div>
                    <div class="mu-blog-description">
                      <p>UX and UI design are two different elements of a single consumer experience. UX refers to the user experience, which focuses on how something works and how people interact with it. UI, or user interface, focuses on the look and layout.</p>
                      <a class="mu-read-more-btn" href="https://www.mediabistro.com/climb-the-ladder/skills-expertise/what-does-a-ux-ui-designer-do/">Read More</a>
                    </div>
                  </article>
                </div>
                <div class="col-md-4 col-sm-4">
                  <article class="mu-blog-single-item">
                    <figure class="mu-blog-single-img">
                      <a href="#"><img src="assets/img/blog/blog-3.jpg" alt="img"></a>
                      <figcaption class="mu-blog-caption">
                        <h3><a href="#">What is Machine Learning?</a></h3>
                      </figcaption>                      
                    </figure>
                    <div class="mu-blog-meta">
                      <a href="#">By Admin</a>
                      <a href="#">02 April 2019</a>
                      <span><i class="fa fa-comments-o"></i>87</span>
                    </div>
                    <div class="mu-blog-description">
                      <p>Machine learning is an application of artificial intelligence (AI) that provides systems the ability to automatically learn and improve from experience without being explicitly programmed. Machine learning focuses on the development of computer programs that can access data and use it learn for themselves.</p>
                      <a class="mu-read-more-btn" href="#">Read More</a>
                    </div>
                  </article>
                </div>
              </div>
            </div>     
            <!-- end from blog content   -->   
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- End from blog -->

  <!-- Start footer -->
  <footer id="mu-footer">
    <!-- start footer top -->
    <div class="mu-footer-top">
      <div class="container">
        <div class="mu-footer-top-area">
          <div class="row">
            <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="mu-footer-widget">
                <h4>Information</h4>
                <ul>
                  <li><a href="#">About Us</a></li>
                  <li><a href="">Our Mission</a></li>
                  <li><a href="">Our Vision</a></li>
                  <li><a href="">Meetups</a></li>
                  <li><a href="">Our Teem</a></li>
                  <li><a href="">Term Of Use</a></li>
                </ul>
              </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="mu-footer-widget">
                <h4>Student Help</h4>
                <ul>
                  <li><a href="">Get Started</a></li>
                  <li><a href="#">Ask Your Question</a>
                  <li><a href="">Academic News</a></li>                  
                </ul>
              </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="mu-footer-widget">
                <h4>News letter</h4>
                <p>Get latest update, news, academic offers & meetups</p>
                <form class="mu-subscribe-form">
                  <input type="email" placeholder="Type your Email">
                  <button class="mu-subscribe-btn" type="submit">Subscribe!</button>
                </form>               
              </div>
            </div>
            <div class="col-lg-3 col-md-3 col-sm-3">
              <div class="mu-footer-widget">
                <h4>Contact</h4>
                <address>
                  <p>309 Dampe - Pitipana Rd, Homagama</p>
                  <p>Phone: (071) 310-1658 </p>
                  <p>Website: www.millionnodes.com</p>
                  <p>Email: ekanayakeindrajith@gmail.com</p>
                </address>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <!-- end footer top -->
    <!-- start footer bottom -->
    <div class="mu-footer-bottom">
      <div class="container">
        <div class="mu-footer-bottom-area">
          <p>&copy; All Right Reserved. Designed by <a href="http://www.millionnodes.com/" rel="nofollow">Millionnodes.com</a></p>
        </div>
      </div>
    </div>
    <!-- end footer bottom -->
  </footer>
  <!-- End footer -->
  
  <!-- jQuery library -->
  <script src="assets/js/jquery.min.js"></script>  
  <!-- Include all compiled plugins (below), or include individual files as needed -->
  <script src="assets/js/bootstrap.js"></script>   
  <!-- Slick slider -->
  <script type="text/javascript" src="assets/js/slick.js"></script>
  <!-- Counter -->
  <script type="text/javascript" src="assets/js/waypoints.js"></script>
  <script type="text/javascript" src="assets/js/jquery.counterup.js"></script>  
  <!-- Mixit slider -->
  <script type="text/javascript" src="assets/js/jquery.mixitup.js"></script>
  <!-- Add fancyBox -->        
  <script type="text/javascript" src="assets/js/jquery.fancybox.pack.js"></script>
  
  
  <!-- Custom js -->
  <script src="assets/js/custom.js"></script> 

  </body>
</html>