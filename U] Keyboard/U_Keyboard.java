package codeforces;



	import java.io.*;
	import java.util.*;





  public class U_Keyboard 
  {
		final static FastReader fr = new FastReader();
		
		

		static void solve()
		{	
			String s = "qwertyuiopasdfghjkl;zxcvbnm,./" ;
			
			
			char ch = fr.next().charAt(0) ;
			String input = fr.next();
			
			
			if (ch == 'L') {
			for (int i = 0 ; i < input.length(); i++) 
			{
				// for each char of input find that char in s and print letter to its right
			   for (int j = 0 ; j < s.length(); j++) {
				   if (s.charAt(j) == input.charAt(i)) {
					   System.out.print(s.charAt(j+1));
					   break ;
				   }
			   }
			}
			} else {
				for (int i = 0 ; i < input.length(); i++) 
				{
					// for each char in input, find that char in s and print letter to its left
				   for (int j = 0 ; j < s.length(); j++) {
					   if (s.charAt(j) == input.charAt(i)) {
						   System.out.print(s.charAt(j-1));
						   break ;
					   }
				   }
			}} System.out.println();
			
			
			
			
				
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
