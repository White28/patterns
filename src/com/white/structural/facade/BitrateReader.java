package com.white.structural.facade;

/**
 * @author Dmytro Bilyi
 *
 * @date Mar 12, 2018
 * 
 */
public class BitrateReader {

	public static VideoFile read(VideoFile file, Codec codec) {
		System.out.println("BitrateReader: reading file...");
		return file;
	}

	public static VideoFile convert(VideoFile buffer, Codec codec) {
		System.out.println("BitrateReader: writing file...");
		return buffer;
	}
}
