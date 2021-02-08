/**
 * @description
 * Read business  format class
 * Used as data format for reading a business
 *
 * @author Kellia Umuhire
 * @since Wednesday, 3 February 2021
 * */
package com.customify.shared.responses_data_format.BusinessFormats;

import java.io.Serializable;
import java.time.LocalDate;

public class BusinessRFormat implements Serializable{
    private int id;
    private String name;
    private String location;
    private String address;
    private String phone_number;
    private int representative_id;
    private int plan_id;
    private LocalDate created_at;
    public BusinessRFormat(){};
    public BusinessRFormat(int id, String location, String address, String phone_number, String name, int representative_id, int plan_id){
        this.id=id;
        this.name=name;
        this.location=location;
        this.address=address;
        this.phone_number=phone_number;
        this.representative_id=representative_id;
        this.plan_id=plan_id;
    };

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getPlan_id() {
        return plan_id;
    }

    public int getRepresentative_id() {
        return representative_id;
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }

    public String getPhone_number() {
        return phone_number;
    }
}
