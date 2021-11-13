package codeforces;


	import java.io.*;
	import java.util.*;
	 
	 
	public class K_BachgoldProblem {
		final static FastReader fr = new FastReader();
		final static long mod = 1000000007 ;
		
		
	static void solve()
	{	
		int n = fr.nextInt();
		
		// we have to find maximum possible primes
		// so we try to take smallest prime number
		
		// we can keep subtracting 2 from that number till it is 
		// greater than 2
		
		// when it becomes 3 or 0 stop
		
		// if number is even it can be represented as sum
		// of 2's n/2 times
		if (n%2 == 0)
		{
			int count = n/2 ;
			System.out.println(count);
			for (int i = 0 ; i < count ; i++) 
			{
				System.out.print(2 + " ");
			}
			System.out.println();
			return ;
		}
		
		// if number is odd it can represented as sum of a 3
		// and (n/2 - 1) 2's
		else 
		{
			int count = n/2 - 1 ;
			System.out.println(count+1);
			for (int i =0 ;i < count ; i++) {
				System.out.print(2 + " ");
			}
				System.out.println(3);
		}
			
				
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
