package ge.springfw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import ge.springfw.SpringmvcApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringmvcApplication.class)
@WebAppConfiguration
public class SpringmvcApplicationTests {

	@Test
	public void contextLoads() {
	}

}
