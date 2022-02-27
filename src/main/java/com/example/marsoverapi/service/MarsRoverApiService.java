package com.example.marsoverapi.service;

import com.example.marsoverapi.entity.MarsRoverApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MarsRoverApiService {

    public MarsRoverApiResponse getRoverData(String roverType){
        RestTemplate rt = new RestTemplate();

//        ResponseEntity<String> response= rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=DEMO_KEY", String.class);
        ResponseEntity<MarsRoverApiResponse> response= rt.getForEntity("https://api.nasa.gov/mars-photos/api/v1/rovers/"+roverType+"/photos?sol=2&api_key=DEMO_KEY", MarsRoverApiResponse.class);
//        System.out.println(response.getBody());
        return response.getBody();
    }
}
