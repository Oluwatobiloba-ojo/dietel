package chapter_seven.SimpletronLanguage;

public enum OperationCode {
    READ(10),
    WRITE(11),
    LOAD(20),
    STORE(21),
    SUBTRACT(31),
    DIVIDE(32),
    ADD(30),
    MULTIPLY(33),
    BRANCH(40),
    BRANCHNEG(41),
    BRANCHZERO(42),
    HALT(43);
    int value;
    OperationCode(int value) {
        this.value = value;
    }
}
