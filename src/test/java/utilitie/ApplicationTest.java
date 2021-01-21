package utilitie;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ApplicationTest {
	
	Application appli;
	
	@Mock
	StudentService studentServ;
		
	static MockedStatic<StringUtils> mockStringUtils;
	
	@BeforeAll
	public static void initString() {
		mockStringUtils = Mockito.mockStatic(StringUtils.class);
	}
	
	@Test
    public void findAllStudentNamesEmptyTest() {
		appli = new Application(studentServ);

		Mockito.when(studentServ.findAll()).thenReturn(new ArrayList());
//		mockStringUtils.verify(Mockito.times(1), () -> StringUtils.capitalize(Mockito.anyString()));
		assertTrue(appli.findAllStudentNames().isEmpty());
		// Appel du traitement faisant appel à object
    }
	
	@Test
    public void findAllStudentFakeNamesTest() {
		appli = new Application(studentServ);

		Student studOne = new Student("1","patrick");
		Student studTwo = new Student("2","paul");
		
		List<Student> fakeList = Arrays.asList(studOne, studTwo);
		List<String> expectedList = Arrays.asList("Patrick", "Paul");
		
		Mockito.when(studentServ.findAll()).thenReturn(fakeList);
		List<String> studentNames = appli.findAllStudentNames();
		
		assertEquals(expectedList, studentNames);
    }
	
	@Test
    public void findAllStudentNamesWithParamEmptyTest() {
		appli = new Application(studentServ);
		
		Mockito.when(studentServ.findAll()).thenReturn(new ArrayList());
		assertTrue(appli.findAllStudentNames("test").isEmpty());
		// Appel du traitement faisant appel à object
    }
	
	@Test
    public void findAllStudentFakeNamesWithParamTest() {
		appli = new Application(studentServ);

		Student studOne = new Student("1","patrick");
		Student studTwo = new Student("2","paul");
		
		List<Student> fakeList = Arrays.asList(studOne, studTwo);
		List<String> expectedEmptyList = new ArrayList<>();
		List<String> expectedCompleteList = Arrays.asList("patrick","paul");
		List<String> expectedPatickList = Arrays.asList("patrick");
		
		Mockito.when(studentServ.findAll()).thenReturn(fakeList);
		assertEquals(expectedEmptyList, appli.findAllStudentNames("lebo"));
		assertEquals(expectedCompleteList, appli.findAllStudentNames("pa"));
		assertEquals(expectedPatickList, appli.findAllStudentNames("pat"));
    }
	
	@Test
    public void getStudentNameTest() {
		appli = new Application(studentServ);
		
		Student etud = new Student("1", "test");
		
		Mockito.when(studentServ.getStudent("1")).thenReturn(etud);
		assertEquals("test", appli.getStudent("1"));
		// Appel du traitement faisant appel à object
    }
	
}












