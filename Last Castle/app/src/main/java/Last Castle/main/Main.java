package main;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import castle.Castle;
import castle.CastleHorse;
import castle.CastleSteel;
import castle.CastleStone;
import castle.CastleWood;
import hero.Hero;
import hero.HeroArcher;
import hero.HeroCatapult;
import hero.HeroCavalry;
import hero.HeroInfantry;

public class Main {
	Scanner scan = new Scanner(System.in);
	Vector<Castle> vectorOfCastle= new Vector<Castle>();
	Vector<Hero> vectorOfHero = new Vector<Hero>();
	Random ran = new Random();
	
	
		
	public Main(){
		vectorOfHero.add(new HeroArcher("Sage", "Archer", 239, 0));
		vectorOfHero.add(new HeroInfantry("Azeroth", "Infantry", 293, 0));
		vectorOfCastle.add(new CastleHorse("Castle Horse", 5000, 110, 120, 30, 140));
		vectorOfCastle.add(new CastleSteel("Castle Steel", 5000, 110, 120, 130, 140));
		vectorOfCastle.add(new CastleStone("Castle Stone", 5000, 110, 120, 130, 140));
		vectorOfCastle.add(new CastleWood("Castle Wood", 5000, 110, 120, 130, 140));
		
		int menu;
		do {
			System.out.println("===================");
			System.out.println("Last Castle");
			System.out.println("===================");
			menu = getChosenMenu();
			switch (menu) {
			case 1:
				createHero();
				break;
			case 2:
				play();
				break;
			case 3:
				exit();
				break;
			}
		} while (menu != 4);			
	}
	
	public int getChosenMenu() {
		int choose = 0;
		System.out.println("1. Create Hero");
		System.out.println("2. Play");
		System.out.println("3. Exit");
		choose = scan.nextInt();
		scan.nextLine();
		return choose;
	}
	
	public void createHero(){
		String inputName, inputClass;
		int inputATK, inputEXP;
		
		System.out.println("Input Hero Name: ");
		inputName = scan.nextLine();
		inputATK = ran.nextInt(300 - 100) + 100;
		inputEXP = 0;
		
		System.out.println("Insert Hero Class [Infantry/Cavalry/Archer/Catapult]: ");
		inputClass = scan.nextLine();
		if (inputClass.equals("Infantry")) {
			vectorOfHero.add(new HeroInfantry(inputName, inputClass, inputATK, inputEXP));
		}
		else if (inputClass.equals("Cavalry")) {
			vectorOfHero.add(new HeroCavalry(inputName, inputClass, inputATK, inputEXP));
		}
		else if (inputClass.equals("Archer")) {
			vectorOfHero.add(new HeroArcher(inputName, inputClass, inputATK, inputEXP));
		}
		else if (inputClass.equals("Catapult")) {
			vectorOfHero.add(new HeroCatapult(inputName, inputClass, inputATK, inputEXP));
		}
		
		else{
			System.out.println("Wrong Class! [Case Sensitive]");
		}
		
		
		
	}
	
