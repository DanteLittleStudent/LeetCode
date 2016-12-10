

/*LeetCode-371 Sum of Two Integer
 *Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *Example:
 *Given a = 1 and b = 2, return 3.
 */
public class SumTwoInteger {
	public int sumTwoInteger(int a, int b){
		if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = a & b;
        return sumTwoInteger(sum, carry << 1);
	}
}
