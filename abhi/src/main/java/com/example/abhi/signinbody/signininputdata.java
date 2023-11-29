package com.example.abhi.signinbody;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter@Setter
@Data
public class signininputdata {
    private String siteId;
    @JsonIgnore
    private String requestType;
    private String email;
    private String password;
    private String domain;
    @JsonProperty("deviceFingerPrint")
    deviceFingerPrint deviceFingerPrint;
    signininputdata(){}
    
}
