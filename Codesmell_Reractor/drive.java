//Main class where the programme starts
import java.util.Vector;
import java.io.*;

public class drive {

	public static void main(String[] args) {

		int numLanes = 3;
		int maxPatronsPerParty = 5;
        //Alley intialization with 3 lanes
		Alley a = new Alley(numLanes);
		ControlDesk controlDesk = a.getControlDesk();

		ControlDeskView cdv = new ControlDeskView(controlDesk, maxPatronsPerParty);
		controlDesk.subscribe(cdv);

	}
}
