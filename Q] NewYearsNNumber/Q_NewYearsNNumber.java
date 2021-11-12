package codeforces;



	import java.io.*;
	import java.util.*;


	public class Q_NewYearsNNumber 
	{
		final static FastReader fr = new FastReader();
		final static long mod = 1000000007 ;
		
		
		// consider k 2020's 
		// sum = 2020 + 2020 + 2020 + .. k times
		// keeping k nums only if we have to increase sum we can convert each 2020 to 2021
		// so max_sum = 2021 + 2021 + .. k times
		
		// so if year%2020 is less than or equal to no_of_2020 (n/2020)
		// print YES else print NO
		static void solve()
		{	
			int n = fr.nextInt();
			
			int rem = n%2020 ;
			int no_of_20 = n/2020 ;
			
			if (rem <= no_of_20) System.out.println("YES");
			else System.out.println("NO");
				
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

