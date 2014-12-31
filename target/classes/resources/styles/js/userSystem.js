$(document).ready(function(){
	$(".ms").change(function(){	
		showSubmit();
		if($("#xbone, #xbthree").is(':checked')){			
			$("#gamertag").show();
		}else{
			$("#gamertag").hide();
		}		
	});
	$(".sony").change(function(){
		showSubmit();
		if($("#psthree, #psfour").is(':checked')){
			$("#psn").show();			
		}else{
			$("#psn").hide();
		}
	});
	
	function showSubmit(){
		if($(":checkbox").is(':checked')){
			$("#account-submit").show();
		}else{
			$("#account-submit").hide();
		}
	}
	
});