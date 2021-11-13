package codeforces;

import java.io.*;
import java.util.*;
	 
	 
public class C_Dragons
{
	final static FastReader fr = new FastReader();
	final static long mod = 1000000007 ;
		
	static void solve()
	{	
		int s = fr.nextInt(), n = fr.nextInt();
		    
		// we store drangon's strength and bonus for killing this dragon
		// in a pair
	    Pair dragons[] = new Pair[n] ;
		    
	  // taking input
	  for (int i = 0 ; i < n ; i++)
	  {
		   dragons[i] = new Pair(fr.nextInt(), fr.nextInt()) ;  	
	  }
			
	 // this method sort the array of pairs according to first element of pair i.e. strength of
	 // dragon. We can use Comparator for sorting according to our need
	compare(dragons, n);
		    
	 // first we will kill the weakest dragon and get bonus points
	// So start killing dragons from left to right
	// if at any point strength < dragons's strength, print NO and return
	 for (int i = 0 ; i < n ; i++)
	 {
		   if (dragons[i].x < s) {
		   		s += dragons[i].y ;
		  	} else {
	    		System.out.println("NO");
	    		return ;
	    	}
	 }
	 
	 // if we got out of loop without printing NO means all dragons are killed.
	 // print YES
		 System.out.println("YES");
		    
	}
		
		
	public static void main(String[] args) 
	{
	      int t = 1;
	      while (t-- > 0)
	      {
		   	  solve();
	     }
	}
		
	
	static class Pair
	{
		int x ;
		int y ;
		public Pair(int x, int y)
		{
			this.x = x ;
			this.y = y ;
		}
	}
		
		
	static void compare(Pair arr[], int n)
	{
		// Comparator to sort the pair according to second element
        Arrays.sort(arr, new Comparator<Pair>() {
        	@Override public int compare(Pair p1, Pair p2)
		            {
		                return p1.x - p2.x;
		            }
		    });
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
	
	
	
	
	
	


