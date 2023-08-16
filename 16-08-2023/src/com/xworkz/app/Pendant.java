package com.xworkz.app;

public class Pendant {
	
	 private String material;
	    private String design;
	    private String color;
	    private boolean hasGemstone;
	    private String chainType;
	    private double length;
	    private double width;
	    private double weight;
	    private double price;
	    private boolean customizable;
	    private String culturalSignificance;
	    private String wearability;

	    public Pendant() {
			super();
			System.out.println("Invoking no-arg const in Pendant");
		}
	    
	    public Pendant(String material, String design, String color) {
			super();
			this.material = material;
			this.design = design;
			this.color = color;
		}

		public Pendant(String material, String design, String color, boolean hasGemstone,
	                   String chainType, double length, double width, double weight,
	                   double price, boolean customizable, String culturalSignificance, String wearability) {
	        this.material = material;
	        this.design = design;
	        this.color = color;
	        this.hasGemstone = hasGemstone;
	        this.chainType = chainType;
	        this.length = length;
	        this.width = width;
	        this.weight = weight;
	        this.price = price;
	        this.customizable = customizable;
	        this.culturalSignificance = culturalSignificance;
	        this.wearability = wearability;
	    }

		@Override
		public String toString() {
			return "Pendant [material=" + material + ", design=" + design + ", color=" + color + ", hasGemstone="
					+ hasGemstone + ", chainType=" + chainType + ", length=" + length + ", width=" + width + ", weight="
					+ weight + ", price=" + price + ", customizable=" + customizable + ", culturalSignificance="
					+ culturalSignificance + ", wearability=" + wearability + "]";
		}

	

}
