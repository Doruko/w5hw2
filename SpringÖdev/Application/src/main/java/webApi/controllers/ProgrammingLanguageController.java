package webApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


import business.abstracts.ProgrammingLanguageService;
import entities.concretes.programmingLanguage;
@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguageController {
	private ProgrammingLanguageService languageService;

	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService languageService) {
		this.languageService = languageService ;
	
	}
	
	@GetMapping("/add")
	public void add(programmingLanguage programmingLanguage) throws Exception{
		 languageService.add(programmingLanguage);
	}
	
	@PutMapping("/update")
	public void update(programmingLanguage programmingLanguage) {
		languageService.update(programmingLanguage);
	}
	
	@GetMapping("/delete")
	public void delete (@RequestParam int id ) {
		languageService.delete(id);
	}
	
	@GetMapping("/getall")
	public List<programmingLanguage> getAll(){
		return languageService.getAll();
		
	}
	
	@GetMapping("/getbyid")
	public programmingLanguage getById(@RequestParam int id) {
		return languageService.getById(id);
	
}
}
