package container;

public class Nib {
	private String materialTypeString;
	private float width;
	public Nib() {
		// TODO Auto-generated constructor stub
	}
	public Nib(String materialTypeString, float width) {
		this.materialTypeString = materialTypeString;
		this.width = width;
	}
	public String getMaterialTypeString() {
		return materialTypeString;
	}
	public void setMaterialTypeString(String materialTypeString) {
		this.materialTypeString = materialTypeString;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	

}
