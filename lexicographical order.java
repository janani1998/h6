
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  String s="5432";
	  String s1="";
	  int l=s.length();
	  char temp;
	  char ch[]=s.toCharArray();
              for(int i=0;i<l;i++)
	{
	for(int j=i+1;j<l;j++)
	{
	if(ch[i]>ch[j])
	{
	temp=ch[i];
	ch[i]=ch[j];
	ch[j]=temp;
	}
	}
	s1=s1+String.valueOf(ch[i]);
	}
  System.out.print(s1);
	}
}
