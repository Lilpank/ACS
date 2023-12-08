package com.study.repos;

import com.study.models.Email;
import org.springframework.data.repository.CrudRepository;

public interface EmailRepository extends CrudRepository<Email, Integer> {
}
