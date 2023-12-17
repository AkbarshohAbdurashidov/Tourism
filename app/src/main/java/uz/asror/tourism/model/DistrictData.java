package uz.asror.tourism.model;

public class DistrictData {

    String district_one;
    String district_two;
    String unique_place;



    public DistrictData(String district_one, String district_two, String unique_place) {
        this.district_one = district_one;
        this.district_two = district_two;
        this.unique_place = unique_place;
    }

    public String getDistrict_one() {
        return district_one;
    }

    public void setDistrict_one(String district_one) {
        this.district_one = district_one;
    }

    public String getDistrict_two() {
        return district_two;
    }

    public void setDistrict_two(String district_two) {
        this.district_two = district_two;
    }

    public String getUnique_place() {
        return unique_place;
    }

    public void setUnique_place(String unique_place) {
        this.unique_place = unique_place;
    }

    @Override
    public String toString() {
        return "DistrictAdapter{" +
                "district_one='" + district_one + '\'' +
                ", district_two='" + district_two + '\'' +
                ", unique_place='" + unique_place + '\'' +
                '}';
    }
}
