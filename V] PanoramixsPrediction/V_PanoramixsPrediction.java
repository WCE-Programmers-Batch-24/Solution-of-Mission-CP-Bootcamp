package codeforces;


import java.io.*;
import java.util.*;





  public class V_PanoramixsPrediction
  {
	final static FastReader fr = new FastReader();
		
		

	static void solve()
	{	
		
		// n < m <= 50 range is very small . store all primes in that range in
		// an array in increasing order
		int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47} ;
		int n = fr.nextInt(), m = fr.nextInt();
		int i ;
		
		// find pos of n in array
		for (i = 0 ; i < primes.length ; i++) if (n == primes[i]) break ;
		
		// if i+1 th element in array is m ==> ans = YES
		// ans = No
		if (i < primes.length-1 && primes[i+1] == m) System.out.println("YES");
		else System.out.println("NO");	
	}
		
		public static void main(String[] args) 
		{
		      int t = 1;
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
