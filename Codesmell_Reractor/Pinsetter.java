/*
 * Pinsetter.java

/**
 * Class to represent the pinsetter
 *
 */

import java.util.*;
//import java.lang.Boolean;

public class Pinsetter {

	private Random rnd;
	private Vector subscribers;

	private boolean[] pins;
	/*
	 * 0-9 of state of pine, true for standing, false for knocked down
	 * 
	 * 6 7 8 9 3 4 5 2 1 0
	 * 
	 */
	private boolean foul;
	private int throwNumber;

	/**
	 * sendEvent()
	 * 
	 * Sends pinsetter events to all subscribers
	 * 
	 * @pre none
	 * @post all subscribers have recieved pinsetter event with updated state
	 */
	private void sendEvent(int jdpins) { // send events when our state is changd
		for (int i = 0; i < subscribers.size(); i++) {
			((PinsetterObserver) subscribers.get(i))
					.receivePinsetterEvent(new PinsetterEvent(pins, foul, throwNumber, jdpins));
		}
	}

	/**
	 * Pinsetter()
	 * 
	 * Constructs a new pinsetter
	 * 
	 * @pre none
	 * @post a new pinsetter is created
	 * @return Pinsetter object
	 */
	public Pinsetter() {
		pins = new boolean[10];
		rnd = new Random();
		subscribers = new Vector();
		foul = false;
		reset();
	}

	/**
	 * ballThrown()
	 * 
	 * Called to simulate a ball thrown comming in contact with the pinsetter
	 * 
	 * @pre none
	 * @post pins may have been knocked down and the thrownumber has been
	 *       incremented
	 */
	public void ballThrown() { // simulated event of ball hits sensor
		int count = 0;
		foul = false;
		double skill = rnd.nextDouble();
		for (int i = 0; i <= 9; i++) {
			if (pins[i]) {
				double pinluck = rnd.nextDouble();
				if (pinluck <= .04) {
					foul = true;
				}
				if (((skill + pinluck) / 2.0 * 1.2) > .5) {
					pins[i] = false;
				}
				if (!pins[i]) { // this pin just knocked down
					count++;
				}
			}
		}

		try {
			Thread.sleep(500); // pinsetter is where delay will be in a real game
		} catch (Exception e) {
		}

		sendEvent(count);

		throwNumber++;
	}

	/**
	 * reset()
	 * 
	 * Reset the pinsetter to its complete state
	 * 
	 * @pre none
	 * @post pinsetters state is reset
	 */
	public void reset() {
		foul = false;
		throwNumber = 1;
		resetPins();

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}

		sendEvent(-1);
	}

	/**
	 * resetPins()
	 * 
	 * Reset the pins on the pinsetter
	 * 
	 * @pre none
	 * @post pins array is reset to all pins up
	 */
	public void resetPins() {
		for (int i = 0; i <= 9; i++) {
			pins[i] = true;
		}
	}

	/**
	 * subscribe()
	 * 
	 * subscribe objects to send events to
	 * 
	 * @pre none
	 * @post the subscriber object will recieve events when their generated
	 */
	public void subscribe(PinsetterObserver subscriber) {
		subscribers.add(subscriber);
	}

};
