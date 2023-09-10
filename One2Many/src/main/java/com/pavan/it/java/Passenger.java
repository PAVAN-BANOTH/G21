package com.pavan.it.java;

import java.util.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Passenger{
	private String firstName;
	private String lastName;
	private String ticketNumber;
	private String ticketClass;
	private Double ticketFair;
	public Passenger(String firstName, String lastName, String ticketNumber, String ticketClass,Double ticketFair) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.ticketNumber = ticketNumber;
		this.ticketClass = ticketClass;
		this.ticketFair =  ticketFair;
	}
	public Double getTicketFair() {
		return ticketFair;
	}
	public void setTicketFair(Double ticketFair) {
		this.ticketFair = ticketFair;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getTicketClass() {
		return ticketClass;
	}
	public void setTicketClass(String ticketClass) {
		this.ticketClass = ticketClass;
	}
	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", ticketNumber=" + ticketNumber
				+ ", ticketClass=" + ticketClass + ", ticketFair=" + ticketFair + "]";
	}
	public static void main(String[] args) {
		// Define a list of Passenger objects representing the ticket booking table
		List<Passenger> ticketBookingTable = new ArrayList<>();
		ticketBookingTable.add(new Passenger("John", "Doe","A1234", "Economy",200.00));
		ticketBookingTable.add(new Passenger("Alice", "Smith","B5678", "Business",125.00));
		ticketBookingTable.add(new Passenger("Bob", "Johnson","C9012", "Economy",480.00));
		ticketBookingTable.add(new Passenger("Emily","Williams", "D3456", "Economy",1000.00));
		ticketBookingTable.add(new Passenger("Michael","Davis", "E7890", "First Class",345.00));
		Double sumOfSalaries = ticketBookingTable.stream().mapToDouble(Passenger::getTicketFair).sum();
		System.out.println("sumOfSalaries..."+sumOfSalaries);
		
		Double avgOfSalaries = ticketBookingTable.stream().mapToDouble(Passenger::getTicketFair).average().orElse(0);
		System.out.println("avgOfSalaries..."+avgOfSalaries);
		
		//long min = ticketBookingTable.stream().min(Comparator.comparingDouble(Passenger::getTicketFair));
		//System.out.println("min salary..."+min);
		// Filter passengers with economy class tickets
		List<Passenger> economyPassengers =ticketBookingTable.stream().filter(passenger ->
		passenger.getTicketClass().equals("Economy"))
		.collect(Collectors.toList());
		System.out.println("Economy Class Passengers:");
		economyPassengers.forEach(System.out::println);
		// Sort passengers by last name in ascending order
		List<Passenger> sortByLastName = ticketBookingTable.stream().sorted(Comparator.comparing(Passenger::getLastName))
		.collect(Collectors.toList());
		System.out.println("Sortpassengersbylastname"+sortByLastName);
		
		// Calculate the total number of passengers
		long totalPassengers = ticketBookingTable.stream()
		.count();
		System.out.println("Total Number of Passengers: " +
		totalPassengers);
		// Group passengers by ticket class
		Map<String, List<Passenger>> passengersByClass =
		ticketBookingTable.stream()
		.collect(Collectors.groupingBy(Passenger::getTicketClass));
		System.out.println("Passengers Grouped by Ticket Class:"+passengersByClass);
		// Calculate the total number of passengers in each ticket class
		Map<String, Long> passengerCountByClass =
		ticketBookingTable.stream()
		.collect(Collectors.groupingBy(Passenger::getTicketClass,
		Collectors.counting()));
		System.out.println("Passenger Count by TicketClass:"+passengerCountByClass);
		
				// Calculate the total number of passengers in eachticket class
				Map<String, Long> passengerCountByClass1 =ticketBookingTable.stream()
				.collect(Collectors.groupingBy(Passenger::getTicketClass,
				Collectors.counting()));
				System.out.println("Passenger Count by TicketClass:");
				passengerCountByClass.forEach((ticketClass, count) ->
				System.out.println(ticketClass + ": " +count));
				List<Passenger> sortby = ticketBookingTable.stream().sorted(Comparator.comparing(Passenger::getLastName).reversed()).collect(Collectors.toList());
				System.out.println("Comparator Mechanism..."+sortby);
				
	}
}