package lv.vea.FaultListener;

import java.util.ArrayList;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		EventMessageGenerator generator = new EventMessageGenerator();
		FaultLogger logger = new FaultLogger(generator);
		generator.faulted(3);
		FaultEmail email = new FaultEmail(generator);
		generator.faulted(1);

	}

}
