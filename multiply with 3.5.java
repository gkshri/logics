class Test {
		
	static int multiplyWith3Point5(int x)
	{
		return (x<<1) + x + (x>>1);
	}
	
	public static void main(String[] args)
	{
		int x = 2;
		System.out.println(multiplyWith3Point5(x));
	}
}

