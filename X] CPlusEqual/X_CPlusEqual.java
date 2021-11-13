package codeforces;

	import java.io.*;
	import java.util.*;


	public class X_CPlusEqual {

		final static FastReader fr = new FastReader();
		
		

	static void solve()
	{	
		
		int a = fr.nextInt(), b = fr.nextInt(), n = fr.nextInt();
		
		// ans stores min no of operations required
		int ans =  0 ;
			
		// given a and b , we have 2 choices :
		// 1) a+b , b
		// 2) a, a+b
		
		// as a + b is same in both cases.. next sum depends on a or b
		// so we keep larger number of a and b and change smaller number
		
		// Eg. 4, 5 ==> 9, 5 or 4, 9 ==> we'll take 9, 5 as it'll give more sum next time
		while (a+b <= n) {
			ans++ ;
			if (a < b) a += b ;
			else b += a ;
		}
			
		System.out.println(ans+1);
			
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
		
		static class Pair{
			int x, y ;
			public Pair(int x, int y)
			{
				this.x = x ;
				this.y = y ;
			}
		}
		
		static void compare(Pair[] arr)
		{
			Arrays.sort(arr, new Comparator<Pair>() {
				@Override
				public int compare(Pair p1, Pair p2) {
					if (p1.x < p2.x) return -1 ;
					else if (p2.x < p1.x) return 1 ;
					return 0 ;
				}
			});
		}
		
		
		
	}
