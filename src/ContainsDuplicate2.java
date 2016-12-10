

/*LeetCode-219 Contains Duplicate II
 * Given an array of integers and an integer k, 
 * find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
 * and the difference between i and j is at most k.
 */


public class ContainsDuplicate2 {
	public boolean containsDuplicate(int[] num, int k){
		if(num.length-k > 0){
			for(int i=0; i<num.length-k; i++){
				for(int j=i+1; j<i+k+1; j++){
					if(num[i] == num[j]){
						return true;
					}
				}
			}
		}else{
			for(int i=0; i<num.length; i++){
				for(int j=i+1; j<num.length; j++){
					if(num[i] == num[j]){
						System.out.println("_______________________________");
						return true;
					}
				}
			}
		}
		return false;
	}
}
