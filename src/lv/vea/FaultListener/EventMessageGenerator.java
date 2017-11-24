package lv.vea.FaultListener;

import java.util.ArrayList;

public class EventMessageGenerator {

	private ArrayList<EventListener> listeners = new ArrayList<EventListener>();
	private Fault fault = new Fault();

	public EventMessageGenerator(){

	}
	public void addFaultListener(EventListener listener) {
		listeners.add(listener);
	}
	protected void notifyCustomer() {
		for (EventListener fl: listeners) {
			fl.faultEvent(fault, fault.getMessage());
		}
	}
	public void removeFaultListener(EventListener listener) {
		listeners.remove(listener);
	}
	public void faulted(int code){
		fault = new Fault(code);
		notifyCustomer();

	}
}
