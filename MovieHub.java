package com.xworkz.method.electronic;

public class MovieHub {

	private String theaterName;
	private int totalTickets;
	private String[] movieName;

	public MovieHub(String theaterName, int totalTickets, String[] movieName) {
		System.out.println("created and init MovieHub *********************");
		System.out.println("args 1 :" + theaterName);
		System.out.println("args 2 :" + totalTickets);
		System.out.println("args 3 :" + movieName);

		this.theaterName = theaterName;
		this.totalTickets = totalTickets;
		this.movieName = movieName;

		System.out.println("Ceated and init Movies compelted");
	}

	public double bookTicketAndGetTotalPrice(String moviesName, int noOfTickets, String bookedBy) {
		double totalPrice= 0;
		System.out.println();
		for(int t=0;t<movieName.length;t++) {
			String movie=movieName[t];
			if(movieName.equals(movie)) {
				System.out.println("movie found,can book ticket");
				break;
			}
			else {
				System.out.println("movie not found");
			}
		}
		if(noOfTickets<=totalTickets) {
			System.out.println("total tickets available "+totalTickets);
			totalTickets=totalTickets-noOfTickets;
			System.out.println("remaining tickets are: "+totalTickets);
			
		}
		else {
			System.out.println("there are no tickets");
		}
		return totalPrice;
	}

		
	

	public String getTheaterName() {
		return theaterName;
	}

	public int getTotalTickets() {
		return totalTickets;
	}

	public String[] getMovieName() {
		return movieName;
	}

}
