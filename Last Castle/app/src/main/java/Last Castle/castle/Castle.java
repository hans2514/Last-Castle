package castle;

public class Castle {
	String castleName = "CastleNameholder";
	static int castleHP;
	static int infantryArmyAtk;
	static int cavalryArmyAtk;
	static int archerArmyAtk;
	static int catapultArmyAtk;
	
	public Castle(String castleName, int castleHP, int infantryArmyAtk, int cavalryArmyAtk, int archerArmyAtk,
			int catapultArmyAtk) {
		super();
		this.castleName = castleName;
		Castle.castleHP = castleHP;
		Castle.infantryArmyAtk = infantryArmyAtk;
		Castle.cavalryArmyAtk = cavalryArmyAtk;
		Castle.archerArmyAtk = archerArmyAtk;
		Castle.catapultArmyAtk = catapultArmyAtk;
	}

	public String getCastleName() {
		return castleName;
	}

	public int getCastleHP() {
		return castleHP;
	}

	public int getInfantryArmyAtk() {
		return infantryArmyAtk;
	}

	public int getCavalryArmyAtk() {
		return cavalryArmyAtk;
	}

	public int getArcherArmyAtk() {
		return archerArmyAtk;
	}

	public int getCatapultArmyAtk() {
		return catapultArmyAtk;
	}

	public void setCastleName(String castleName) {
		this.castleName = castleName;
	}

	public void setCastleHP(int castleHP) {
		Castle.castleHP = castleHP;
	}

	public void setInfantryArmyAtk(int infantryArmyAtk) {
		Castle.infantryArmyAtk = infantryArmyAtk;
	}

	public void setCavalryArmyAtk(int cavalryArmyAtk) {
		Castle.cavalryArmyAtk = cavalryArmyAtk;
	}

	public void setArcherArmyAtk(int archerArmyAtk) {
		Castle.archerArmyAtk = archerArmyAtk;
	}

	public void setCatapultArmyAtk(int catapultArmyAtk) {
		Castle.catapultArmyAtk = catapultArmyAtk;
	}

	
}
