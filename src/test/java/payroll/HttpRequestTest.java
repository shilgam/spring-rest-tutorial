package payroll;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequestTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getEmployeesList() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/employees",
                String.class)).contains(
                        "[{\"id\":1,\"name\":\"Bilbo Baggins\",\"role\":\"burglar\"},{\"id\":2,\"name\":\"Frodo Baggins\",\"role\":\"thief\"}]"
        );
    }

    @Test
    public void getEmployee() throws Exception {
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/employees/1",
                String.class)).contains("{\"id\":1,\"name\":\"Bilbo Baggins\",\"role\":\"burglar\"}"
        );
    }
}
