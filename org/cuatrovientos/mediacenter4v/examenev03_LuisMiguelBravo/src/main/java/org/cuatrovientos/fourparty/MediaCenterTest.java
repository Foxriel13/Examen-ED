package org.cuatrovientos.fourparty;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MediaCenterTest {


	@Test
	void testInsert() {
		Song cancion = new Song("aaa","aaa",343);
		MediaCenter ubi = new MediaCenter();
		ubi.new_FILE(cancion);
		ubi.SeARch("aaa");
	}
	
	@Test
	void testDelete() {
		MediaCenter ubi = new MediaCenter();
		ubi.Remo_FILE("aaa");
	}
	
	@Test
	void testUpdate() {
		MediaCenter ubi = new MediaCenter();
		ubi.SeARch("aaa");
	}

}
