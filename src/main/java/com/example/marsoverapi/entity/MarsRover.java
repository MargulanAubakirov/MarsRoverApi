package com.example.marsoverapi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class MarsRover {
    private Long id;
    private String name;
    @JsonProperty("landing_date")
    private String landingDate;
    @JsonProperty("launch_date")
    private String launchDate;

}
