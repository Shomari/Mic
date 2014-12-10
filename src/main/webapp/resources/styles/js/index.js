$( document ).ready(function() {
	$(".sign-in").on("click", function(){
		$("#login").toggle();		
	});
	
	if ($('#error').length > 0) { 
	     $("#login").show(); 
	}
});