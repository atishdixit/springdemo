package com.youtubechannel;

public interface Observer {
	void notify(Video video);
	boolean isSubscribed();
}
