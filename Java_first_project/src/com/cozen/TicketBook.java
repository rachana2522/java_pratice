package com.cozen;

public class TicketBook {

	
	int tot_seat = 10;
	synchronized void bookSeat(int seats) {
		if (tot_seat >= seats ) {
			System.out.println("seats Booked Successfully");
			tot_seat = tot_seat - seats;
			System.out.println("seat Available" + tot_seat);
		}
		else {
			System.out.println("No Seats Available");
			System.out.println("seat Available" + tot_seat);
		}
	}
}
