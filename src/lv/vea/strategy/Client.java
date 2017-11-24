package lv.vea.strategy;

import java.util.ArrayList;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create sort algorithm
		SortStrategy sorter1 = new QuickSort();
		SortStrategy sorter2 = new MergeSort();
		//Create search engine
		CatalogSearchEngine engine = new CatalogSearchEngine(sorter1);
		//Search and sort books 
		ArrayList<Book> bookList = engine.search("Newton");
	}

}
