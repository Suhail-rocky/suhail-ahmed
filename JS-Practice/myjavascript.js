function check()
{
	area=document.getElementById("mydiv");
	box=area.getElementsByTagName("input");
	data=document.getElementsByTagName("p");
	for(i=0;i<box.length;i++)
	{
		data[i].innerHTML=box[i].value;
		/*data[i].style.color="red";
		data[i].style.backgroundColor="pink";*/
		data[i].className="myclass1";
	}
	
}