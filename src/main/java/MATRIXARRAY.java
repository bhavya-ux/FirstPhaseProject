
public class MATRIXARRAY {
	public static void main(String[] args)
	{
		/*int[][] twodim;
		 twodim = new int[5][];
		
		twodim[0] = new int[] {1};
		twodim[1]= new int[] {1,2};
		twodim[2]= new int[] {1,2,3};
		twodim[4]= new int[] {1,2,3,4};
		twodim[4]= new int[] {1,2,3,4};*/
		
		int[][] twoDim = {{1},{1,2},{1,2,3}};
		
		
	for(int i=0;i<twodim.length;i++)
	{
		for(int j=0;j<twodim[i].length;j++)
		{
			System.out.println(twodim[i][j]+"");
		}
	System.out.println();
	}

}
}
