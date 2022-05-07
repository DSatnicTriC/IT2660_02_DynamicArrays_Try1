public class BodyfatSimulator {
	public static void main(String[] args) {
		var bodyfat = new Bodyfat();
		
		bodyfat.InsertBodyfatCellAtTheEnd(new BodyfatCell(4));
		bodyfat.InsertBodyfatCellAtTheEnd(new BodyfatCell(67));
		bodyfat.InsertBodyfatCellAtTheEnd(new BodyfatCell(73));
		
		bodyfat.ReportThyAmount();		
	}
}