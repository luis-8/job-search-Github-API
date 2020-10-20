package net.luisgonzalez.jobsearch.api;

import net.luisgonzalez.jobsearch.JobPosition;

import java.util.List;
import java.util.Map;

import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

//interfaz usada por Feign para hacer las peticiones a la API de github
@Headers("Accept: application/json")
public interface APIJobs {

    //petición de trabajos a la api de github
    @RequestLine("GET /positions.json")
    List<JobPosition> jobs(@QueryMap Map<String, Object> queryStrings); //querymap


}
