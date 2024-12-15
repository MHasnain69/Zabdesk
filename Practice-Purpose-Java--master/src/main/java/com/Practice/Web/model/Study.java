package com.Practice.Web.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "study")
@NoArgsConstructor
@AllArgsConstructor
public class Study {

    @EmbeddedId
    private StudyKey id;

    private String quiz1Name;
    private String quiz1;
    private String quiz1Max;

    private String quiz2Name;
    private String quiz2;
    private String quiz2Max;

    private String quiz3Name;
    private String quiz3;
    private String quiz3max;


    private String ass1Name;
    private String assignment1;
    private String assignment1Max;

    private String ass2Name;
    private String assignment2;
    private String assignment2Max;

    private String ass3Name;
    private String assignment3;
    private String assignment3Max;

    private String ass4Name;
    private String assignment4;
    private String assignment4Max;

    private String ass5Name;
    private String assignment5;
    private String assignment5Max;


    private String Mid1Name;
    private String Mid;
    private String MidMax;


    private String FinalName;
    private String Final;
    private String FinalMax;

    private String ProjectName;
    private String Project;
    private String ProjectMax;


    private String PresentationName;
    private String Presentation;
    private String PresentationMax;

    private String ReportName;
    private String Report;
    private String ReportMax;


    private String week1;
    private String week2;
    private String week3;
    private String week4;
    private String week5;
    private String week6;
    private String week7;
    private String week8;
    private String week9;
    private String week10;
    private String week11;
    private String week12;
    private String week13;
    private String week14;
    private String week15;
    private String week16;

}

