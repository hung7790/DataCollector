package com.nexify.collector;

import java.util.List;

public class form {
	
	BasicInformation information;
	List<Section> sections;
	
	
	class BasicInformation{
		String number;
		String date;
		String place;
		String shipName;
		String shipID;
		String receipt;
	}
	
	class Section{
		String number;
 		List<Item> items;
 		
		
		class Item{
			String number;
			String name;
			String remarks;
			ItemType type;			
			String value;
		}		
	}	
		
	
	enum ItemType {
	    Checkbox("checkbox", 0),
	    FreeText("freetext", 1);

	    private String stringValue;
	    private int intValue;
	    private ItemType(String toString, int value) {
	        stringValue = toString;
	        intValue = value;
	    }

	    @Override
	    public String toString() {
	        return stringValue;
	    }
	}
	
}
