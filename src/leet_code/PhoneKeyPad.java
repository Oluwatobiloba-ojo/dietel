package leet_code;

public enum PhoneKeyPad {

    ABC(2), DEF(3), GHI(4), JKL(5), MNO(6), PQRS(7), TUV(8), WXYV(9);
    int value;
    PhoneKeyPad(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
