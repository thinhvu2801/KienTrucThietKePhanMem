package behavioral.observer.CA4thaylam;

public class Main {
    public static void main(String[] args) {
        Topic topic = new Topic();
        ThanhVienA tvA = new ThanhVienA(topic);
        ThanhVienB tvB = new ThanhVienB(topic);
        topic.taoTinMoi(new Tin(1,"Cô giáo bị dí"));
        topic.taoTinMoi(new Tin(2,"Thi cuối kỳ môn hoc..."));
        topic.capNhatTin(new Tin(1,"nguu"));
    }
}
