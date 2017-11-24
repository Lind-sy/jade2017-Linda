package lv.vea.FaultListener;

public class FaultEmail implements EventListener {

	public FaultEmail(EventMessageGenerator subject){
		subject.addFaultListener(this);
	}

	public void faultEvent(Fault fault, String msg) {
		System.out.println("Sending email to Admin: "+fault.getType() + " occurred: " + msg);
	}

}
