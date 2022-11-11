package com.clase2.http.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Period;

@RestController
public class cantAnios {

    @GetMapping("/{dia}/{mes}/{anio}")

    public String calcularEdad(@PathVariable Integer dia, @PathVariable Integer mes, @PathVariable Integer anio){
       /* LocalDate startDate = LocalDate.parse("2015-03-15");
        LocalDate endDate = LocalDate.parse("2019-05-20");
        System.out.println("The start date is: " + startDate);
        System.out.println("The end date is: " + endDate);
        Period p = Period.between(startDate, endDate);*/

        //Period anios = Period.between()
        LocalDate enter = LocalDate.parse(dia, mes, anio);
        LocalDate today = LocalDate.now();
    }




}
