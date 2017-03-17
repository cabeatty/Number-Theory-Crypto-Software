package UTL;

/**
 * Created by colin on 17/03/17.
 */
public class modularMath
{
	public int modulo(int n, int p)
	{
		int r = n%p;
		if(((p > 0) && (r < 0)) || ((p < 0) && (r > 0)))
			r += p;
		return r;
	}

	public int inverse(int n, int p) {
		n = modulo(n, p);
		for(int x = 1; x < p; x++)
		{
			if(modulo(n*x, p) == 1)
				return x;
		}
		return 0;
	}
}
