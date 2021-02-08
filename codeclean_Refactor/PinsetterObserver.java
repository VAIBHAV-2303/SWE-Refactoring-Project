/* $Id$
 *
 *   Revision 1.1  2003/01/19 21:04:24  ???
 *   created pinsetterevent and pinsetterobserver
 *
 *
 */

public interface PinsetterObserver {

	/**
	 * recievePinsetterEvent()
	 * 
	 * defines the method for an object torecieve a pinsetter event
	 */
	void receivePinsetterEvent(PinsetterEvent pe);
};
