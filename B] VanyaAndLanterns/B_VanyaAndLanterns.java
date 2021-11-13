package codeforces;

import java.io.*;
import java.util.*;
 
 
 
public class B_VanyaAndLanterns
{
	final static FastReader fr = new FastReader();
	final static long mod = 1000000007 ;
	
	static void solve()
	{	
	    
		// n is no of lamps
		int n = fr.nextInt();
		
		// l is endpoint of path
		long l = fr.nextInt();
		
		
		long arr[] = new long[n] ;
		for (int i = 0 ; i < n ; i++)
			arr[i] = fr.nextLong();
		
		// sort the array so that we can check the lamps from  start to end
		Arrays.sort(arr);
		
		// max_diff will store max distance between any 2 lamps
		long max_diff ;
		if (n > 1)
		max_diff = arr[1] - arr[0] ;
		else max_diff = arr[0] - 0 ;
		
		// check for each adjacent lamp what is the distance between them
		for (int i = 1 ; i < n-1 ; i++)
		{
			if (arr[i+1] - arr[i] > max_diff) max_diff = arr[i+1] - arr[i] ;
		}
		
		// if a and b lamp have max distance between them. the
		// a and b each should have light radius min_diif / 2
	    double ans = (double)max_diff/2 ;
	    
	    // edge cases
	    
	    // if distance between end point and last lamp is greater than answer
	    // then last lamp must have light radius of endpoint - pos of last lamp
	    // similar for start point and first lamp
	    if (l - arr[n-1] > ans) ans = l - arr[n-1] ;
	    if (arr[0] - 0 > ans) ans = arr[0] - 0 ;
	    
	    System.out.println(ans);
		
   
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
