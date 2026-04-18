package com.example.learning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("api/v1/software-engineers")

public class SoftwareEngineerController {

    @GetMapping

    public List<SoftwareEngineer> getEngineers(){
        return Arrays.asList(
                new SoftwareEngineer(1,"John Doe","Java"),
                new SoftwareEngineer(2,"Jane Smith","Python"),
                new SoftwareEngineer(3,"Bob Johnson","C++")
        );
    }
    
}
