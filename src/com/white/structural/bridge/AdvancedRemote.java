package com.white.structural.bridge;

/**
 * @author Dmytro Bilyi
 *
 * @date Mar 22, 2018
 * 
 */
public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(Device device) {
		super.device = device;
	}

	public void mute() {
		System.out.println("Remote: mute");
		device.setVolume(0);
	}
}
