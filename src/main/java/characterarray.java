
public class characterarray {
	public static void main(String[] args)
	{
		characterarray c = new characterarray();
		char[]s = c.createarray();
		printelements(s);
	}
	private static void printelements(char[]s)
	{
		for(int i =0 ;i<s.length;i++)
		{
	System.out.println(s[i]);
		}
	}
	
	  public char[] createarray()
	  {
     char[] s = new char[26];
    for(int i =0 ;i<s.length;i++)
    {
    	s[i]= (char)('a' + i);
    }
     return s;
     
    
}
}
