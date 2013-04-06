package model;

import java.util.ArrayList;

public class Node {
	
	private String region;
	private GeographicLocation location;
	private ArrayList<Surplus> surpluses;
	private ArrayList<Lack> lacks;
	private ArrayList<ExpectedSurplus> expectedSurpluses;
	private ArrayList<Lack> expectedLacks;
}
