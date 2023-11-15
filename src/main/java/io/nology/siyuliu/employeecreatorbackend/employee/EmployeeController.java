package io.nology.siyuliu.employeecreatorbackend.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    // @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<List<Employee>> getAll() {
        List<Employee> allEmployees = this.employeeService.getAll();
        return new ResponseEntity<>(allEmployees, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getById(@PathVariable Long id) {
        Optional<Employee> found = this.employeeService.getById(id);
        if(found.isPresent()) {
			return new ResponseEntity<Employee>(found.get(), HttpStatus.OK);
		}
	
		// throw an exception 
				// (I will also create a global exception handler)
				// will return a certain message and a status code whenever that particualr type of 
				// exception is thrown
                return null;
    }

}
