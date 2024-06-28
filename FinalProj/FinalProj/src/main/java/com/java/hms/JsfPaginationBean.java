package com.java.hms;
 
import java.util.List;
import java.util.Map;

import javax.faces.component.UICommand;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
 
public class JsfPaginationBean {
 
	private static final long serialVersionUID = 1L;
	private List<Provider> cdList;
	private ProviderDAOImpl  queryHelper;
	/**
	 * pagination stuff
	 */
	static private int totalRows;
	static private int firstRow;
	static private int rowsPerPage;
	static private int totalPages;
	private int pageRange;
	private Integer[] pages;
	static private int currentPage;
	/**
	 * Creates a new instance of JsfPaginationBean
	 */
	public JsfPaginationBean() {
		queryHelper = new ProviderDAOImpl();
		/**
		 * the below function should not be called in real world application
		 */
		// Set default values somehow (properties files?).
		rowsPerPage = 5; // Default rows per page (max amount of rows to be displayed at once).
		pageRange = 10; // Default page range (max amount of page links to be displayed at once).
	}
	public List<Provider> getProviderList(Provider provider) {
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("provider",provider);
		cdList=null;
		if (cdList == null) {
			loadProvider(provider);
		}
		if(cdList!=null && cdList.size()!=0) {
			sessionMap.put("notFoundErr", " ");	
			return cdList;
		}else {
			sessionMap.put("notFoundErr", "Record Not Found");
			return null;
		}	}	
	public void setCdList(List<Provider> cdList) {
		this.cdList = cdList;
	}
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getFirstRow() {
		return firstRow;
	}
	public void setFirstRow(int firstRow) {
		this.firstRow = firstRow;
	}
	public int getRowsPerPage() {
		return rowsPerPage;
	}
	public void setRowsPerPage(int rowsPerPage) {
		this.rowsPerPage = rowsPerPage;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getPageRange() {
		return pageRange;
	}
	public void setPageRange(int pageRange) {
		this.pageRange = pageRange;
	}
	public Integer[] getPages() {
		return pages;
	}
	public void setPages(Integer[] pages) {
		this.pages = pages;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	private void loadProvider(Provider provider) {
		System.out.println("First Row  " +firstRow);
		System.out.println("Count  " +rowsPerPage);
		cdList =queryHelper.searchProviders(firstRow, rowsPerPage,provider);
		System.out.println("Employ Count is  " +cdList);
		totalRows = queryHelper.countRows(provider);
		System.out.println("Total Rows  " +totalRows);
		// Set currentPage, totalPages and pages.
		currentPage = (totalRows / rowsPerPage) - ((totalRows - firstRow) / rowsPerPage) + 1;
		totalPages = (totalRows / rowsPerPage) + ((totalRows % rowsPerPage != 0) ? 1 : 0);
		int pagesLength = Math.min(pageRange, totalPages);
		pages = new Integer[pagesLength];
		// firstPage must be greater than 0 and lesser than totalPages-pageLength.
		int firstPage = Math.min(Math.max(0, currentPage - (pageRange / 2)), totalPages - pagesLength);
		// Create pages (page numbers for page links).
		for (int i = 0; i < pagesLength; i++) {
			pages[i] = ++firstPage;
		}
	}
	// Paging actions
	// -----------------------------------------------------------------------------
	public void pageFirst() {
		page(0);
	}
	public void pageNext() {
		page(firstRow + rowsPerPage);
		System.out.println(firstRow);
		System.out.println(rowsPerPage);
		System.out.println((firstRow + rowsPerPage)+"hitting");
	}
	public void pagePrevious() {
		page(firstRow - rowsPerPage);
		System.out.println(firstRow);
		System.out.println(rowsPerPage);
	}
	public void pageLast() {
		System.out.println(totalRows);
		System.out.println(rowsPerPage+"Lasthitting");
		page(totalRows - ((totalRows % rowsPerPage != 0) ? totalRows % rowsPerPage : rowsPerPage));
	}
	public void page(ActionEvent event) {
		page(((Integer) ((UICommand) event.getComponent()).getValue() - 1) * rowsPerPage);
	}
	private void page(int firstRow) {
		this.firstRow = firstRow;
		
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();

		
		Provider provider = (Provider)sessionMap.get("provider");
		loadProvider(provider);
	}
}