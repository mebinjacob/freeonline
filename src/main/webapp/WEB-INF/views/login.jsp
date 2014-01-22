 <html>
<head></head>
<body>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script> 
<script type="text/javascript">
$(document).ready(function(){

	/*initialize FB object*/
	window.fbAsyncInit = function() {
	  FB.init({
	    appId      : '439037732775113',
	    status     : true, // check login status
	    cookie     : true, // enable cookies to allow the server to access the session
	    xfbml      : true  // parse XFBML
	  });

	  /*Whether the user is logged in or not!!!!*/
	  
		  
		  FB.getLoginStatus(function(response) {
			  
			  if (response.status === 'connected') {
			    // the user is logged in and has authenticated your
			    // app, and response.authResponse supplies
			    // the user's ID, a valid access token, a signed
			    // request, and the time the access token 
			    // and signed request each expire
			    connected(response);
			  } else if (response.status === 'not_authorized') {
			    // the user is logged in to Facebook, 
			    // but has not authenticated your app
			    alert('Not authorized');
			  //  FB.login();
			  } else {
			    // the user isn't logged in to Facebook.
				  alert('The user is not logged in !!!!');
			//    FB.login();
			  }
			 });
	  
	  /*End of check of user logged in or not*/
	  
	  
	  // Here we subscribe to the auth.authResponseChange JavaScript event. This event is fired
	  // for any authentication related change, such as login, logout or session refresh. This means that
	  // whenever someone who was previously logged out tries to log in again, the correct case below 
	  // will be handled. 
	  FB.Event.subscribe('auth.authResponseChange', function(response) {
	    // Here we specify what we do with the response anytime this event occurs. 
	    if (response.status === 'connected') {
	      // The response object is returned with a status field that lets the app know the current
	      // login status of the person. In this case, we're handling the situation where they 
	      // have logged in to the app.
	      connected(response);
	    } else if (response.status === 'not_authorized') {
	      // In this case, the person is logged into Facebook, but not into the app, so we call
	      // FB.login() to prompt them to do so. 
	      // In real-life usage, you wouldn't want to immediately prompt someone to login 
	      // like this, for two reasons:
	      // (1) JavaScript created popup windows are blocked by most browsers unless they 
	      // result from direct interaction from people using the app (such as a mouse click)
	      // (2) it is a bad experience to be continually prompted to login upon page load.
	     // FB.login();
	    } else {
	      // In this case, the person is not logged into Facebook, so we call the login() 
	      // function to prompt them to do so. Note that at this stage there is no indication
	      // of whether they are logged into the app. If they aren't then they'll see the Login
	      // dialog right after they log in to Facebook. 
	      // The same caveats as above apply to the FB.login() call here.
	      //FB.login();
	    }
	  });
	  };
	// Load the SDK asynchronously
	  (function(d){
	   var js, id = 'facebook-jssdk', ref = d.getElementsByTagName('script')[0];
	   if (d.getElementById(id)) {return;}
	   js = d.createElement('script'); js.id = id; js.async = true;
	   js.src = "//connect.facebook.net/en_US/all.js";
	   ref.parentNode.insertBefore(js, ref);
	  }(document));

	  // Here we run a very simple test of the Graph API after login is successful. 
	  // This testAPI() function is only called in those cases. 
	  function connected(response){
		  console.log('Welcome!  Fetching your information.... ');
		  var uid = response.authResponse.userID;
		  var accessToken = response.authResponse.accessToken;
		    FB.api('/me', function(response) {
		      console.log('Good to see you, ' + response.name + '.');
		    });  
		    var user_info = new Object();
		    user_info.userID = uid;
		    user_info.authToken = accessToken;
		  $.post("save", user_info);
	  }
		


})

</script>

<div id="fb-root"></div>

<!--
  Below we include the Login Button social plugin. This button uses the JavaScript SDK to
  present a graphical Login button that triggers the FB.login() function when clicked. -->

<fb:login-button show-faces="true" width="200" max-rows="1" perms="email,user_birthday, user_relationships, user_location, user_religion_politics"></fb:login-button>
</body>
</html>
