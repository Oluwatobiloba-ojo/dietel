package chapter_five;

public class AccountPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AccountPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public boolean isNoFaultState() {
        boolean noFaultState;
        String firstIndex = String.valueOf(state.charAt(0));
        String lastIndex = String.valueOf(state.charAt(state.length() - 1));
        lastIndex = lastIndex.toUpperCase();
        firstIndex = firstIndex.toUpperCase();
        String comparator = firstIndex + lastIndex;
        if (comparator.equals("CT") || comparator.equals("MS") || comparator.equals("ME") || comparator.equals("NE") ||
                comparator.equals("NY") || comparator.equals("NK") || comparator.equals("PA") || comparator.equals("VT")) {
            noFaultState = true;
        } else {
            noFaultState = false;
        }
        return noFaultState;
    }
}
