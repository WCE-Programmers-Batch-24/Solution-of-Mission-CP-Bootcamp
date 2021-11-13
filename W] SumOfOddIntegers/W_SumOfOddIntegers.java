package codeforces;


	import java.io.*;
	import java.util.*;


	public class W_SumOfOddIntegers {
		final static FastReader fr = new FastReader();
		

		static void solve()
		{	
			
			// odd*odd = odd... odd*even = even
			// so if n is even then k must be even 
			// if n is odd then k also must be odd
			int n = fr.nextInt(), k = fr.nextInt();
			
		
			// sum of first k odds = k*k
			// so if k*k > n then not possible
			
			// while comparing k*k <=n do it like k <= sqrt(n)
			// because k*k can go out of range of int
			
			if (k <= Math.sqrt(n) && (n&1) == (k&1)) System.out.println("YES");	
			else System.out.println("NO");
		}
		
		public static void main(String[] args) 
		{
			System.out.println();
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
