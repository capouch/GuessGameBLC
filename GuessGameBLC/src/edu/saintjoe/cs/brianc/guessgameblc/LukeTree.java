package edu.saintjoe.cs.brianc.guessgameblc;

public class LukeTree {
	
	// Here are our data members
	// Store tree's height measured in feet
	private int height;
	
	// Store tree's age measured in parsecs
	public int age;
	

	public String species;
	
	public static void main(String[] args) {
		LukeTree treeOne;
		LukeTree treeTwo;
		
		treeOne = new LukeTree();
		treeTwo = new LukeTree();
		
		// Directly access the data member "height" of object referred to by "treeOne"
		treeOne.height = 14;
		
		// Invoke the method named "setHeight" on the object referred to by "treeTwo"
		treeTwo.setHeight(80);
		
		// Directly access the data member "species" of the objects referred to by "treeOne" and "treeTwo"
		treeTwo.species = "Elm";
		treeOne.species = "Oak";
		
		System.out.println("Tree treeOne height is " + treeOne.getHeight() + " TreeOne age is " + treeOne.age);
		System.out.println("Tree treeOne name is " + treeOne.species + " Treetwo name is " + treeTwo.species);
	}
	
	// Here are our methods
	public int getHeight () {
		return height;
	}
	
	public void setHeight(int newHeight) {
		height = newHeight;
	}
}
