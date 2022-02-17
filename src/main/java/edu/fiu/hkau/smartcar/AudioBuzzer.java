/**
 * 
 */
package edu.fiu.hkau.smartcar;

import edu.fiu.jit.SelfCheckCapable;
import edu.fiu.jit.SelfCheckUtils;

/**
 * @author Heena Kauser
 *
 */
public class AudioBuzzer extends Component implements SelfCheckCapable{
	private String voltage;
	
	public void emitSound()
	{
		// Emits car sound
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Buzzer";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.3);
	}
}
