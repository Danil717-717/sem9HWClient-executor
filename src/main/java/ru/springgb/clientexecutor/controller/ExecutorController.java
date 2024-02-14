package ru.springgb.clientexecutor.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.springgb.cliententity.model.Executor;
import ru.springgb.clientexecutor.service.ExecutorService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ExecutorController {

    private final ExecutorService executorService;

    @PostMapping("/executors")
    public Executor createExecutor(@RequestBody Executor executor) {
        return executorService.save(executor);
    }


    @GetMapping("/executors")
    public List<Executor> getAllExecutor() {
        return executorService.findAll();
    }


    @GetMapping("/executors/{id}")
    public Executor getExecutorById(@PathVariable Long id) {
        return executorService.findById(id);
    }


    @PutMapping("/executors/{id}")
    public Executor updateExecutor(@PathVariable Long id, @RequestBody Executor executor) {
        return executorService.updateExecutor(id, executor);
    }

    @DeleteMapping("/executors/{id}")
    public void deleteExecutor(@PathVariable Long id) {
        executorService.deleteById(id);
    }


}
