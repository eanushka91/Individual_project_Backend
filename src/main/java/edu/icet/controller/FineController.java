package edu.icet.controller;

import edu.icet.dto.E_License;
import edu.icet.dto.Fine;
import edu.icet.service.FineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fine")
@RequiredArgsConstructor
@CrossOrigin
public class FineController {
    private final FineService service;

    @GetMapping("/get-all")
    public List<Fine> getFine(){
        return service.getAll();
    }

    @PostMapping("/add-fine")
    @ResponseStatus(HttpStatus.CREATED)
    public void addFine(@RequestBody Fine fine){
        service.addFine(fine);
    }



    @GetMapping("/search-by-vehicleno/{vehicleno}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Fine getFineByVehicleNo(@PathVariable String vehicleno){
        return service.findFineByVehicleNo(vehicleno);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteFineById(@PathVariable Integer id){
        service.deleteFineById(id);
    }

    @PutMapping("/update-fine")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateFine(@RequestBody Fine fine){
        service.updateFineById(fine);
    }
}
