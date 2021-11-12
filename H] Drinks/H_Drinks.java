package codeforces;


	import java.io.*;
	import java.util.*;
	 
	 
public class H_Drinks {
	final static FastReader fr = new FastReader();
	final static long mod = 1000000007 ;
		
		
	static void solve()
	{	
		
		// ans = sum(volume_fractions)/n
		
		int n = fr.nextInt();
	   double s = 0 ;
		   
	   for (int i = 0 ; i < n ; i++)
	   {
		   int p = fr.nextInt();
		   s += (double)p ;
	   }
		   
	    System.out.println(s/n);
	    
	}
		
		
	public static void main(String[] args) 
	{
		int t = 1;
        while (t-- > 0)
		  {
		    	 solve();
	      }
    }
		
	static int lower_bound(int arr[], int key)
	{
		int pos = Arrays.binarySearch(arr, key) ;
		 if (pos < 0)
	    {
			 pos = -(pos + 1) ;
	    }
	    return pos ;
	 		
	}
		
		static int upper_bound(int arr[], int key)
		{
			int pos = Arrays.binarySearch(arr, key) ;
			pos++ ;
			if (pos < 0)
			{
				pos = -(pos) ;
			}
			return pos ;
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