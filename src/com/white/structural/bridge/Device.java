package com.white.structural.bridge;

/**
 * @author Dmytro Bilyi
 *
 * @date Mar 22, 2018
 * 
 */
public interface Device {

	public boolean isEnabled();

	public void enable();

	public void disable();

	public int getVolume();

	public void setVolume(int percent);

	public int getChannel();

	public void setChannel(int channel);

	public void printStatus();
}
