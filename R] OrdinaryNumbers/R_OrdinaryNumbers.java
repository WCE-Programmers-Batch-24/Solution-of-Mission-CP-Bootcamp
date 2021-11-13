package codeforces;

import java.io.*;
import java.util.*;





 public class R_OrdinaryNumbers 
 {
	final static FastReader fr = new FastReader();

		
	static void solve()
	{	
		long n = fr.nextLong();
		long temp = n ;
		
		// l_digit = last digit
		int l_digit = (int) (temp%10) ;		
		int no_of_digits = 0 ;
		
		// find no_of_digits in number
		while (temp > 0) {
			l_digit = (int) (temp%10) ;
			no_of_digits++ ;
			temp /= 10 ;
		}
		
		// if num has k digits then all ordinary nums with k-1 digits, k-2 digits,... 
		// will be considered in answer... plus if last digit is l then l-1 , l-2
		//.. digits each will have a corresponding number of Num of digits =  no_of_digits
		int ans = (no_of_digits - 1)*9 + (l_digit - 1) ;
			
		int num = 0 ;
		
		// if num with Num of digits = no_of_digits and last_digit = l_digit
		// is less than given num that also should be considered
		for (int i = 0 ; i < no_of_digits ; i++)
		{
			num = num*10 + l_digit ;
		}
			
		if (num <= n) ans++ ;
			
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

