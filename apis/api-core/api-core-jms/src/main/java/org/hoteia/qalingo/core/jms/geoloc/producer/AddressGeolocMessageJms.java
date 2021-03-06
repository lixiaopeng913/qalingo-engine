/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.8.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2014
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package org.hoteia.qalingo.core.jms.geoloc.producer;

import org.hoteia.qalingo.core.jms.AbstractMessageJms;

public class AddressGeolocMessageJms extends AbstractMessageJms {

    private Long objectId;
    private String objectType;

    private String address;
    private String postalCode;
    private String city;
    private String countryCode;
    private String geolocType;
    
    public Long getObjectId() {
        return objectId;
    }
    
    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }
    
    public String getObjectType() {
        return objectType;
    }
    
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getGeolocType() {
        return geolocType;
    }
    
    public void setGeolocType(String geolocType) {
        this.geolocType = geolocType;
    }
    
}