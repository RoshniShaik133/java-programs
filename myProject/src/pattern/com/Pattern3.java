package pattern.com;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for(i =1; i<=4; i++) {
			for( j =1; j <=4; j++)
			{
				 if(j%2 == 0)
				 {
					 System.out.print("#");
				 }
				 else
				 {
					 System.out.print("*");
				 }
				 System.out.println();
			}
		}

	}

}
