package Test.MainJava.com;
import java.io.*;

	
	class check
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inp;
		int rem;
		String num = "";
		String numS = "";
		void input()throws Exception
		{
			System.out.println("give a no. to convert to binary format");
		
			String x = br.readLine();
			inp = Integer.parseInt(x);
		}
		void conv()throws Exception
		{
			
			
			for(int rem = 0; inp>0;inp = inp/2)
			{

				rem = inp % 2;
				
				
				if(rem == 0)
				{
					String str = Integer.toString(rem);
					numS = numS + str;

					
					
					
				}
				else if(rem ==1)
				{
					String str = Integer.toString(rem);
					numS = numS + str;
				
		
					
					
				}
			}
			
			
			int len = numS.length()-1;
			for(int i = 0;i<=numS.length()-1; i++)
			{
				num = num + numS.charAt(len);
				len--;
				
			}
			System.out.println(num);
		}
		public static void main(String[]args)throws Exception
		{
			check o1 = new check ();
			o1.input();
			o1.conv();
		}
	}
			
			
			
			


