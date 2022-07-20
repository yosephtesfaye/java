class PrintAlphabet
{
public static void main(String[] args) {
	
	

	char ch = 'A'

	if(ch >=65 && ch <=90)
	{
		char c = (char)(ch + 32);
		System.out.println(c);
	}
	System.out.println(ch);

}
}