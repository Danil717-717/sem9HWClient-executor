package ru.springgb.clientexecutor.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.springgb.cliententity.model.Executor;

@Repository
public interface ExecutorRepository extends JpaRepository<Executor, Long> {

}
