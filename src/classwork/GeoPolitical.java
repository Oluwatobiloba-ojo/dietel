package classwork;

public enum GeoPolitical {

    NORTH_CENTRAL("BENUE", "FCT", "KOGI", "KWARA", "NASARAWA", "NIGER", "PLATEAU"),
    NORTH_EAST("ADAMAWA", "bauchi", "borno", "gombe", "taraba", "yobe"),
    NORTH_WEST("kaduna", "katsina", "kano", "kebbi", "sokoto", "jigawa", "zamfara"),
    SOUTH_EAST("abia", "anambra", "ebonyi", "enugu", "imo"),
    SOUTH_SOUTH("akwa-ibom", "bayelsa", "cross-river", "delta", "edo", "river"),
    SOUTH_WEST("ekiti", "lagos", "osun", "ondo", "ogun", "oyo");

    String[] zone;

    public String[] getZone() {
        return zone;
    }

    GeoPolitical(String... zone){
        this.zone = zone;
    }
    public static GeoPolitical zone(String input) {
        for (GeoPolitical political : GeoPolitical.values()){
            GeoPolitical politicalZoneState = politicalZoneState(input, political);
            if (politicalZoneState != null) return politicalZoneState;}
        return null;
    }

    private static GeoPolitical politicalZoneState(String input, GeoPolitical political) {
        for (int count = 0; count < political.getZone().length; count++){
            if (input.equalsIgnoreCase(political.getZone()[count])) return political;
        }
        return null;
    }
}
