package codeforces;



	import java.io.*;
	import java.util.*;


	public class P_AddOddOrSubtractEven {
		final static FastReader fr = new FastReader();
		final static long mod = 1000000007 ;
		
		
	static void solve()
	{	
		long a = fr.nextLong(), b = fr.nextLong();
			
		// if a == b no need to perform any operation
		if (a == b) {
			System.out.println(0);
			return ;
		}
			
		// if a < b and b-a is odd ... we can add that odd (b-a) ==> so ans =1
		// if a < b and b-a is even.. we can add an odd such that a becomes 2 more than b4
		// then subtract 2(even) ==> so ans = 2
		if (a < b)
		{
			if ((b-a)%2 == 1) System.out.println(1);
			else System.out.println(2);
		}
			
		// if a > b and b-a is even we can subtarct that even (a-b) ==> ans = 1
		// if a > b and b-a is odd .. subtract even from a such that a becomes b-1.. now add one
		// ==> ans = 2
		else {
			if ((a-b)%2 == 0) System.out.println(1);
			else System.out.println(2);
		}
			
	}
		
		
		
		public static void main(String[] args) 
		{
		      int t = fr.nextInt();
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

