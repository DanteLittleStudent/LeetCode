import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class MoveZeroes {
	public ArrayList<Integer> moveZeros(ArrayList<Integer> array){
		Iterator<Integer> iter = array.iterator();
		Queue<Integer> queue = new LinkedList<Integer>();
		int num = 0;
		while(iter.hasNext()){
			num = (Integer) iter.next();
			queue.add(num);
		}
		while(queue != null){
			num = queue.peek();
			if(num == 0){
				queue.poll();
				queue.add(num);
			}
		}
		array.clear();
		while(queue != null){
			num = queue.poll();
			array.add(num);
		}
		return array;
		
	}
}
