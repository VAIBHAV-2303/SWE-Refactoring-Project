/*
 * Alley.java

/**
 * Class that is the outer container for the bowling simulation
 *
 */

public class Alley {
	public ControlDesk controldesk;

	public Alley(int numLanes) {
		controldesk = new ControlDesk(numLanes);
	}

	public ControlDesk getControlDesk() {
		return controldesk;
	}

}
