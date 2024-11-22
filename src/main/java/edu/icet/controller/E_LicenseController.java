package edu.icet.controller;

import edu.icet.dto.E_License;
import edu.icet.service.E_LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/e_license")
@RequiredArgsConstructor
@CrossOrigin
public class E_LicenseController {
    private final E_LicenseService service;

    @GetMapping("/get-all")
    public List<E_License> getE_License(){
        return service.getAll();
    }

    @PostMapping("/add-license")
    @ResponseStatus(HttpStatus.CREATED)
    public void addE_License(@RequestBody E_License e_license){
        service.addE_License(e_license);
    }

//    @GetMapping("/search-by-id/{id}")
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public E_License getE_LicenseById(@PathVariable Integer id){
//        return service.searchE_LicenseById(id);
//    }

    @GetMapping("/search-by-licenseno/{licenseno}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public E_License getE_LicenseByLicenseNo(@PathVariable String licenseno){
        return service.findLicenseByLicenseNo(licenseno);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteE_LicenseById(@PathVariable Integer id){
        service.deleteE_LicenseById(id);
    }

    @PutMapping("/update-license")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateE_License(@RequestBody E_License e_license){
        service.updateE_LicenseById(e_license);
    }
}
