public class MesoInherit extends MesoAbstract
{
	//TODO
	MesoStation STID;
	
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
	}

	// The letterAverage method takes the average value from the ASCII values and casts it into a character
	@Override
	public char letterAverage()
	{
		// TODO
	}
}
