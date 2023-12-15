package behavioral.observer.CA6;

public class LevelInfo extends DashBoard {
    private int level;
    private int additionalReward;

    public LevelInfo(int level, int additionalReward) {
        this.level = level;
        this.additionalReward = additionalReward;
    }

    @Override
    public void update(int thoiGian, int countdown, int grade) {
        super.update(thoiGian, countdown, grade);
        System.out.println("Level: " + level + ", Thưởng bổ sung: " + additionalReward);
    }
}
