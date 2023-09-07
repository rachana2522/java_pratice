package com.cozen;


public class TicketManage  extends Thread{
	static TicketBook tb;
	int seat;
	
	@Override
	public void run() {
		tb.bookSeat(seat);
		
	}

	public static void main(String[] args) {
		
		tb=new TicketBook();
		TicketManage ayush=new TicketManage();
		ayush.seat=7;
		ayush.start();
		TicketManage rachana=new TicketManage();
		rachana.seat=3;
		rachana.start();
		
	}


}
