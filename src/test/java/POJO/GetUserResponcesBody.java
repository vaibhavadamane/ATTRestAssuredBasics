package POJO;

import java.util.List;

public class GetUserResponcesBody
{
	

	Integer page;
	Integer per_page;
	Integer total;
	Integer total_pages;
	List<Data> data;
	Support support;
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPer_page() {
		return per_page;
	}
	public void setPer_page(Integer per_page) {
		this.per_page = per_page;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Integer getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(Integer total_pages) {
		this.total_pages = total_pages;
	}
	public List<Data> getData() {
		return data;
	}
	public void setData(List<Data> data) {
		this.data = data;
	}
	public Support getSupport() {
		return support;
	}
	public void setSupport(Support support) {
		this.support = support;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
