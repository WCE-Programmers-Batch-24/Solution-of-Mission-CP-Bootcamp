package codeforces;

import java.io.*;
import java.util.*;


public class M_MagicalSticks
{
	final static FastReader fr = new FastReader();
	final static long mod = 1000000007 ;
	
	
	static void solve()
	{	
		// sticks have lengths 1, 2, 3, ...., n
		// sum of first and last = sum of 2nd and 2nd last = sum of 3rd and 3rd last
		// and so on...
		
		// if n is even we get n/2 such pairs
		// if n is odd we get n/2 and pairs if we consider nums from 1 to n-1
		// also last stick also has length = n ==> ans = n/2+1
		
		// from both conditions we can say ans = ceil value of n/2
		// ceil value means integer value equal or just greater than given num
		long n = fr.nextLong();
		
		double ans = Math.ceil((double)n/2) ;
		
		System.out.println((long)ans);
				
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
