package interFace;

public class Brance implements BasicInformation {
	private String name;
	private String location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
//	public String branceInformation(){
//		return "Brance Name:"+name+"Location"+location;
//	}
	@Override
	public String GetBasicInfo() {
		return "Brance Name:"+name+"Location"+location;

	}

}
