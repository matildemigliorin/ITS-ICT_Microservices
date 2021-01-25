import org.example.book.models.User;
import org.example.book.repos.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations="classpath:application-test.properties")
@DirtiesContext(classMode = ClassMode.AFTER_EACH_TEST_METHOD)
public class BookRepositoryUnitTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void testEmptyDB(){
        assertEquals(0,userRepository.findAll().size()  );
    }

    @Test
    public void testAddOneCustomer(){
        User user = new User();
        user.setNome("Matilde");
        user.setCognome("Migliorin");
        user.setUserId("111222333");
        userRepository.save(user);
        assertEquals(1,userRepository.findAll().size()  );
    }

    @Test
    public void testGetBookById(){
        try{
            Book book = new Book();
            book.setBookId(1L);
            book.setAuthor("Ray Bradbury");
            book.setTitle("Fahrenheit 451");
            book.setGenre("Romanzo");
            book.setYear(1956);
            book.setPublishingHouse("Mondadori");
            bookRepo.save(book);

            bookRepo.findById(1L);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
