package com.lucasmoraes.hrworker.repositories;

import com.lucasmoraes.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
