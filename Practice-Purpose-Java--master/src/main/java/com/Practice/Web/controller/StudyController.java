package com.Practice.Web.controller;

import com.Practice.Web.model.Study;
import com.Practice.Web.model.StudyKey;
import com.Practice.Web.repositary.StudyRepo;
import com.Practice.Web.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/study")
public class StudyController {
    @Autowired
    StudyService studyService;

    @GetMapping("/get")
    public ResponseEntity<List<Study>> getStudy(){
        try {
            return studyService.getStudy();
        }catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<?> addStudy(@RequestBody Study study){
        try{
            Study study1 = studyService.addStudy(study);
            return new ResponseEntity<>(study1,HttpStatus.CREATED);
        }catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }


@Autowired
    StudyRepo studyRepo;
    @PutMapping("/{regNo}/{courseId}")
    public ResponseEntity<Study> updateStudy(
            @PathVariable int regNo,
            @PathVariable int courseId,
            @RequestBody Study updatedStudy) {

        // Create the composite key
        StudyKey studyKey = new StudyKey(regNo, courseId);

        // Find the existing record
        Optional<Study> existingStudyOptional = studyRepo.findById(studyKey);

        if (existingStudyOptional.isPresent()) {
            Study existingStudy = existingStudyOptional.get();

            existingStudy.setQuiz1Name(updatedStudy.getQuiz1Name());
            existingStudy.setQuiz1(updatedStudy.getQuiz1());
            existingStudy.setQuiz1Max(updatedStudy.getQuiz1Max());
            existingStudy.setQuiz2Name(updatedStudy.getQuiz2Name());
            existingStudy.setQuiz2(updatedStudy.getQuiz2());
            existingStudy.setQuiz2Max(updatedStudy.getQuiz2Max());
            existingStudy.setQuiz3Name(updatedStudy.getQuiz3Name());
            existingStudy.setQuiz3(updatedStudy.getQuiz3());
            existingStudy.setQuiz3max(updatedStudy.getQuiz3max());

            existingStudy.setAss1Name(updatedStudy.getAss1Name());
            existingStudy.setAssignment1(updatedStudy.getAssignment1());
            existingStudy.setAssignment1Max(updatedStudy.getAssignment1Max());
            existingStudy.setAss2Name(updatedStudy.getAss2Name());
            existingStudy.setAssignment2(updatedStudy.getAssignment2());
            existingStudy.setAssignment2Max(updatedStudy.getAssignment2Max());
            existingStudy.setAss3Name(updatedStudy.getAss3Name());
            existingStudy.setAssignment3(updatedStudy.getAssignment3());
            existingStudy.setAssignment3Max(updatedStudy.getAssignment3Max());
            existingStudy.setAss4Name(updatedStudy.getAss4Name());
            existingStudy.setAssignment4(updatedStudy.getAssignment4());
            existingStudy.setAssignment4Max(updatedStudy.getAssignment4Max());
            existingStudy.setAss5Name(updatedStudy.getAss5Name());
            existingStudy.setAssignment5(updatedStudy.getAssignment5());
            existingStudy.setAssignment5Max(updatedStudy.getAssignment5Max());

            existingStudy.setMid1Name(updatedStudy.getMid1Name());
            existingStudy.setMid(updatedStudy.getMid());
            existingStudy.setMidMax(updatedStudy.getMidMax());

            existingStudy.setFinalName(updatedStudy.getFinalName());
            existingStudy.setFinal(updatedStudy.getFinal());
            existingStudy.setFinalMax(updatedStudy.getFinalMax());

            existingStudy.setProjectName(updatedStudy.getProjectName());
            existingStudy.setProject(updatedStudy.getProject());
            existingStudy.setProjectMax(updatedStudy.getProjectMax());

            existingStudy.setPresentationName(updatedStudy.getPresentationName());
            existingStudy.setPresentation(updatedStudy.getPresentation());
            existingStudy.setPresentationMax(updatedStudy.getPresentationMax());

            existingStudy.setReportName(updatedStudy.getReportName());
            existingStudy.setReport(updatedStudy.getReport());
            existingStudy.setReportMax(updatedStudy.getReportMax());

            existingStudy.setWeek1(updatedStudy.getWeek1());
            existingStudy.setWeek2(updatedStudy.getWeek2());
            existingStudy.setWeek3(updatedStudy.getWeek3());
            existingStudy.setWeek4(updatedStudy.getWeek4());
            existingStudy.setWeek5(updatedStudy.getWeek5());
            existingStudy.setWeek6(updatedStudy.getWeek6());
            existingStudy.setWeek7(updatedStudy.getWeek7());
            existingStudy.setWeek8(updatedStudy.getWeek8());
            existingStudy.setWeek9(updatedStudy.getWeek9());
            existingStudy.setWeek10(updatedStudy.getWeek10());
            existingStudy.setWeek11(updatedStudy.getWeek11());
            existingStudy.setWeek12(updatedStudy.getWeek12());
            existingStudy.setWeek13(updatedStudy.getWeek13());
            existingStudy.setWeek14(updatedStudy.getWeek14());
            existingStudy.setWeek15(updatedStudy.getWeek15());
            existingStudy.setWeek16(updatedStudy.getWeek16());

            studyRepo.save(existingStudy);
            return ResponseEntity.ok(existingStudy);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
