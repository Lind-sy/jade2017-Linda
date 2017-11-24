package lv.vea.strategy;

import java.util.ArrayList;

public class CatalogSearchEngine {
	
	private SortStrategy sorter; 
	
	public CatalogSearchEngine(SortStrategy sorter){
		this.sorter = sorter; 
	}
	
	public ArrayList<Book> search(String parameter){
		ArrayList<Book> list = new ArrayList<Book>() ;
		sorter.sort(list);
		return list; 
	}

}
