package castle;

public class CastleStone extends Castle{

	public CastleStone(String castleName, int castleHP, int infantryArmyAtk, int cavalryArmyAtk, int archerArmyAtk,
			int catapultArmyAtk) {
		super(castleName, castleHP, infantryArmyAtk, cavalryArmyAtk, archerArmyAtk, catapultArmyAtk);
		// TODO Auto-generated constructor stub
	}

	public static void boostSkill(){
		catapultArmyAtk +=20;
	}
}
