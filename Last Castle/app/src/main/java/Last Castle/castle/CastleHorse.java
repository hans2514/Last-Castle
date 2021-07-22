package castle;

public class CastleHorse extends Castle{

	
	public CastleHorse(String castleName, int castleHP, int infantryArmyAtk, int cavalryArmyAtk, int archerArmyAtk,
			int catapultArmyAtk) {
		super(castleName, castleHP, infantryArmyAtk, cavalryArmyAtk, archerArmyAtk, catapultArmyAtk);
		// TODO Auto-generated constructor stub
	}
	
	

	public static void boostSkill(){
		cavalryArmyAtk +=20;
	}
	


}
