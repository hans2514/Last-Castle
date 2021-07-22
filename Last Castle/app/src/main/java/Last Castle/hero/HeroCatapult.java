package hero;

import castle.Castle;

public class HeroCatapult extends Hero{
	private static Castle kastil1= new Castle("kastil1", 10000, 110, 120, 130, 140);

	public HeroCatapult(String heroName, String heroClass, int heroATK, int heroEXP) {
		super(heroName, heroClass, heroATK, heroEXP);
		// TODO Auto-generated constructor stub
	}
	
	public void buffattack(){
		int baseATKArcher = kastil1.getArcherArmyAtk();
		kastil1.setCatapultArmyAtk(baseATKArcher+40);
	}	

}
