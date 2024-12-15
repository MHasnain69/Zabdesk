package com.Practice.Web.repositary;

import com.Practice.Web.model.Study;
import com.Practice.Web.model.StudyKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepo extends JpaRepository<Study, StudyKey> {
}

