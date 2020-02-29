package com.youtubechannel;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	private String channelName;
	private List<Video> videoList;
	private List<Observer> subscriberList;
		
	public Channel(String channelName) {
		super();
		this.channelName = channelName;
		this.subscriberList = new ArrayList<>();
		this.videoList = new ArrayList<>();
	}

	@Override
	public void notifySubscribers() {
		this.subscriberList
		.stream()
		.filter(subscriber->subscriber
				.isSubscribed())
		.forEach(	subscriber->subscriber
				.notify(this.latestVideo()));
	}

	@Override
	public void addSubscriber(Observer subscriber) {
		this.subscriberList.add(subscriber);
		System.out.println(subscriber+" is added to channel");
	}

	@Override
	public void removeSubscriber(Observer subscriber) {
		this.subscriberList.remove(subscriber);
		System.out.println(subscriber+" is removed from channel");
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public List<Observer> getSubscriberList() {
		return subscriberList;
	}

	public void setSubscriberList(List<Observer> subscriberList) {
		this.subscriberList = subscriberList;
	}	
	
	public void addVideo(Video video) {
		this.videoList.add(video);
	}
	
	public void removeVideo(Video video) {
		this.videoList.remove(video);
	}
	
	public Video latestVideo() {
		return this.videoList.get(videoList.size()-1);
	}
}

