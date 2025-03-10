package be.ucll;

import be.ucll.repository.FlowerRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class HttpTest {

    @Autowired
    private WebTestClient client;

    @Autowired
    private FlowerRepository repository;

    @AfterEach
    public void resetData() {

    }

    @Test
    public void given3Flowers_whenInvokingGetFlower_then3FlowersAreReturned() {
        client.get()
                .uri("/flower")
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBody()
                .json("[{\"name\":\"Tulip\",\"color\":\"purple\"},{\"name\":\"Rose\",\"color\":\"red\"}, {\"name\":\"Dahlia\",\"color\":\"purple\"}]");
    }

    @Test
    public void givenValidFlower_whenInvokingPostRequestWithThisFlower_thenFlowerIsSavedAndHappyMessageIsReturned() {
        client.post()
                .uri("/flower")
                .header("Content-Type", "application/json")
                .bodyValue("{\"name\":\"Hortensia\",\"color\":\"pink\"}")
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBody()
                .json("{\"message\":\"Flower Hortensia added.\"}");

//        assertEquals("Tulip", repository.findFlowerByName("Tulip").getName());
//        assertEquals("Rose", repository.findFlowerByName("Rose").getName());
//        assertEquals("Hortensia", repository.findFlowerByName("Hortensia").getName());
//        assertEquals("Dahlia", repository.findFlowerByName("Dahlia").getName());
    }

    @Test
    public void givenColorPurple_whenInvokingDeleteByColorPurple_thenAllFlowersWithColorPurpleAreRemoved() {
        // To be completed...
    }
}
