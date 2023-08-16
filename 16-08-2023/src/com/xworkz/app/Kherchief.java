package com.xworkz.app;

public class Kherchief {
	
	private String material;
	private char size;
	private String color;
	private boolean edgesSharp;
	private boolean mask;
	private String shape;
	private boolean kherchief;
	
	
	public Kherchief() {
		super();
		System.out.println("Invoking no-arg const in Kherchief");
	}


	public Kherchief(String material, char size, String color, boolean edgesSharp) {
		super();
		this.material = material;
		this.size = size;
		this.color = color;
		this.edgesSharp = edgesSharp;
	}


	public Kherchief(String material, char size, String color, boolean edgesSharp, boolean mask, String shape,
			boolean kherchief) {
		super();
		this.material = material;
		this.size = size;
		this.color = color;
		this.edgesSharp = edgesSharp;
		this.mask = mask;
		this.shape = shape;
		this.kherchief = kherchief;
	}


	@Override
	public String toString() {
		return "Kherchief [material=" + material + ", size=" + size + ", color=" + color + ", edgesSharp=" + edgesSharp
				+ ", mask=" + mask + ", shape=" + shape + ", kherchief=" + kherchief + "]";
	}
	
	
	

}
