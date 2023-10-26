package chapter_seven;

public class ArcheryGame {
    public static void main(String[] args) {
        ArcheryClass myArchery = new ArcheryClass();
        System.out.println("""
                ============================
                    WELCOME TO DELIGHTED
                        ARCHERY GAME
                ============================
                """);
        myArchery.playKnight();
    }
}
