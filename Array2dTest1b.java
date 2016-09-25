package ControlBox;

	public class Array2dTest1b {
		public static void main (String[] args){
		
		String[][] people = {{ "Jim", "6.0", "Blond", "Blue", "Male", "50" }, { "Deb", "5.5", "Blond", "Brown", "Female", "50'ish" }, { "Sara", "5.6", "Blond", "Blue", "Female", "26" }, { "Matthew", "5.11", "Red", "Blue", "Male", "24" }};

    	System.out.println("NAME\tHEIGHT\tHAIR\tEYES\tGENDER\tAGE");
    	display(people);
	}

	public static void display(String x[][]) {
    	for (int row = 0; row < x.length; row++) {
        	for (int column = 0; column < x[row].length; column++) {
            	System.out.print(x[row][column] + "\t");
        	}
        	System.out.println();
    	}
	}
}