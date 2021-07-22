package castle;

public class CastleSteel extends Castle{

	public CastleSteel(String castleName, int castleHP, int infantryArmyAtk, int cavalryArmyAtk, int archerArmyAtk,
			int catapultArmyAtk) {
		super(castleName, castleHP, infantryArmyAtk, cavalryArmyAtk, archerArmyAtk, catapultArmyAtk);
		// TODO Auto-generated constructor stub
	}

	public static void boostSkill(){
		infantryArmyAtk +=20;
	}
}
