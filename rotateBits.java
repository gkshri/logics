class rotateBits
{
static final int INT_BITS = 32;

static int leftRotate(int n, int d) {
	return (n << d) | (n >> (INT_BITS - d));
}

static int rightRotate(int n, int d) {
	return (n >> d) | (n << (INT_BITS - d));
}

public static void main(String arg[])
{
	int n = 16;
	int d = 2;
	System.out.print("Left Rotation of " + n +
						" by " + d + " is ");
	System.out.print(leftRotate(n, d));
	
	System.out.print("\nRight Rotation of " + n +
							" by " + d + " is ");
	System.out.print(rightRotate(n, d));
}
}
