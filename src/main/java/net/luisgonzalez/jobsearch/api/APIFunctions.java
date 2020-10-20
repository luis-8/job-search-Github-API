package net.luisgonzalez.jobsearch.api;

import com.google.gson.Gson;

import feign.Feign;
import feign.gson.GsonDecoder;

public interface APIFunctions {

    //construir una petición del tipo T especificado hacia la url especificada
    static <T> T buildAPI(Class<T> clase, String url){
        return Feign.builder().decoder(new GsonDecoder()).target(clase,url);
    }



}
