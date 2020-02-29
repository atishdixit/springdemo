package com.youtubechannel;

public interface Subject {
	void notifySubscribers();
	void addSubscriber(Observer subscriber);
	void removeSubscriber(Observer subscriber);
}
