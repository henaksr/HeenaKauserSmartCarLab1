/**
 * 
 */
package edu.fiu.hkau.smartcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.fiu.jit.GenericComponent;
import edu.fiu.jit.SelfCheckCapable;

/**
 * @author Heena Kauser
 *
 */
public class SmartCar implements GenericComponent {
	
	private String name;
	private String color;
	private String model;
	private String dimensions;
	private String manufacturer;
	private double price;
	private AudioBuzzer myAudioBuzzer;
	private LEDController myLEDController;

	public SmartCar() {
		myAudioBuzzer = new AudioBuzzer();
		myLEDController = new LEDController();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am a SmartCar..");

	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Freenove Smart Car";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<SelfCheckCapable> getSubComponents() {
		List internalComponents = new ArrayList(); // create an empty list
		Collections.addAll(internalComponents, myAudioBuzzer, myLEDController); // add all your sub components
		return internalComponents;
	}

}
