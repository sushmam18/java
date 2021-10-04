class Icecream
{
	String type;
	String flavour;
	float temp;
	Icecolor color;
	Brand brand;
	
	Icecream(float temp)
	{
		this.temp=temp;
	}
	Icecream(float temp,String flavour,Icecolor color)
	{
		this(temp);
		this.flavour=flavour;
		this.color=color;
	}
}