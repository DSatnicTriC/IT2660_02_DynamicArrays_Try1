public class BodyfatSimulator {
	static Bodyfat bodyfat = new Bodyfat();
	
	public static void main(String[] args) {
		
		bodyfat.ReportThyAmount();
		
		var bodyFatInsertionsAtEnd = new int[] {4, 67, 73, 53, 57, 12};
		for (int i = 0; i < bodyFatInsertionsAtEnd.length; i++) {
			InsertBodyfatCellAtTheEnd(bodyFatInsertionsAtEnd[i]);
		}
		
		// invalid insertions
		InsertBodyfatCellAtInsertBodyfatCellAtSpecificPosition(23, 37);
		InsertBodyfatCellAtInsertBodyfatCellAtSpecificPosition(23, 345);
		
		// valid insertions
		InsertBodyfatCellAtInsertBodyfatCellAtSpecificPosition(345, 2);
		InsertBodyfatCellAtInsertBodyfatCellAtSpecificPosition(120, 5);
		
		bodyfat.ReportThyAmount();
		
		// invalid removal
		RemoveBodyfatCellAtSpecificPosition(23);
		
		// valid removal
		RemoveBodyfatCellAtSpecificPosition(0);
		RemoveBodyfatCellAtSpecificPosition(5);
		
		bodyfat.ReportThyAmount();
	}
	
	private static void InsertBodyfatCellAtTheEnd(int amount) {
		System.out.println("Attempting to insert " + amount);
		bodyfat.InsertBodyfatCellAtTheEnd(new BodyfatCell(amount));
	}
	
	private static void InsertBodyfatCellAtInsertBodyfatCellAtSpecificPosition(int amount, int position) {
		System.out.println("Attempting to insert " + amount + " at position " + position);
		try {
			bodyfat.InsertBodyfatCellAtSpecificPosition(new BodyfatCell(amount), position);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	private static void RemoveBodyfatCellAtSpecificPosition(int position) {
		System.out.println("Attempting to remove cell at position " + position);
		try {
			bodyfat.RemoveBodyfatCellAtSpecificPosition(position);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}