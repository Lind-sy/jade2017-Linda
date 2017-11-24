package lv.vea.FaultListener;

public class Fault {
	private int type;
	private String message;

	public Fault(int type){
		this.type = type;
		this.message = "We got a problem";
	}
	public Fault(){
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getType(){
		return type;
	}

}
