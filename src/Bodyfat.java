public class Bodyfat {
	private BodyfatCell[] bodyfatCells;
	
	public void ReportThyAmount() {
		System.out.println("................");
		if (this.bodyfatCells == null) {
			System.out.println("Fat Free!!");
		}
		else {
			System.out.println("Current Amounts:");
			for (int i = 0; i < this.bodyfatCells.length; i++) {
				System.out.println("Position: " + i + " ... " + "Amount: " + this.bodyfatCells[i].getBodyfatAmount());
			}
		}		
		System.out.println("................");
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
            throw new Exception("Position " + position + " is not valid for insertion");
        }
        
        this.ExpandBodyfatByOneNewCellToSpecificPosition(newCell, position);
	}
	
	public void RemoveBodyfatCellAtSpecificPosition(int position) throws Exception {
        if (position < 0 || position > this.bodyfatCells.length) {
            throw new Exception("Position " + position + " is not valid for removal");
        }
        
        if (position == 0 && this.bodyfatCells.length == 1) {
        	this.bodyfatCells = null;
		}
        
        this.ContractBodyfatByRemovingOneCellFromASpecificPosition(position);
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
	
	private void ContractBodyfatByRemovingOneCellFromASpecificPosition(int position) {
		var newArray = new BodyfatCell[this.bodyfatCells.length - 1];
		 
        for (int i = 0; i < position - 1; i++) {
        	newArray[i] = this.bodyfatCells[i];        	
        }
 
        for (int i = position + 1; i < this.bodyfatCells.length; i++) {
        	newArray[i-1] = this.bodyfatCells[i];
        }
        
        this.bodyfatCells = newArray;
	}
}