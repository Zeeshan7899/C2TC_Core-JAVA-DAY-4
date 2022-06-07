package DAY6;

public class looping {
	public static void main (String[] args) {
		
	  // for loop
	  for(int i=1,j=1; i<10||j<10;i++,j++)
	  { 
		  j++;
		  System.out.println("i="+i+" and j="+j); 
	  }


	  // while loop 
		  int z=1,y=1;
		  while(z<10 || y<10)
		  { 
			  z++; y++;
		      System.out.println("z="+z+" and y="+y); 
		  }	
		
	// Do while loop
		int u = 1, v = 1;
		do {
			u++;
			v++;
			System.out.println("u=" + u + " and v=" + v);
		    } while (u < 10 || v < 10);
	}
}
/* OUTPUT
 i=1 and j=2
i=2 and j=4
i=3 and j=6
i=4 and j=8
i=5 and j=10
i=6 and j=12
i=7 and j=14
i=8 and j=16
i=9 and j=18
z=2 and y=2
z=3 and y=3
z=4 and y=4
z=5 and y=5
z=6 and y=6
z=7 and y=7
z=8 and y=8
z=9 and y=9
z=10 and y=10
u=2 and v=2
u=3 and v=3
u=4 and v=4
u=5 and v=5
u=6 and v=6
u=7 and v=7
u=8 and v=8
u=9 and v=9
u=10 and v=10
*/