	public void play(){
		int i = 1;
		int z = 1;
		int selectedHero;
		int selectedCastle;
		int selectedHeroPlayer2;
		int selectedCastlePlayer2;
		
		
		if (vectorOfHero.isEmpty()) {
			System.out.println("No Soldier Hero");
		} else {
			System.out.println("No || Hero Name || Hero Attack Damage ||");
			for (Hero b : vectorOfHero) {
				System.out.println(i + ". " + b.getHeroName() + "||" + b.getHeroClass() + "||"+ b.getHeroATK() + "||");
				i++;
				}
			
			System.out.println("No || Castle Skin || Castle HP || Infantry Army Attack || Cavalry Army Attack || Archery Army Atacck || Catapult Army Atacck ||");	
			for (Castle c : vectorOfCastle) {
					System.out.println(z + ". " + c.getCastleName() + "||" + c.getCastleHP() + "||" + c.getInfantryArmyAtk() + "||"  + c.getCavalryArmyAtk() + "||" + c.getArcherArmyAtk()+ "||" + c.getCatapultArmyAtk() + "||" );
					z++;	
			}
			
			do {
				System.out.println("Player 1 Select Your Castle [1-" + vectorOfCastle.size() + "] :");
				selectedCastle = scan.nextInt();
				scan.nextLine();
			} while (selectedCastle < 1 || selectedCastle > vectorOfCastle.size());
			System.out.println("Player 1 Selected " + vectorOfCastle.get(selectedCastle-1).getCastleName());
			
	
			if (selectedCastle==1) {
				System.out.println("Castle Horse Boost Actived!");
				castle.CastleHorse.boostSkill();
			}
			else if (selectedCastle==2) {
				System.out.println("Castle Steel Boost Actived!");
				castle.CastleSteel.boostSkill();
			}
			else if (selectedCastle==3) {
				System.out.println("Castle Stone Boost Actived!");
				castle.CastleStone.boostSkill();
			}
			else if (selectedCastle==4) {
				System.out.println("Castle Wood Boost Actived!");
				castle.CastleWood.boostSkill();
			}
			else {
				System.out.println("Wrong Castle [Case Sensitive]!");
			}
			
			do {
				System.out.println("Player 1 Select Your Hero [1-" + vectorOfHero.size() + "] :");
				selectedHero = scan.nextInt();
				scan.nextLine();
			} while (selectedHero < 1 || selectedHero > vectorOfHero.size());
			System.out.println("Player 1 Selected " + vectorOfHero.get(selectedHero-1).getHeroName());
			
			System.out.println("Player 2: Select Your Castle! [1-" + vectorOfCastle.size() + "] :");
			selectedCastlePlayer2 = scan.nextInt();
			scan.nextLine();
			if (selectedCastlePlayer2 ==1) {
				System.out.println("Player 1 Selected Castle Horse!");
				castle.CastleHorse.boostSkill();
			}
			else if (selectedCastlePlayer2 ==2) {
				System.out.println("Player 1 Selected Castle Horse!");
				castle.CastleSteel.boostSkill();
			}
			else if (selectedCastlePlayer2 ==3) {
				System.out.println("Player 1 Selected Castle Horse!");
				castle.CastleStone.boostSkill();
			}
			else if (selectedCastlePlayer2 ==4) {
				System.out.println("Player 1 Selected Castle Horse!");
				castle.CastleWood.boostSkill();
			}
			else {
				System.out.println("Wrong Castle [Case Sensitive]!");
			}
			
			do {
				System.out.println("Player 2 Select Your Hero [1-" + vectorOfHero.size() + "] :");
				selectedHeroPlayer2 = scan.nextInt();
				scan.nextLine();
			} while (selectedHeroPlayer2 < 1 || selectedHeroPlayer2 > vectorOfHero.size());
			
			System.out.println("Status");
			System.out.println("==========================================================================");
			System.out.println("Player 1: ");
			System.out.println(vectorOfCastle.get(selectedCastle).getCastleName());
			System.out.println("Hero " +vectorOfHero.get(selectedHero).getHeroName());
			System.out.println("Hero " +vectorOfHero.get(selectedHero).getHeroClass());
			System.out.println("Hero ATK: " +vectorOfHero.get(selectedHero).getHeroATK());
			System.out.println(" Infantry ATK: " +vectorOfCastle.get(selectedCastle).getInfantryArmyAtk());
			System.out.println(" Cavalry ATK: " +vectorOfCastle.get(selectedCastle).getCavalryArmyAtk());
			System.out.println(" Archer ATK: " +vectorOfCastle.get(selectedCastle).getArcherArmyAtk());
			System.out.println(" Catapult ATK: " +vectorOfCastle.get(selectedCastle).getCatapultArmyAtk());
	
			System.out.println("Player 2: ");
			System.out.println(vectorOfCastle.get(selectedCastlePlayer2).getCastleName());
			System.out.println("Hero " +vectorOfHero.get(selectedHeroPlayer2).getHeroName());
			System.out.println("Hero " +vectorOfHero.get(selectedHero).getHeroClass());
			System.out.println("Hero ATK: " +vectorOfHero.get(selectedHero).getHeroATK());
			System.out.println(" Infantry ATK: " +vectorOfCastle.get(selectedCastlePlayer2).getInfantryArmyAtk());
			System.out.println(" Cavalry ATK: " +vectorOfCastle.get(selectedCastlePlayer2).getCavalryArmyAtk());
			System.out.println(" Archer ATK: " +vectorOfCastle.get(selectedCastlePlayer2).getArcherArmyAtk());
			System.out.println(" Catapult ATK: " +vectorOfCastle.get(selectedCastlePlayer2).getCatapultArmyAtk());
		}
	}	

	
	
	public void exit(){
		System.out.println("Good Game! Have a Nice Day!");
	}
	
	
	public static void main(String[] args) {
		new Main();

	}

}
