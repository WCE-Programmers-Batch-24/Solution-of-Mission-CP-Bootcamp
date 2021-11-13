package codeforces;


	import java.io.*;
	import java.util.*;
	 
	 
	public class E_NextRound {
		final static FastReader fr = new FastReader();
		final static long mod = 1000000007 ;
		
		
	static void solve()
	{	
		int n = fr.nextInt() , k = fr.nextInt();
	    int arr[] = new int[n] ;
	    for (int i = 0 ; i < n ; i++) arr[i] = fr.nextInt();
	    
	    // scores are already given in descending order
	    // check for each Contestant, if his score is greater than
	    // kth contestant increase ans by 1
	    
	    int ans = 0 ;
	  
	    for (int i = 0 ; i < n ; i++)
	    {
	    	if(arr[i] >= arr[k-1] && arr[i] != 0)
	    		ans++ ;
	    }
	    
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
		
		
