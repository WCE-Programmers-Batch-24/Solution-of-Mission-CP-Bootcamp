package codeforces;


	import java.io.*;
	import java.util.*;





 public class S_FairPlayOff 
 {
	final static FastReader fr = new FastReader();

		
	static void solve()
	{	
		
		// if weaker of s1 and s2 is stronger than stronger of s3 and s4
		// or weaker of s3 and s4 is stronger than stronger than s1 and s2
		// then answer is NO
		
		int s1 = fr.nextInt(), s2 = fr.nextInt(), s3 = fr.nextInt(), s4  = fr.nextInt();
		if (Math.min(s1, s2) > Math.max(s3, s4) || Math.max(s1,  s2) < Math.min(s3, s4)) {
			System.out.println("NO");
		}
		else System.out.println("YES");
			
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
		
		
		
	}
