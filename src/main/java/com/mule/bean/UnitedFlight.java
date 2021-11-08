package com.mule.bean;

public class UnitedFlight {

	    private String code;
	    private double price;
	    private String origin;
	    private String destination;
	    private String departureDate;
	    private String planeType;
	    private String airlineName;
	    private long emptySeats;

	    public String getCode() { return code; }
	    public void setCode(String value) { this.code = value; }

	    public double getPrice() { return price; }
	    public void setPrice(double value) { this.price = value; }

	    public String getOrigin() { return origin; }
	    public void setOrigin(String value) { this.origin = value; }

	    public String getDestination() { return destination; }
	    public void setDestination(String value) { this.destination = value; }

	    public String getDepartureDate() { return departureDate; }
	    public void setDepartureDate(String value) { this.departureDate = value; }

	    public String getPlaneType() { return planeType; }
	    public void setPlaneType(String value) { this.planeType = value; }

	    public String getAirlineName() { return airlineName; }
	    public void setAirlineName(String value) { this.airlineName = value; }

	    public long getEmptySeats() { return emptySeats; }
	    public void setEmptySeats(long value) { this.emptySeats = value; }
	}

