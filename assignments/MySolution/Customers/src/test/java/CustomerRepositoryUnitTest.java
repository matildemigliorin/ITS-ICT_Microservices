import org.example.customers.models.Customers;
import org.example.customers.repos.CustomerRepository;
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
public class CustomerRepositoryUnitTest {

    @Autowired
    private CustomerRepository customerRepository;


    @Test
    public void testEmptyDB(){
        assertEquals(0,customerRepository.findAll().size()  );
    }

    @Test
    public void testAddOneCustomer(){
        Customers customer = new Customers();
        customer.setCustomerName("Matilde");
        customer.setCustomerSurname("Migliorin");
        customer.setCustomerId("111222333");
        customer.setCustomerAddress("Via S. Paolo");
        customer.setCustomerNumber("333 3456789");
        customerRepository.save(customer);
        assertEquals(1,customerRepository.findAll().size()  );
    }

}
