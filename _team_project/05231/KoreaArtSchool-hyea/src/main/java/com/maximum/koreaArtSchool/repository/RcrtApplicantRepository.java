package com.maximum.koreaArtSchool.repository;

import com.maximum.koreaArtSchool.entity.RcrtApplicant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RcrtApplicantRepository extends JpaRepository<RcrtApplicant, Integer> {
}