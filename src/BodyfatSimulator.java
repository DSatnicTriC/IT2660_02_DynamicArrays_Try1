public class BodyfatSimulator {
	static Bodyfat bodyfat = new Bodyfat();
	
	public static void main(String[] args) {
		
		var bodyFatInsertionsAtEnd = new int[] {4, 67, 73, 53, 57, 12};
		for (int i = 0; i < bodyFatInsertionsAtEnd.length; i++) {
			InsertBodyfatCellAtTheEnd(bodyFatInsertionsAtEnd[i]);
		}
		
		// invalid insertion
		InsertBodyfatCellAtInsertBodyfatCellAtSpecificPosition(23, 23);
		
		bodyfat.ReportThyAmount();		
	}
	
	private static void InsertBodyfatCellAtTheEnd(int amount) {
		bodyfat.InsertBodyfatCellAtTheEnd(new BodyfatCell(amount));
	}
	
	private static void InsertBodyfatCellAtInsertBodyfatCellAtSpecificPosition(int amount, int position) {
		try {
			bodyfat.InsertBodyfatCellAtSpecificPosition(new BodyfatCell(amount), position);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
}