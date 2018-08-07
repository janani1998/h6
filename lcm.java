import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=6,b=10,max,step,lcm=0;
		if(a > b){
         max = step = a;
      }
      else{
         max = step = b;
      }

      while(a!= 0) {
         if(max % a == 0 && max % b == 0) {
            lcm = max;
            break;
         }
         max += step;
      }
      System.out.print(lcm);
	}
}
