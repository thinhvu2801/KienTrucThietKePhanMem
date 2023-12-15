package behavioral.observer.CA6;

public class MainGame {
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData();
        DashBoard dashBoard = new DashBoard();
        LevelInfo levelInfo = new LevelInfo(2, 100);

        playerData.addObserver(dashBoard);
        playerData.addObserver(levelInfo);

        // Simulate changes in game attributes
        playerData.setThoiGian(100);
        playerData.setCountdown(5);
        playerData.setGrade(50);
    }
}
