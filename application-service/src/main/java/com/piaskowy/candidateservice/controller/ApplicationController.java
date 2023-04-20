package com.piaskowy.candidateservice.controller;

import com.piaskowy.candidateservice.model.Application;
import com.piaskowy.candidateservice.service.ApplicationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("api/v1/applications")
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
