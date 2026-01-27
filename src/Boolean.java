public class Boolean
{
	public static void main (String [] args)
	{
		boolean p;
		boolean q;
		boolean r;
		
		//Bool01
		
		p = true;
		q = false;
		r = false;
		
		System.out.println("Bool01:");
		System.out.println(p & q);
		System.out.println(p & q == r);
		System.out.println((p & q) == r);
		System.out.println("");
		
		//Bool02
		
		p = true;
		q = false;
		r = true;
		
		System.out.println("Bool02:");
		System.out.println(p |!q);
		System.out.println(p | q & r);
		System.out.println((p | q) & r);
		System.out.println("");
		
		//Bool3
		
		p = true;
		q = false;
		r = true;
		
		System.out.println("Bool03:");
		System.out.println((p & q) == r);
		System.out.println(p & (q == r));
		System.out.println((p | q) & (!r));
		System.out.println(p | (q & (!r)));
		
	}
}

