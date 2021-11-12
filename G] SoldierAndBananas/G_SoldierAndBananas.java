package codeforces;



	import java.io.*;
	import java.util.*;
	 
	 
public class G_SoldierAndBananas {
		final static FastReader fr = new FastReader();
		final static long mod = 1000000007 ;
		
		
	static void solve()
	{	
		
		// To buy W bananas, money required = m
		// m = k + 2k + 3k + ... w terms
		// m = k(1+2+3+...) = k*(w*(w+1)/2)
		
		// money to borrow = m - n
			
		 int k = fr.nextInt();
		 long n = fr.nextLong();
		 int w= fr.nextInt();
		 
		 long ans = k*w*(w+1)/2 - n ;
		 
		 // if ans > 0 only then have to borrow money else ans = 0
		 if (ans > 0)
		 System.out.println(ans);
		 else System.out.println(0);
		 
		    
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