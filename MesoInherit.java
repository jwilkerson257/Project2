public class MesoInherit extends MesoAbstract
{
	//TODO
	MesoStation STID;
	double average;
	
	public MesoInherit(MesoStation mesoStation)
	{
		this.STID = mesoStation;
	}

	@Override
	public int[] calAverage()
	{
		// TODO
		double sum = 0;
		int[] nodes = new int[3];
		
		// The for loop gets the ASCII values of each of the characters in the string mesoStation and adds them to the sum double variable
		for (int k = 0; k < STID.getStID().length(); k++)
		{
			sum += (double) STID.getStID().charAt(k);
		}
		
		// Takes the ceiling of the average ASCII values
		nodes[0] = (int) Math.ceil(sum / STID.getStID().length());
		
		// Takes the floor of the average ASCII values
		nodes[1] = (int) Math.floor(sum / STID.getStID().length());
		
		/* This if statement makes sure that if the decimal of the average of the StID values is greater than or equal to .5 
		 * then it takes the ceiling of the value and the else statement takes the floor of the value if it is less than .5.
		 */
		if ((Math.ceil(sum / STID.getStID().length())) - (sum / STID.getStID().length()) >= .5)
		{
			nodes[2] = (int) Math.ceil(sum / STID.getStID().length());
		}
		
		else
		{
			nodes[2] = (int) Math.floor(sum / STID.getStID().length());
		}
		
		// Sets the value of the average held in nodes[2] and assigns it to a global variable to use it in the letterAverage method
		average = nodes[0];
		return nodes;
	}

	// The letterAverage method takes the average value from the ASCII values and casts it into a character
	@Override
	public char letterAverage()
	{
		// TODO
		return (char) average;
	}
	
}
