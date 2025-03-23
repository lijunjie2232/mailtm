package api.mail.tm;

import api.mail.tm.service.DomainService;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TMTest {
    TM tm = new TM();
    @Test
    void testGetDomains() throws IOException {
        System.out.println(DomainService.getDomains());
    }
}
