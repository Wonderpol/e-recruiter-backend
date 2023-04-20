package com.piaskowy.candidateservice.controller;

import com.piaskowy.candidateservice.model.Application;
import com.piaskowy.candidateservice.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications/")
public class ApplicationController {
    private final ApplicationService applicationService;

    public ApplicationController(final ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping
    public void addApplication(@RequestBody Application application) {
        applicationService.addNewApplication(application);
    }

    @GetMapping
    public List<Application> allApplications() {
        return applicationService.getAllApplications();
    }

}
