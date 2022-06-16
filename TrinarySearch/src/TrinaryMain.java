//Tyson Hichman
//CSCI 333
//Recursion
public class TrinaryMain {

	//Main method that tests my search class
	public static void main(String[] args) {
		int[] test = {1,2,3,4,5,6,7,8,9,20,199,235,299,3000,300000};		
		finder finder = new finder();
		int left = 0;
		int right = test.length -1;
		int numb = 9;
        int p = finder.ternarySearch(left, right, numb, test);
        System.out.println("Test 1 is: " + p);

        
        int[] test2 = {9,100,120,190,199,200,201,222,366,100000,100001};
        int left2 = 0;
		int right2 = test2.length -1;
		int numb2 = 100000;
        int p2 = finder.ternarySearch(left2, right2, numb2, test2);
        System.out.println("Test 2 is: " + p2);
        
        
        int[] test3 = {0,0,0,0,0,0,0,0,1};
        int left3 = 0;
		int right3 = test3.length -1;
		int numb3 = 0;
        int p3 = finder.ternarySearch(left3, right3, numb3, test3);
        System.out.println("Test 3 is: " + p3);
        
        int[] test4 = {0,1,2,4,4,4,5,6,7,8,9};
        int left4 = 0;
		int right4 = test4.length -1;
		int numb4 = 4;
        int p4 = finder.ternarySearch(left4, right4, numb4, test4);
        System.out.println("Test 4 is: " + p4);
        
        int[] test5 = {0,1,2,3,4,5,6,6,7,8,9,9};
        int left5 = 0;
		int right5 = test5.length -1;
		int numb5 = 9;
        int p5 = finder.ternarySearch(left5, right5, numb5, test5);
        System.out.println("Test 5 is: " + p5);
	}
}