public class OfficeItems {

    public OfficeItems(String name, int id, String position) {
		this.name = name;
		this.id = id;
		this.position = position;
	}

	@Override
	public String toString() {
		return "OfficeItem {name=" + name + ", id=" + id + ", position=" + position + "}";
	}

	private String name;
    private int id;
    private String position;

  
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name ;
    }
    


    public int getid(){
        return id;
    }
    
    public void setName(int id){
        this.id = id ;
    }


    public String getPosition(){
        return position;
    }
    
    public void setPosition(String position){
        this.position = position ;
    }
    


    
}
