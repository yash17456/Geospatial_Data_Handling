import java.util.*;
import java.lang.*;
class Spirograph
{
	public static void main(String...args)
	{
		double R=8.0, r=1.0, a=4.0;
		double x,y;
		for(double t=0.000; t<16*Math.PI; t=t+0.01)
		{
			x = 0.001*((R+r)*Math.cos((r/R)*t) - a*Math.cos((1+r/R)*t));
			y = 0.001*((R+r)*Math.sin((r/R)*t) - a*Math.sin((1+r/R)*t));
			x=x+34.021438;
			y=y+(-118.289030);
			System.out.println(y+","+x+","+"0");
		}
	}
}