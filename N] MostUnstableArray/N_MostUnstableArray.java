package codeforces;


	import java.io.*;
	import java.util.*;
	 
	 
	public class N_MostUnstableArray 
	{
		final static FastReader fr = new FastReader();
		final static long mod = 1000000007 ;
		
		
		static void solve()
		{	
			
			// sum of elements is exactly m
			// if n > 2 	
			// at one pos place m, such that left and right are zero. 
			// sum of abs diff = 2*m
			// since all elements are non-negative ans can't be more than 2*m
			
			// Eg. m = 5 and n = 4
			// 0 0 5 0
			// sum of abs diffs = 0 + 5 +5
			
			// Eg. m = 5 and n = 5
			// 0 0 0 5 0
			// sum of abs diffs = 0 + 0 + 5 + 5
			
			long n = fr.nextLong(), m = fr.nextLong();
			
			if (n == 1) System.out.println(0);
			if (n == 2) System.out.println(m);
			if (n > 2) System.out.println(2*m);		
		}
		
		
		
		public static void main(String[] args) 
		{
		      int t = fr.nextInt();
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
