package uz.asror.tourism.model;

public class District {
    private String region;
    private String district;

    public District(String region, String district) {
        this.region = region;
        this.district = district;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
