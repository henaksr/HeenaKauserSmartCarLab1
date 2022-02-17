/**
 * 
 */
package edu.fiu.hkau.smartcar;

import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Heena Kauser
 *
 */
public class LEDController extends Component implements SelfCheckCapable{
	private String dimension;
	private String voltage;
	
	public void turnOnLED()
	{
		// On LED Lights
	}
	
	public void turnOffLED()
	{
		// Off LED Lights
	}
	
	public void colormode()
	{
		// switching color modes
		//Mode 0 : Rainbow
		//Mode 1 : flowing water LED with color changing
		//Mode 2 : color-adjustable Blink
		//Mode 3 : displays the selected color of the current color picker for all LEDs.

	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "LED Controller";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}
}
