package codeforces;


	import java.io.*;
	import java.util.*;


  public class Y_DoubleCola {

		final static FastReader fr = new FastReader();
		static String[] person = {"Sheldon", "Leonard", "Penny","Rajesh", "Howard"} ;
		
		static void solve()
		{	
			int n = fr.nextInt();
			
			// initially people = 5
			int a = 5 ;
			
			// count of each person
			int b = 1 ;
			
			// if n < a we'll get some answer in this round only
			// else this round will be completed
			
			// each person's count will be doubled. 
			// also total number of people will be doubled
			// subtract no of people who took a drink in current round
			// from n
			while (a < n) 
			{
				n -= a ;
				a *= 2 ;
				b *= 2 ;
			}
			
			
			// we are getting some ans in this round
			// if not even one round is completed print person[n-1]
			if (b == 1) 
			{
				System.out.println(person[n-1]);
			}
			
			// calculate pos 
			// first b are sheldon, next b are leonard ...
			else 
			{
			int pos = (int) (Math.ceil((double)n/b - 1)) ;
			
			System.out.println(person[pos]);
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

