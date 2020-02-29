package com.youtubechannel;

public class Subscriber implements Observer {

	private String name;
	private boolean isNotify=false;
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isNotify() {
		return isNotify;
	}

	public void setNotify(boolean isNotify) {
		this.isNotify = isNotify;
	}


	@Override
	public void notify(Video video) {
		System.out.println(this);
		System.out.println(video);
	}

	@Override
	public boolean isSubscribed() {
		return isNotify;
	}

	@Override
	public String toString() {
		return "Subscriber: "+name;
	}

}
