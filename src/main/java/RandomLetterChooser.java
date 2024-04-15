public class RandomLetterChooser extends RandomStringChooser
{
	private String[] arr;
	public RandomLetterChooser(String str)
	{ 
		/* to be implemented in part (b) */
		arr= new String[str.length()];
		for(int i=0;i<str.length();i++){
		arr[i]=str.substring(i,i+1);

		}
	}
	
	
	public static String[] getSingleLetters(String str)
	{ 
		String[] letterArray = new String[str.length()];
		for(int i=0; i<str.length(); i++)
		{
			letterArray[i] = ""+str.charAt(i);
		}
		return letterArray;
	}
}
