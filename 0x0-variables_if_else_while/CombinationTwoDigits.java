class CombinationTwoDigits
{
	public static void main(String[] args) {

	for(int i=0 ; i<9; i++)
	{
		for(int j=i+1; j<10;j++)
		{
			System.out.print(i+""+j);
			if(i==8 && j==9)
			{
			continue;	
			}
			System.out.print(",");
		}
	}
	}
}