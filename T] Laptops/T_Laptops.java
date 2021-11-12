package codeforces;


	import java.io.*;
	import java.util.*;





 public class T_Laptops 
 {
	final static FastReader fr = new FastReader();
		
	static void solve()
	{	
		int n = fr.nextInt();
		
		// store price and quality of a laptop in a pair
		Pair[] arr = new Pair[n] ;
		for (int i = 0 ; i < n ; i++)
		{
			arr[i] = new Pair(fr.nextInt(), fr.nextInt()) ;
		}
			
		// use comparator to sort according to our need
		// see compare function below.
		
		// here we sort the array such that laptop with less price comes first
		// if 2 laptops have same price. place laptop with bad quality first
		// and laptop with good quality after. So while comparing with laptop 
		// of next different price it is compared with best quality laptop of
		// current price
		compare(arr);
		boolean is_alex_happy = false;
			
		
		// check for each pos if its next laptop have higher price and bad quality. if yes,
		// Happy Alex
		
		for (int i = 0 ; i < n-1 ; i++)
		{
			if (arr[i].x < arr[i+1].x && arr[i].y > arr[i+1].y) {
				is_alex_happy = true;
				break ;
			}
		}
		
		// if no such ans is found , Poor Alex
		
		if (is_alex_happy) System.out.println("Happy Alex");
		else System.out.println("Poor Alex");
			
	}
		
		public static void main(String[] args) 
		{
		      int t = 1;
		      while (t-- > 0)
		      {
		    	  solve();
		      }
		}
		
		static class Pair{
			int x, y ;
			public Pair(int x, int y) {
				this.x= x ;
				this.y = y ;
			}
		}
		
		
		static void compare(Pair[] arr)
		{
			Arrays.sort(arr, new Comparator<Pair>() {

				@Override
				public int compare(Pair arg0, Pair arg1) {
						 if (arg0.x < arg1.x) return -1 ;
					  else if (arg0.x > arg1.x) return 1 ;
					  else if (arg0.y > arg1.y) return -1 ;
					return 1;
				}
			});
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
