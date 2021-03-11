package com.xworkz.exceptionEvent;

public class EventCreater {
	public EventCreater() {
		System.out.println("creating EventCreater");
	}
	//Throwable throwable= new Throwable();
	public void createEvent(boolean create) throws Throwable {
		if (create) {
			System.out.println("created event");
			Throwable throwable= new Throwable();
			throw throwable;
		} else {
			System.out.println("event not created");
		}
	}

	public void frame1() throws Throwable {
		System.out.println("frame1");
		this.frame2();
	}

	public void frame2() throws Throwable {
		System.out.println("frame2");
		this.frame3();
	}

	public void frame3() throws Throwable {
		System.out.println("frame3");
		this.frame4();
	}

	public void frame4() throws Throwable  {
		System.out.println("frame4");
		this.frame5();
	}

	public void frame5() throws Throwable {
		System.out.println("frame5");
		this.frame6();
	}
	public void frame6() throws Throwable {
		System.out.println("frrame6");
		this.createEvent(true);
	}
}
