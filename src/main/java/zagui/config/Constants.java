package zagui.config;

public enum Constants {
    LOGIN_PAGE("https://www.saucedemo.com/"),
    INVENTORY_PAGE("https://www.saucedemo.com/inventory.html"),
    ;

    private final String constants;

    Constants(String constants) {
        this.constants = constants;
    }
    
    public String getConstants(){
        return constants;
    }
}
