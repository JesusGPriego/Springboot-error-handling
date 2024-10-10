package com.suleware.springboot.error.springboot_error.models;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Error {

    private String message;
    private String description;
    private int status;
    private Date date;

}
