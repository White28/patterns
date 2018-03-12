package com.white.structural.facade;

import java.io.File;

/**
 * @author Dmytro Bilyi
 *
 * @date Mar 12, 2018
 * 
 */
public class AudioMixer {

	public static File fix(VideoFile result) {
		System.out.println("AudioMixer: fixing audio...");
		return new File("tmp");
	}
}
