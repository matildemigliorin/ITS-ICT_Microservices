import org.junit.Test;
import org.junit.runner.RunWith;
import org.example.borrowing.models.Borrowing;
import org.example.borrowing.repos.BorrowingRepository;
import org.example.borrowing.services.BorrowingApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.assertEquals;



@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations="classpath:application-test.properties")
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class BorrowingRepositoryUnitTest {

    @MockBean
    BorrowingApplication notificationClient;

    @Autowired
    private BorrowingRepository borrowingRepository;

    @Test
    public void testEmptyDb(){
        assertEquals(0, StreamSupport.stream(borrowingRepository.findAll().spliterator(), false).count());
    }




}