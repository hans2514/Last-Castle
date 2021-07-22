package hero;

public class Hero {
	String heroName ="heroNamePlaceHolder";
	String heroClass ="heroClassPlaceHolder";
	int heroATK = 0;
	int heroEXP = 0;
	
	
	public Hero(String heroName, String heroClass, int heroATK, int heroEXP) {
		super();
		this.heroName = heroName;
		this.heroClass = heroClass;
		this.heroATK = heroATK;
		this.heroEXP = heroEXP;
	}
	
	


	public String getHeroClass() {
		return heroClass;
	}

	public void setHeroClass(String heroClass) {
		this.heroClass = heroClass;
	}

	public String getHeroName() {
		return heroName;
	}


	public int getHeroATK() {
		return heroATK;
	}


	public int getHeroEXP() {
		return heroEXP;
	}


	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}


	public void setHeroATK(int heroATK) {
		this.heroATK = heroATK;
	}


	public void setHeroEXP(int heroEXP) {
		this.heroEXP = heroEXP;
	}
	
	
	
	
	
	

}
