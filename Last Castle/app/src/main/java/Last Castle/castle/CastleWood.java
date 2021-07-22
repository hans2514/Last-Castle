package castle;

public class CastleWood extends Castle{

	public CastleWood(String castleName, int castleHP, int infantryArmyAtk, int cavalryArmyAtk, int archerArmyAtk,
			int catapultArmyAtk) {
		super(castleName, castleHP, infantryArmyAtk, cavalryArmyAtk, archerArmyAtk, catapultArmyAtk);
		// TODO Auto-generated constructor stub
	}

	public static void boostSkill(){
		archerArmyAtk +=20;
	}
}
