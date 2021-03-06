package codeforces;



	import java.io.*;
	import java.util.*;


 public class Z_AndThenThereWereK 
	{
		final static FastReader fr = new FastReader();
		
	 static void solve()
	{	
		 
		 // if k = 2^a then k&(k-1) = 0
		 // 2^a   = 100000.. 
		 // 2^a-1 = 011111..
		 //       = 000000..
		 
		 // so find k such that k = 2^a then k-1 is our ans
		 
		 
		int n = fr.nextInt();
		int a = (int) (Math.log(n)/Math.log(2)) ;
			
		int ans = (int) Math.pow(2, a)  - 1;
			
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
