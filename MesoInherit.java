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

		for (int k = 0; k < STID.getStID().length(); k++)
		{
			sum += (double) STID.getStID().charAt(k);
		}
		nodes[0] = (int) Math.ceil(sum / STID.getStID().length());
		nodes[1] = (int) Math.floor(sum / STID.getStID().length());
		if ((Math.ceil(sum / STID.getStID().length())) - (sum / STID.getStID().length()) >= .5)
		{
			nodes[2] = (int) Math.ceil(sum / STID.getStID().length());
		}
		
		else
		{
			nodes[2] = (int) Math.floor(sum / STID.getStID().length());
		}
		average = nodes[0];
	}

	// The letterAverage method takes the average value from the ASCII values and casts it into a character
	@Override
	public char letterAverage()
	{
		// TODO
	}
}
