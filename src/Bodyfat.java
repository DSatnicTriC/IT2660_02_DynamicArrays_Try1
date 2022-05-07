public class Bodyfat {
	private BodyfatCell[] bodyfatCells;
	
	public void ReportThyAmount() {
		System.out.println("................");
		System.out.println("Current Amounts:");
		for (int i = 0; i < this.bodyfatCells.length; i++) {
			System.out.println("Position: " + i + " ... " + "Amount: " + this.bodyfatCells[i].getBodyfatAmount());
		}		
	}
	
	public void InsertBodyfatCellAtTheEnd(BodyfatCell newCell) {
		if (this.bodyfatCells == null || this.bodyfatCells.length == 0) {
			this.InsertIntoFatFreeBody(newCell);
			return;
		}

		this.ExpandBodyfatByOneNewCellToSpecificPosition(newCell, this.bodyfatCells.length);
	}
	
	public void InsertBodyfatCellAtSpecificPosition(BodyfatCell newCell, int position) throws Exception {
        if (position < 0 || position > this.bodyfatCells.length) {
            throw new Exception("Position " + position + " is not valid");
        }
        
        this.ExpandBodyfatByOneNewCellToSpecificPosition(newCell, position);
	}
	
	private void InsertIntoFatFreeBody(BodyfatCell newCell) {
		this.bodyfatCells = new BodyfatCell[1];
        this.bodyfatCells[0] = newCell;
	}
	
	private void ExpandBodyfatByOneNewCellToSpecificPosition(BodyfatCell newCell, int position) {
		var newArray = new BodyfatCell[this.bodyfatCells.length + 1];
		 
        for (int i = 0; i < position; i++) {
        	newArray[i] = this.bodyfatCells[i];        	
        }
        
        newArray[position] = newCell;
 
        for (int i = position + 1; i <= this.bodyfatCells.length; i++) {
        	newArray[i] = this.bodyfatCells[i - 1];
        }
        
        this.bodyfatCells = newArray;
	}	
}