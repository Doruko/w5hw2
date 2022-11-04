package dataAccess.abstracts;
import java.util.List;
import entities.concretes.programmingLanguage;

public interface ProgrammingLanguageRepository {
	void add(programmingLanguage programmingLanguage);
	void delete (int id);
	void update(programmingLanguage programmingLanguage);
	List<programmingLanguage> getAll();
	programmingLanguage getById(int id);


}
