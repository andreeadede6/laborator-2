window.addEventListener("deviceorientation",on_device_orientation);
function on_device_orientation(evt)
{
	var alpha = evt.alpha;
	var beta =evt.beta;
	var gamma =evt.gamma;
	document.getElementById("a").innerHTML = "alpha="+alpha;
	document.getElementById("b").innerHTML = "beta="+beta;
	document.getElementById("c").innerHTML = "gamma="+gamma;
	var cavans =document.getElementById("cavans");
	var context =cavans.getContext("2d");
	var centru={x:cavans.width/2 , y:cavans.height/2};
	var latura_patrat =50;
	context.setTransform(1,0,0,1,0,0);
	context.clearRect(0,0,cavans.width,cavans.height);
	context.translate(centru.x/2, centru.y/2);
	context.rotate( alpha *Math.PI/180);
	context.beginPath();
	context.rect(-latura_patrat/2,-latura_patrat/2,latura_patrat,latura_patrat);
	context.stroke();
}