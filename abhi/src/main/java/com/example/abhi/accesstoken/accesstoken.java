package com.example.abhi.accesstoken;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Data
@Getter@Setter
public class accesstoken {
    private String accesstoken;
    private String date_of_creation;
    private String expiry_date;
    private String username;
    public accesstoken(){}
}
