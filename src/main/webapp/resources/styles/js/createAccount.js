function check(input){
	if (input.value != document.getElementById('pwd').value){
		input.setCustomValidity('Passwords must match');
	} else {
		input.setCustomValidity('');
	}
}