package com.xworkz.method;

import java.util.Arrays;

import com.xworkz.method.electronic.*;

public class MovieHubTester {

	public static void main(String[] args) {

		String[] movieName = { "KGF", "Chennai Express", "Dia" };
		MovieHub movieHub = new MovieHub("Navrang", 500, movieName);

		System.out.println("args 1 is:" + movieHub.getTheaterName());
		System.out.println("args 2 is:" + movieHub.getTotalTickets());
		System.out.println("args 3 is:" + movieHub.getMovieName());

		
String names=Arrays.toString(movieHub.getMovieName());
System.out.println(names);

movieHub.bookTicketAndGetTotalPrice("KGF",5,"Priyank");
movieHub.bookTicketAndGetTotalPrice("KGF",420,"Priyank");



	}

}
