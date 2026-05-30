package gbranch.model.mainchar;

public class Stats {
    public double hp;
    public double mp;
    public double stamina;
    public double exp;
    public double dmg;
    public int level;
    public boolean isArcher;
    public boolean isMage;
    public boolean isWarrior;
    public boolean isAssassin;
    public Stats() {
    }
// Θα αλλάξει η αρχικοποίηση και θα γίνει κάπως (δεν ξέρω πως ακόμα) μέσω πεδίων από την κλάση
    public Stats(double hp, double mp, double stamina, double exp, int level, boolean isArcher, boolean isMage, boolean isWarrior, boolean isAssassin) {
        this.hp = hp;
        this.mp = mp;
        this.stamina = stamina;
        this.exp = exp;
        this.level = level;
        this.isArcher = isArcher;
        this.isMage = isMage;
        this.isWarrior = isWarrior;
        this.isAssassin = isAssassin;
    }
}

