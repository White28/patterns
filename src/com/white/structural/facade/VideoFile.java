package com.white.structural.facade;

/**
 * @author Dmytro Bilyi
 *
 * @date Mar 12, 2018
 * 
 */
public class VideoFile {

	private String name;
	private String codecType;

	public VideoFile(String name) {
		this.name = name;
		this.codecType = name.substring(name.indexOf(".") + 1, name.length());
	}

	public String getCodecType() {
		return codecType;
	}

	public String getName() {
		return name;
	}
}
