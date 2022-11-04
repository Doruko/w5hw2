package business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import business.abstracts.ProgrammingLanguageService;
import entities.concretes.programmingLanguage;
import dataAccess.abstracts.ProgrammingLanguageRepository;


public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository programmingLanguageRepository;
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	
	

	@Override
	public void delete(int id) {
		programmingLanguageRepository.delete(id);
		
		
	}

	@Override
	public void update(programmingLanguage programmingLanguage) {
		programmingLanguageRepository.update(programmingLanguage);
		
	
	}

	@Override
	public List<programmingLanguage> getAll() {
		
		return programmingLanguageRepository.getAll();
	}

	@Override
	public programmingLanguage getById(int id) {
		
		return programmingLanguageRepository.getById(id);
	}

	@Override
	public void add(programmingLanguage programmingLanguage) {
		var languages = programmingLanguageRepository.getAll();
		for (programmingLanguage language : languages) {
			if(programmingLanguage.getName().equals(language.getName())) {
				System.out.println("Program dili tekrar edemez:"+programmingLanguage.getName());
				return;
			}
		}
		
	}

	

}
