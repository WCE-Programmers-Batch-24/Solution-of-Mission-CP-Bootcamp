package codeforces;



	import java.io.*;
	import java.util.*;





  public class U_Keyboard 
  {
		final static FastReader fr = new FastReader();
		
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

		static void solve()
		{	
			String s = "qwertyuiopasdfghjkl;zxcvbnm,./" ;
			
			
			char ch = fr.next().charAt(0) ;
			String input = fr.next();
			
			
			if (ch == 'L') {
			for (int i = 0 ; i < input.length(); i++) 
			{
				// for each char of input find that char in s and print letter to its right
			   for (int j = 0 ; j < s.length(); j++) {
				   if (s.charAt(j) == input.charAt(i)) {
					   System.out.print(s.charAt(j+1));
					   break ;
				   }
			   }
			}
			} else {
				for (int i = 0 ; i < input.length(); i++) 
				{
					// for each char in input, find that char in s and print letter to its left
				   for (int j = 0 ; j < s.length(); j++) {
					   if (s.charAt(j) == input.charAt(i)) {
						   System.out.print(s.charAt(j-1));
						   break ;
					   }
				   }
			}} System.out.println();
			
			
			
			
				
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
