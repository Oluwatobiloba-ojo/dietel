package chapter_seven.Archery;

import chapter_seven.Archery.ArcheryClass;

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
