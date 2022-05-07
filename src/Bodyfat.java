public class Bodyfat {
	private BodyfatCell[] bodyfatCells;
	
	public void InsertBodyfatCellAtTheEnd(BodyfatCell newCell) {
		if (bodyfatCells == null || bodyfatCells.length == 0) {
			this.InsertIntoFatFreeBody(newCell);
			return;
		}

		this.ExpandBodyfatByOneNewCellAtTheEnd(newCell);
	}
	
	public void InsertBodyfatCellAtSpecificPosition(BodyfatCell newCell, int position) throws Exception {
        if (position < 0 || position > this.bodyfatCells.length) {
            throw new Exception("Position " + position + " is not valid");
        }
	}
	
	private void InsertIntoFatFreeBody(BodyfatCell newCell) {
		this.bodyfatCells = new BodyfatCell[1];
        this.bodyfatCells[0] = newCell;
	}
	
	private void ExpandBodyfatByOneNewCellAtTheEnd(BodyfatCell newCell) {
		var newArray = new BodyfatCell[bodyfatCells.length + 1];
		 
        for (int i = 0; i < bodyfatCells.length; i++) {
        	newArray[i] = bodyfatCells[i];        	
        }
        
        newArray[bodyfatCells.length] = newCell;
        
        this.bodyfatCells = newArray;
	}
	
	public void ReportThyAmount() {
		System.out.println("Final Amounts:");
		for (int i = 0; i < bodyfatCells.length; i++) {
			System.out.println("Position: " + i + " ... " + "Amount: " + bodyfatCells[i].getBodyfatAmount());
		}		
	}
}