

/*LeetCode-258 Add Digits
 *Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 *For example:
 *Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 *Follow up:
 *Could you do it without any loop/recursion in O(1) runtime?
 */


public class AddDigits {
	public int addDigits(int num){
		if(num < 1){
			System.out.println("请输入大于0的整数");
			return -1;
		}else{
			if(num < 10){
				int a = num % 10;
				int b = (num - a) / 10;
				return addDigits(a + b);
			}else{
				return num;
			}
		}
	}
}
