package Transport;

public abstract class Driver {
    private String name;
    private boolean hasDriverLicense;
    private int expirienceInYears;

    public Driver(String name,
                  boolean hasDriverLicense,
                  int expirienceInYears) {
        this.name = name;
        this.hasDriverLicense = hasDriverLicense;
        this.expirienceInYears = expirienceInYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    public int getExpirienceInYears() {
        return expirienceInYears;
    }

    public void setExpirienceInYears(int expirienceInYears) {
        this.expirienceInYears = expirienceInYears;
    }

    public abstract void startMove();
    public abstract void finishMove();
    public abstract void refill();
}
