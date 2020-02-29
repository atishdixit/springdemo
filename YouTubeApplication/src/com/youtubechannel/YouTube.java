package com.youtubechannel;

public class YouTube {

	public static void main(String[] args) {
		Channel c1 =  new Channel("Time & Taste");
		
		Subscriber s1 = new Subscriber("Sandeep");
		Subscriber s2 = new Subscriber("Atish");
		Subscriber s3 = new Subscriber("Pulkit");
		Subscriber s4 = new Subscriber("Abodh");
		Subscriber s5 = new Subscriber("Ajay");
		s5.setNotify(true);
		
		c1.addSubscriber(s1);
		c1.addSubscriber(s2);
		c1.addSubscriber(s3);
		c1.addSubscriber(s4);
		c1.addSubscriber(s5);
		
		Video video = new Video("Lemon Juice", "Rohit", "Ingredients");
		c1.addVideo(video);
		c1.notifySubscribers();
		
	}

}
