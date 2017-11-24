package lv.vea.FaultListener;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FaultLogger implements EventListener {

	private static Logger logger = Logger.getLogger("");

	public FaultLogger(EventMessageGenerator fmg) {
		fmg.addFaultListener(this);
	}

	public void faultEvent(Fault fault, String msg) {
		logger.log(Level.WARNING, "A " + fault.getType() + " occurred: " + msg);
	}

}
