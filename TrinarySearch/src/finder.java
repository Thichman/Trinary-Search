
public class finder {

	//standard recursive trinary search method
	public int ternarySearch(int left, int right, int key, int array[])
    {
        if (right >= left) {
 
        	//sets up my thirds 
            int middle1 = left + (right - left) / 3;
            int middle2 = right - (right - left) / 3;
 
           
            if (array[middle1] == key) {
                return middle1;
            }
            if (array[middle2] == key) {
                return middle2;
            }
 
            //recursion based on what third my key is found in 
            if (key < array[middle1]) {
 
                return ternarySearch(left, middle1 - 1, key, array);
            }
            else if (key > array[middle2]) {
 
                return ternarySearch(middle2 + 1, right, key, array);
            }
            else {
 
              
                return ternarySearch(middle1 + 1, middle2 - 1, key, array);
            }
        }
 
        return -1;
    }
}
