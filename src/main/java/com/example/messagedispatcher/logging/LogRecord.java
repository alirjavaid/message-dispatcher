package com.example.messagedispatcher.logging;

public class LogRecord {
	
	public LogRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public LogRecord(long startTime) {
		super();
		this.startTime = startTime;
	}

	private long startTime;

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	
	

}
