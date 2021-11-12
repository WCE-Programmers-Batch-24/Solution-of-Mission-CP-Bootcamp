package codeforces;


	import java.io.*;
	import java.util.*;


public class L_BoringApartments {
	final static FastReader fr = new FastReader();
	final static long mod = 1000000007 ;
		
		
	static void solve()
	{	
		int x = fr.nextInt();
		
		// find what is digit in number x
		int l = x%10 ;
		
		// if x has all 3's then all nums possible from 2's and 1's are over
		// for one digit : 1 , 11, 111, 1111 and similar for others
		// so for each digit if all apartments are over ==> 10 clicks
		int ans = (l-1)*10 ;
		
		// now for curr digit start adding
		// 1 then 2 then 3..
		// until we get given number
		int i = 1 ;
		while (x > 0)
		{
			ans += i ;
			x /= 10 ;	
			i++ ;
		}
			
		System.out.println(ans);
					
	}
		
		
		
		public static void main(String[] args) 
		{
		      int t = fr.nextInt();
		      while (t-- > 0)
		      {
		    	  solve();
		      }
		}
		
		static long gcd(long a , long b)
		{
			if (b == 0) return a ;
			return gcd(b, a%b) ;
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
