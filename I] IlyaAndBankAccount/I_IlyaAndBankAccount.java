package codeforces;


	import java.io.*;
	import java.util.*;
	 
	 
 public class I_IlyaAndBankAccount {
		final static FastReader fr = new FastReader();
		final static long mod = 1000000007 ;
		
		
	static void solve()
	{	
			
		long n = fr.nextLong();
		
		// if amount is negative i.e. if lion owes bank money
		// then only we do the operation
		if (n < 0)
		{
			
		  n *= -1 ;
		  long temp = n ;
			  
		  
		  // find last and second last digit in number
		  long l_digit = temp%10 ;
		  temp /= 10 ;
		  long sl_digit = temp%10 ;
			 
		  // if last digit is greater than second last digit
		  // simply remove it
		  if (l_digit > sl_digit) {
			  n /= 10 ;
		  }
		  // else remove second last digit
		  else 
		  {
			  n /= 100 ;
			  n = n*10 + l_digit ;
		  }
			  n *= -1 ;
		}
		  
	  System.out.println(n);
		   
	    
	}
		
		
		public static void main(String[] args) 
		{
		      int t = 1;
		      while (t-- > 0)
		      {
		    	  solve();
		      }
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