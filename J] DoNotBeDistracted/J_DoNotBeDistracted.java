package codeforces;


	import java.io.*;
	import java.util.*;
	 
	 
  public class J_DoNotBeDistracted 
  {
		final static FastReader fr = new FastReader();
		final static long mod = 1000000007 ;
		
		
	static void solve()
	{	
		// input n and s
		int n = fr.nextInt();
		String s = fr.next();
		
		// create a set to keep track of which letters are already taken
		Set<Character> set = new HashSet<>();
			
		int curr_ind = 0 , i = 0 ;
		
		
		while (curr_ind < n)
		{
			// check ith letter
			char ch = s.charAt(i) ;
				
			// if it was taken previously print NO
			if (set.contains(ch)) {
				System.out.println("NO");
				return ;
			}
			
			// if it was not taken previously
			// move curr_ind till we are getting same letter
			while (curr_ind < n && s.charAt(curr_ind) == ch) curr_ind++ ;
			
			// add that letter to set
			set.add(ch) ;	
			
			// update i to curr_ind
			i = curr_ind;
		}
			
		// if we came out of loop without printing NO, ans is YES
			System.out.println("YES");
				
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
