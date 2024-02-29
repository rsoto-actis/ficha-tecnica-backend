package cl.gobiernosantiago.fichatecnicaapi.entities;

public class FilterDTO {
	private String category;
    private String subcategory;
    private String init_date;
    private String end_date;
    private String type;
    private int    town;
    private int    prov;
    
    
    
	public int getProv() {
		return prov;
	}
	public void setProv(int prov) {
		this.prov = prov;
	}
	public int getTown() {
		return town;
	}
	public void setTown(int town) {
		this.town = town;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public String getInit_date() {
		return init_date;
	}
	public void setInit_date(String init_date) {
		this.init_date = init_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    
    
}
