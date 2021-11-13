package codeforces;


	import java.io.*;
	import java.util.*;



	public class O_CardsForFriends 
	{
		final static FastReader fr = new FastReader();
		final static long mod = 1000000007 ;
		
		
	 static void solve()
	 {	
	 	int w = fr.nextInt(), h = fr.nextInt(), n = fr.nextInt() ;
		boolean ans = false ;
		
		int papers = 1 ;
		
		// keep cutting along length
		// till w is even. After cutting one time papers become double
		while (w%2==0) 
		{
			w /= 2 ;
			papers *= 2 ;
			
			// if at any point papers >= required
			// store true in ans and break
			if (papers >= n) { ans = true ;
			   break ;
			}
		}
		
		// after cutting along length is done,
		// start cutting along width till h is even
		while (h%2 == 0)
		{
			h /= 2 ;
			papers *= 2 ;
			// if at any point papers >= required
						// store true in ans and break
			if (papers >= n) { ans = true ;
			   break ;
			}
		}
		
		// if ans = true print YES. or if n == 1 then it is always possible. print YES
		if (ans || n == 1) System.out.println("YES");
	
		// else print NO
		else System.out.println("NO");
		
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
