package org.example.soft_delete_sandbox.repository;

import org.example.soft_delete_sandbox.sol1.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {}
