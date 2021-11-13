package codeforces;

import java.io.*;
import java.util.*;
 
 
 
public class A_Puzzles
{
	final static FastReader fr = new FastReader();
	final static long mod = 1000000007 ;
	
	static void solve()
	{	
	    
		// we have to select n puzzles out of m.
		// diff between difficulty of hardest and easiest must be min
		int n = fr.nextInt(), m = fr.nextInt();
		
		int arr[] = new int[m] ;
		for (int i = 0 ; i < m ; i++)
			arr[i] = fr.nextInt();
		
		// sort the array
		Arrays.sort(arr);
		int min_diff = Integer.MAX_VALUE;
		
		// check if we take first n puzzles (0 to n-1), What is the diff between easiest and hardest
		int i = 0 , j = n-1 ;
		
		// now check for puzzles from pos 1 to n... then 2 to n+1 .. and so on
		// if we get minimum answer store it in min_diff
		while (j < m)
		{
			if (arr[j] - arr[i] < min_diff) min_diff = arr[j] - arr[i] ;
			j++ ; i++ ;
		}
		
		
		System.out.println(min_diff);
 	    
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
