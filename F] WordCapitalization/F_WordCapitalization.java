package codeforces;


	import java.io.*;
	import java.util.*;
	 
	 
	public class F_WordCapitalization 
	{
		final static FastReader fr = new FastReader();
		final static long mod = 1000000007 ;
		
		
		static void solve()
		{	
		    String s = fr.next();
		    
		    // we have to make change only if first letter is small
		     if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') 
		     {
		    	 // find capital letter corresponding to that first small letter
		    	 char c = (char) (s.charAt(0) + (int)('A' - 'a')) ;
		    	 
		    	 String to_replace = ""+s.charAt(0) ;
		    	 String replace_into = ""+c ;
		    	 
		    	 // replace method replaces the a letter with new letter
		    	 // replaceFirst finds first occurrence of that letter and replaces
		    	 s = s.replaceFirst(to_replace, replace_into) ;
		     }
		     System.out.println(s);
		    
		}
		
		
		public static void main(String[] args) 
		{
		      int t = 1;
		      while (t-- > 0)
		      {
		    	  solve();
		      }
		}
		
		
		
		
		static class FastReader {
	 
		    BufferedReader br;
		    
		    StringTokenizer st;
	 
		    public FastReader()
		    {
		        br = new BufferedReader(
		            new InputStreamReader(System.in));
		    }
	 
		    String next()
		    {
		        while (st == null || !st.hasMoreElements()) {
		            try {
		                st = new StringTokenizer(br.readLine());
		            }
		            catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		        return st.nextToken();
		    }
	 
		    int nextInt() { return Integer.parseInt(next()); }
	 
		    long nextLong() { return Long.parseLong(next()); }
	 
		    double nextDouble()
		    {
		        return Double.parseDouble(next());
		    }
	 
		    String nextLine()
		    {
		        String str = "";
		        try {
		            str = br.readLine();
		        }
		        catch (IOException e) {
		            e.printStackTrace();
		        }
		        return str;
		    }
		}
		
		
		
	}
