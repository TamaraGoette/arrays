package arrays;

public class App {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		
		cat1.name = "Charles";
		cat1.age = 2;
		cat1.breed = "British Shorthair";
		cat1.color = "grey";
		
		Cat cat2 = new Cat();

		cat2.name = "Lilly";
		cat2.age = 5;
		cat2.breed = "unknown";
		cat2.color = "white";
		
		
		
	Cat[] cats = { cat1, cat2 };
	
	for (int i = 0; i < cats.length; i++) {
		
		System.out.println(cats[i].name); 
		
	}
	
     StrUtils	su = new StrUtils();
	
     Plants plant1 = new Plants();
	
	 plant1.botanicalName = "Achillea millefolium";
	 plant1.germanName = "Schafgarbe";
	
	 Plants plant2 = new Plants();
		
     plant2.botanicalName = "Acmella oleracea";
	 plant2.germanName = "Husarenknopf";
	
	 Plants plant3 = new Plants();
		
     plant3.botanicalName = "Aconitum napellus";
	 plant3.germanName = "Eisenhut, Blauer";
		
	 Plants plant4 = new Plants();
			
	 plant4.botanicalName = "Aconitum vulparia";
	 plant4.germanName = "Eisenhut, Gelber";
		 
	 Plants plant5 = new Plants();
			
	 plant5.botanicalName = "Acorus calamus";
	 plant5.germanName = "Kalmus";

	 
	 Plants [] allplants = {plant1, plant2, plant3, plant4, plant5};
	 
	 
	 
	 for (int i = 0; i < allplants.length; i++) {
		 
		 String s = allplants[i].botanicalName;
		 
		 int count = su.countChars(s);
		 
		 System.out.println(count);
		 
	 }

  }
}