class Matrix {
	public static void main(String[] args) {
        
        System.out.println("OK "); // Display the result.
    }
    /*
		Rotate the matrix by 90 degrees.
		We rotate layer by layer using:
		for i=0 to n
			temp=top[i]
			top[i]=left[i]
			left[i]=bottom[i]
			bottom[i]=right[i]
			right[i]=temp
    */
    static boolean rotate(int[][] matrix) {
    	if (matrix.length() == 0 || matrix.length() != matrix[0].length()){
    		return false;
    	}
    	int n = matrix.length();
    	for(int layer = 0; layer < n/2; layer++){
    		int first = layer;
    		int last = n - 1 - layer;
    		for (int i = first;i < last;i++){
    			int offset = i - first;
    			int temp = matrix[first][i];
    			matrix[first][i] = matrix[last-offset][first];
    			matrix[last-offset][first] = matrix[last][last-offset];
    			matrix[last][last-offset] = matrix[i][last];
    			matrix[i][last] = temp;
    		}
    	}
    	return true;

    }

}