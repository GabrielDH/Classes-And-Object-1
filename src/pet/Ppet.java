package pet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Ppet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		boolean validPrompt=false;
		Scanner userInput = new Scanner(System.in);
		while (validPrompt==false) {
			System.out.println("1 for pet.java - 2 for car.java");
			String stringProgram=userInput.nextLine().toUpperCase();
			int programID=Integer.parseInt(stringProgram);			
			if ((programID==1) || (programID==2)) {
				validPrompt=true;
			}
			else {
				System.out.println("Please insert 1 or  2 ");
			}
			
			
			if (programID==1) {
				System.out.println("Insert name of pet");
				String namePet=userInput.nextLine();
				System.out.println("Insert age of pet");
				String stringAgePet=userInput.nextLine();
				int agePet=Integer.parseInt(stringAgePet);
				System.out.println("Insert location of pet");
				String locationPet=userInput.nextLine();
				System.out.println("Insert breed of pet");
				String breedPet=userInput.nextLine();
				pet newpet= new pet(namePet,agePet,locationPet,breedPet);
				System.out.println(newpet.getName()+" is a beautiful "+newpet.getType()+" with "+newpet.getAge()+" years old, located at "+newpet.getLocation());
				System.out.println("Please change the name");
				newpet.setName(userInput.nextLine());
				System.out.println("After changes "+newpet.getName()+" is a beautiful "+newpet.getType()+" with "+newpet.getAge()+" years old, located at "+newpet.getLocation());
			}
			if (programID==2) {
				System.out.println("Creating first car");
				System.out.println("Insert make of car");
				String makeCar=userInput.nextLine();
				System.out.println("Insert year of car");
				String stringAgeCar=userInput.nextLine();
				int ageCar=Integer.parseInt(stringAgeCar);
				System.out.println("Insert model of car");
				String modelCar=userInput.nextLine();
				car car1=new car(modelCar,makeCar,ageCar);
				
				System.out.println("Creating second car");
				System.out.println("Insert make of car");
				makeCar=userInput.nextLine();
				System.out.println("Insert year of car");
				stringAgeCar=userInput.nextLine();
				ageCar=Integer.parseInt(stringAgeCar);
				System.out.println("Insert model of car");
				modelCar=userInput.nextLine();
				car car2=new car(modelCar,makeCar,ageCar);
				
				System.out.println("Insert model of car to search");
				String modelCarToSearch=userInput.nextLine();
				modelCarToSearch=userInput.nextLine();
				if (carExist(car1,car2,modelCarToSearch)){
					System.out.println("Car Exist "+carExist(car1,car2,modelCarToSearch)+ "This is the make"+carMake(car1,car2,modelCarToSearch));
				}else {
					System.out.println(carExist(car1,car2,modelCarToSearch));
				}
				
								
				
			}
		}		
	}
	
	static boolean carExist(car car1,car car2,String modelToSearch) {
		if (car1.getModel().equals(modelToSearch)) {
			return(true);
		}else if (car2.getModel().equals(modelToSearch)) {
			return(true);
		}
		return(false);
	}
	
	static String carMake(car car1,car car2,String modelToSearch) {
		if (car1.getModel().equals(modelToSearch)) {
			return(car1.getMake());
		}else {
			return(car2.getMake());
		}
	}

	
}
