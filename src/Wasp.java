public class Wasp {
    // .. TODO: Create the wasp class here and show Andy on our next chat :)

    private int healthPoints;
    // Everytime a wasp is hit, it needs to deduct a certain amount of points.
    // This property is for how many points should be deducted
    private int deductableHealthPoints;

    private int id;

    public int getId() {
        return id;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getDeductableHealthPoints() {
        return deductableHealthPoints;
    }

    public Wasp(int healthPoints, int deductableHealthPoints, int id) {
        this.healthPoints = healthPoints;
        this.deductableHealthPoints = deductableHealthPoints;
        this.id = id;
    }

    public boolean isDead() {
        if (this.healthPoints <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void deductPoints() {
        this.healthPoints -= deductableHealthPoints;
    }

}
