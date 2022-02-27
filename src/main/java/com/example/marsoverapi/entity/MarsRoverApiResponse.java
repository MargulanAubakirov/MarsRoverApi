package com.example.marsoverapi.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class MarsRoverApiResponse {
    List<MarsPhoto> photos = new ArrayList<>();
}
