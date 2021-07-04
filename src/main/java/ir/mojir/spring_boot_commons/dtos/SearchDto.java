package ir.mojir.spring_boot_commons.dtos;

public class SearchDto <T> {
	private T filters;
	private Paging paging;
	private Sorting sorting;
	public T getFilters() {
		return filters;
	}
	public void setFilters(T filters) {
		this.filters = filters;
	}
	public Paging getPaging() {
		return paging;
	}
	public void setPaging(Paging paging) {
		this.paging = paging;
	}
	public Sorting getSorting() {
		return sorting;
	}
	public void setSorting(Sorting sorting) {
		this.sorting = sorting;
	}
	
}
