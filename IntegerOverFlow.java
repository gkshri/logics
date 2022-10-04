class IntegerOverFlow
{
static int addOvf(int result, int a, int b)
{
	result = a + b;
	if(a > 0 && b > 0 && result < 0)
		return -1;
	if(a < 0 && b < 0 && result > 0)
		return -1;
	return 0;
}

public static void main(String args[]) {
	int res = -2147483646;
	int x = 2147483640;
	int y = 10;

	System.out.println(addOvf(res, x, y));
	System.out.print(res);
}
}
