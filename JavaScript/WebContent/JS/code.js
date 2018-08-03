function greetings(){
	alert(document.loginform.username.value);
	var sum = myFunction(10,20);
}

//window.document.write('Hello');
/*function greetings(){
	sum(7,7);
	sum('7','7');
}

//function sum(num1,num2){
	var result = num1+num2;
alert(num1+num2);}*/

var myFunction = function(var1, var2){
	alert(var1+var2);
}

function test1(){
	var1 = 1;//var1 is a global variable now. it executes first, because we haven't putit within greetings that's called in the html file.
}
test1();

function test2(){
	alert(var1);
}
test2();

function display(){
	var hd = document.getElementById('hellodiv');
	hd.innerHTML = 'Clicked....';
}
