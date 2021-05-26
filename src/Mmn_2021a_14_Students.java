public class Mmn_2021a_14_Students 
{
	private static int countQ1 = 0, countQ2 = 0, countQ3 = 0, countQ4 = 0;
	private static int passedQ1 = 0, passedQ2 = 0, passedQ3 = 0, passedQ4 = 0;

	private static void testQ1() 
	{
		q1(new int[]{2,1}, 1);
		q1(new int[]{1,7,2}, 5);
		q1(new int[]{1,7,6,2,4}, 5);
		q1(new int[]{1,7,6,2,4}, 5);
		q1(new int[]{12,7,8,11,8}, 5);
		q1(new int[]{12,7,8,11,4}, 8);
		q1(new int[]{11,7,8,12,8}, 4);
		q1(new int[]{11,7,8,12,4}, 8);
		q1(new int[]{5, 21, 3, 27, 12, 24, 7, 6, 4}, 23);
		q1(new int[]{5, 21, 3, 22, 12, 7, 26, 14}, 18);
		q1(new int[]{5, 15, 3, 22, 12, 7, 27, 14}, 15);
		q1(new int[]{7,2,5,12,8,3,13,7}, 9);
		q1(new int[]{7,2,5,12,4,3,17,7,5}, 12);
		q1(new int[]{7,2,17,7,5,5,12,4,3}, 14);
		q1(new int[]{7,2,17,7,5,5,12,6,18}, 12);
		q1(new int[]{7,2,17,7,5,5,12,6,6}, 12);

		/* Add more here */
		q1(new int[]{1,2,3,4,5,6}, 0);
		q1(new int[]{2,2,2,2,2,2}, 0);
	}


	private static void testQ2()
	{
		q2(new int[][]{
						{0,1,0,1,1,0},
						{1,0,1,1,0,0},
						{0,0,0,1,0,1},
						{0,0,0,0,0,0},
						{1,0,1,1,0,0},
						{0,1,0,1,1,1}
					   }, 3);
		
		q2(new int[][]{
						{0,1,0,0,0,1},
						{1,0,0,1,1,1},
						{0,0,0,0,0,0},
						{1,1,1,1,1,1},
						{0,1,0,1,0,1},
						{1,0,0,0,1,0}
					   }, -1);
		
		q2(new int[][]{
						{1,1,1,1,1,1},
						{1,1,1,1,1,1},
						{1,1,1,1,1,1},
						{1,1,1,1,1,1},
						{1,1,1,1,1,1},
						{1,1,1,1,1,1}
					   }, -1);
		
		q2(new int[][]{
						{0,0,0,0,0,0},
						{0,0,0,0,0,0},
						{0,0,0,0,0,0},
						{0,0,0,0,0,0},
						{0,0,0,0,0,0},
						{0,0,0,0,0,0}
					   }, -1);
		
		q2(new int[][]{
						{1,0,0,0,0,0},
						{1,0,0,0,0,0},
						{1,0,0,0,0,0},
						{1,0,0,0,0,0},
						{1,0,0,0,0,0},
						{1,0,0,0,0,0}
					   }, -1);
		
		q2(new int[][]{
						{0,0,0,0,0,0},
						{1,0,0,0,0,0},
						{1,0,0,0,0,0},
						{1,0,0,0,0,0},
						{1,0,0,0,0,0},
						{1,0,0,0,0,0}
					   }, 0);
		
		q2(new int[][]{
						{0,0,0,0,0,0},
						{0,1,0,0,0,0},
						{0,1,0,0,0,0},
						{0,1,0,0,0,0},
						{0,1,0,0,0,0},
						{0,1,0,0,0,0}
					   }, -1);
		
		q2(new int[][]{
						{0,0,0,0,1,0},
						{0,1,0,0,1,0},
						{0,1,0,0,1,0},
						{0,1,0,0,1,0},
						{0,1,0,0,1,0},
						{0,1,0,0,0,0}
					   }, -1);
		
		q2(new int[][]{
						{0,1,0,0,0,1},
						{1,0,0,1,1,1},
						{0,0,0,0,0,1},
						{1,1,1,1,1,1},
						{0,1,0,1,0,1},
						{0,0,0,0,0,0}
					   }, 5);
		
		q2(new int[][]{
						{0,1,0,0,0,1},
						{1,0,0,1,1,1},
						{0,0,0,0,0,1},
						{1,1,1,1,1,1},
						{0,1,0,1,0,1},
						{0,1,0,0,0,0}
					   }, -1);
		

		/* Add more here */

		q2(new int[][]{
				{0,1,1},
				{1,0,1},
				{0,0,0},

		}, 2);

		q2(new int[][]{
				{0,0,0},
				{1,0,1},
				{0,0,1},

		}, -1);

		q2(new int[][]{
				{1,1,0},
				{1,0,0},
				{0,0,0},

		}, -1);
		
	}
	
	private static void testQ3()
	{
		q3(new boolean[][]{
							{false,true},
							{true,true}
						  }, 0, 0, 0);
		
		q3(new boolean[][]{
							{false,true},
							{true,true}
		  				  }, 0, 1, 3);
		
		q3(new boolean[][]{
							{false,true},
							{true,true}
		  				  }, 1, 1, 3);
		
		q3(new boolean[][]{
							{false,true},
							{true,false}
						  }, 0, 1, 2);	
		
		q3(new boolean[][]{
							{false},
							{true}
			  			  }, 1, 0, 1);
		
		q3(new boolean[][]{
							{false},
							{true}
						  }, 0, 0, 0);
	
		q3(new boolean[][]{
							{true},
							{false}
				  		  }, 0, 0, 1);

		q3(new boolean[][]{
							{true},
							{false}
		  				  }, 1, 0, 0);
		
		q3(new boolean[][]{
							{false,true},
							{true,false}
						   }, 0, 0, 0);
		
		q3(new boolean[][]{
							{true,false},
							{false,true}
						  }, 0, 0, 2);
		
		q3(new boolean[][]{
							{true,false},
							{false,true}
						  }, 1, 1, 2);
		
		q3(new boolean[][]{
							{true,false},
							{false,true}
						  }, 0, 1, 0);
		
		q3(new boolean[][]{
							{true,false},
							{false,true}
		  				  }, 1, 0, 0);

		q3(new boolean[][]{
							{false}
						  }, 0, 0, 0);
		
		q3(new boolean[][]{
							{false}
		  				  }, 1, 1, 0);
		
		q3(new boolean[][]{
							{true}
						  }, 0, 0, 1);
		
		q3(new boolean[][]{
							{true}
		  				  }, 1, 1, 0);
		
		q3(new boolean[][]{}, 0, 0, 0);
		
		q3(new boolean[][]{
							{false,false,false},
							{false,false,false},
							{false,false,false}
						   }, 1, 1, 0);
		
		q3(new boolean[][]{
							{true,true,true},
							{true,true,true},
							{true,true,true}
						   }, 1, 1, 9);
		
		q3(new boolean[][]{
							{true,true,true},
							{true,true,true},
							{true,true,true},
						   }, -1, -1, 0);
		
		q3(new boolean[][]{
							{true,true,true},
							{true,true,true},
							{true,true,true}
						   }, 3, 3, 0);
		
		q3(new boolean[][]{
							{true,true,true},
							{true,true,true},
							{true,true,true}
						   }, 3, 1, 0);
		
		q3(new boolean[][]{
							{true,true,true},
							{true,true,true},
							{true,true,true}
						   }, 1, 3, 0);
		
		q3(new boolean[][]{
							{false,false,false,false,true},
							{false,true,true,true,false},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,false,false,false}
						   },0, 4, 6);
		
		q3(new boolean[][]{
							{false,false,false,false,true},
							{false,true,true,true,false},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,false,false,false}
						   },2, 3, 6);
		
		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{false,false,false,false,false},
							{true,true,true,false,false}
		   				  }, 1, 1, 0);
		
		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{false,false,false,false,false},
							{true,true,true,false,false}
			  			  }, 0, 1, 2);
		
		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{false,false,false,false,false},
							{true,true,true,false,false}
						  }, 1, 0, 2);
				
		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
						  }, 0, 4, 5);
		
		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
						  }, 1, 3, 5);
		
		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
		  				  }, 1, 4, 5);

		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
		  				  }, 2, 2, 5);

		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
						  }, 2, 3, 5);
		
		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
						  },3, 0, 4);
		
		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
						  }, 4, 0, 4);
		
		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
						  }, 4, 1, 4);
		
		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
						  }, 4, 2, 4);
		
		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
						  }, 4, 3, 0);

		q3(new boolean[][]{
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false},
							{false,true,false,false,true},
							{true,false,false,true,true},
							{false,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
						  }, 1, 3, 5);
		
		q3(new boolean[][]{
							{true,true,false,false,true},
							{true,false,false,true,true},
							{true,true,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false},
							{true,true,false,false,true},
							{true,false,false,true,true},
							{true,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
						  }, 2, 1, 22);
		
		q3(new boolean[][]{
							{true,true,false,false,true},
							{true,false,false,true,true},
							{true,true,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false},
							{true,true,false,false,true},
							{true,false,false,true,true},
							{true,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
						  }, 3, 1, 0);
		
		q3(new boolean[][]{
							{true,true,false,false,true},
							{true,false,false,true,true},
							{true,true,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false},
							{true,true,false,false,true},
							{true,false,false,true,true},
							{true,false,true,true,false},
							{true,false,false,false,false},
							{true,true,true,false,false}
						  }, 5, 4, 5);

		
		/* Add more here */
	
	}

	private static void testQ4()
	{
		q4(new int[]{5}, new int[]{5}, true);
		q4(new int[]{5,4}, new int[]{5,4}, true);
		q4(new int[]{4,5}, new int[]{4,5}, true);
		q4(new int[]{1,-2,3,4}, new int[]{3,2,4,1}, false);
		q4(new int[]{5,5,5,5}, new int[]{5,5,5,5}, true);
		q4(new int[]{5,5,5}, new int[]{5,5,5,5}, false);
		q4(new int[]{5,5,5,5}, new int[]{5,5,5}, false);
		q4(new int[]{1,2,3,4}, new int[]{3,2,-4,1}, false);
		q4(new int[]{5,5,5,-5}, new int[]{5,5,-5,5}, true);
		q4(new int[]{5,5,5,-5}, new int[]{-5,5,-5,5}, false);
		q4(new int[]{-5,5,5,-5}, new int[]{5,5,-5,5}, false);
		q4(new int[]{1,2,3,4}, new int[]{3,2,4,1}, true);
		q4(new int[]{4,2,3,4}, new int[]{3,2,4,4}, true);
		q4(new int[]{1,2,4,4}, new int[]{1,2,4,2}, false);
		q4(new int[]{1,2,3,4}, new int[]{3,2,4,5}, false);
		q4(new int[]{1,2,3,4}, new int[]{3,2,4,1,5}, false);
		q4(new int[]{10,20,30}, new int[]{30,20,15}, false);
		q4(new int[]{10,20,30,15}, new int[]{30,20,15,15}, false);
		//
		q4(new int[]{0,0,2,0}, new int[]{1,1,0,0}, false);
		q4(new int[]{10,20,30}, new int[]{10,20,30,10}, false);
		q4(new int[]{-4,-3,-2,-1}, new int[]{-4,-3,-2,0}, false);
		q4(new int[]{2,2}, new int[]{8,1}, false);
		q4(new int[]{2,2,2,1}, new int[]{2,1,2,1}, false);


		
		/* Add more here */
	}



	/***************** IGNORE *****************/


	public static void main(String[] args) 
	{
		System.out.println("------------ Updated 10.5.21 - Zeev ------------");
		System.out.println("------------ BEGIN TEST Q1 ------------");
		testQ1();
		System.out.println("Summary Q1: " + passedQ1 + "\\" + countQ1);
		System.out.println("Make sure time & space complexity is the best!");
		System.out.println("Dont forget to write time & space complexity in API");
		System.out.println("------------ End TEST Q1 ------------\n\n");


		System.out.println("------------ BEGIN TEST Q2 ------------");
		testQ2();
		System.out.println("Summary Q2: " + passedQ2 + "\\" + countQ2);
		System.out.println("Make sure time & space complexity is the best!");
		System.out.println("Dont forget to write time & space complexity in API");
		System.out.println("------------ End TEST Q2 ------------\n\n");

		System.out.println("------------ BEGIN TEST Q3 ------------");
		testQ3();
		System.out.println("Summary Q3: " + passedQ3 + "\\" + countQ3);
		System.out.println("Test is not checking prints! just returned value");
		System.out.println("------------ End TEST Q3 ------------\n\n");

		System.out.println("------------ BEGIN TEST Q4 ------------");
		testQ4();
		System.out.println("Summary Q4: " + passedQ4 + "\\" + countQ4);
		System.out.println("------------ End TEST Q4 ------------");
	}

	private static void q1(int[] a, int ans) 
	{
		countQ1++;
		
		try
		{
			int result = Ex14.maximalDrop(a);
			if (result == ans)
			{
				System.out.printf("%s %30s\n","Test #" + countQ1, "\t\tPassed");
				passedQ1++;
			}
			else
			{
				System.out.printf("\n%s %30s","Test #" + countQ1, "\t\tFAILED!!!!\n");
				System.out.println("Input is:\na =\n" + arrayToString(a));
				System.out.println("Student's output is:\n" + result);
				System.out.println("Output should be:\n" + ans);
			}
		} catch (Exception e) 
		{
			System.out.printf("\n%s %30s","Test #" + countQ1, "\t\tFAILED!!!! Exception while running\n");
			System.out.println("Input is:\na =\n" + arrayToString(a));
			e.printStackTrace();
			System.out.println();
		}
	}

	private static void q2(int[][] a, int ans) 
	{
		countQ2++;

		try
		{
			int result = Ex14.isSink(a);
			if (result == ans) 
			{
				System.out.printf("%s %30s\n","Test #" + countQ2, "\t\tPassed");
				passedQ2++;
			}

			else 
			{
				System.out.printf("\n%s %30s","Test #" + countQ2, "\t\tFAILED!!!!\n");			
				System.out.println("Input is:\na = " + matToString(a));
				System.out.println("Student's output is:\n" + result);
				System.out.println("Output should be:\n" + ans);
			}
		}
		catch (Exception e) 
		{
			System.out.printf("\n%s %30s","Test #" + countQ2, "\t\tFAILED!!!! Exception while running\n");
			System.out.println("Input is:a =\n" + matToString(a));
			e.printStackTrace();
			System.out.println();
		}
	}
	
	private static void q3(boolean[][] a, int x, int y, int ans) 
	{
		countQ3++;
		
		try
		{
			int result = Ex14.size(a, x, y);
			if (result == ans) 
			{
				System.out.printf("%s %30s\n","Test #" + countQ3, "\t\tPassed");
				passedQ3++;
			}

			else 
			{
				System.out.printf("\n%s %30s","Test #" + countQ3, "\t\tFAILED!!!!\n");			
				System.out.println("Input is:\nx = " + x + ", y = " + y + "\n"
						+ "a =\n" + matToString(a));
				System.out.println("Student's output is:\n" + result);
				System.out.println("Output should be:\n" + ans);
			}
		}
		catch (Exception e) 
		{
			System.out.printf("\n%s %30s","Test #" + countQ2, "\t\tFAILED!!!! Exception while running\n");
			System.out.println("Input is:\nx = " + x + ", y = " + y + "\n"
					+ "a =\n" + matToString(a));
			e.printStackTrace();
			System.out.println();
		}
	}

	private static void q4(int[] a, int[] b, boolean ans) 
	{
		countQ4++;

		try
		{
			boolean result = Ex14.isPermutation(a,b);

			if (result == ans) 
			{
				System.out.printf("%s %30s\n","Test #" + countQ4, "\t\tPassed");
				passedQ4++;
			}

			else 
			{
				System.out.printf("\n%s %30s","Test #" + countQ4, "\t\tFAILED!!!!\n");			
				System.out.println("Input is:\na =\n" + arrayToString(a) + "\nb =\n" + arrayToString(b));
				System.out.println("Student's output is:\n" + result);
				System.out.println("Output should be:\n" + ans);
			}
		}
		catch (Exception e) 
		{
			System.out.printf("\n%s %30s","Test #" + countQ4, "\t\tFAILED!!!! Exception while running\n");
			System.out.println("Input is:\na =\n" + arrayToString(a) + "\nb =\n" + arrayToString(b));
			e.printStackTrace();
			System.out.println();
		}
	}

	private static String arrayToString(int[] a)
	{
		String s = "{";
		for (int i = 0; i < a.length; i++)
			if (i == a.length - 1)
				s += a[i];
			else 
				s += a[i] + ", ";
		s += "}";
		return s;
	}

	private static String matToString(boolean[][] a)
	{
		String s = "{\n";
		for (int i = 0; i < a.length; i++)
		{
			s += "{";
			for (int j = 0; j < a[0].length; j++)
			{
				if (j == a[0].length - 1 && i == a.length - 1)
					s += ((a[i][j]) ? 1 : 0) + "}";
				else if (j == a[0].length - 1)
					s += ((a[i][j]) ? 1 : 0) + "}\r\n";
				else
					s += ((a[i][j]) ? 1 : 0) + ", ";
			}
		}
		s += "\n}";
		return s;
	}
	
	private static String matToString(int[][] a)
	{
		String s = "{\n";
		for (int i = 0; i < a.length; i++)
		{
			s += "{";
			for (int j = 0; j < a[0].length; j++)
			{
				
				if (j == a[0].length - 1 && i == a.length - 1)
					s += a[i][j] + "}";
				else if (j == a[0].length - 1)
					s += a[i][j] + "}\r\n";
				else
					s += a[i][j] + ", ";
			}
		}
		s += "\n}";
		return s;
	}

	private static boolean[][] copyMat(boolean[][] a)
	{
		boolean[][] newMat = new boolean[a.length][a.length];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[0].length; j++)
			{
				newMat[i][j] = a[i][j];
			}
		}

		return newMat;
	}
}
