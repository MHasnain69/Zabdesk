package com.Practice.Web.service;

import com.Practice.Web.model.Study;
import com.Practice.Web.repositary.StudyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyService {
    @Autowired
    StudyRepo studyRepo ;
    public ResponseEntity<List<Study>> getStudy() {
        try {
            return new ResponseEntity<>(studyRepo.findAll(), HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    public Study addStudy(Study study) {
        return studyRepo.save(study);
    }

}
