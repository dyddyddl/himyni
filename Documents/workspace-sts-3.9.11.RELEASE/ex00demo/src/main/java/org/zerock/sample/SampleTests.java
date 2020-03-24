package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;

import jdk.nashorn.internal.objects.annotations.Setter;

@runwith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {RootConfig.class})
@Log4j
public class SampleTests {
	@Setter(onMethod_ = {@Autowired})
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("--------------");
		log.info(restaurant.getChef());
	}
}
