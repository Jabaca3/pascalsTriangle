package test;

public class pascalsTriangle {
	public static void main (String [] args) {
		
		makeTriangle(3);
		
		
	}
	
	public static int[][] makeTriangle(int n) {
		int [][] m = new int[n+1][];
		for(int i=0; i<m.length; i++) {
			m[i]=new int[i+1];
			for(int j=0; j<m[i].length; j++) {
				if(j==0 || j==i) {
					m[i][j]=1;
				} else {
					m[i][j] = m[i-1][j-1]+ m[i-1][j];
				}
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
			
		}
		return m;
	}
}
