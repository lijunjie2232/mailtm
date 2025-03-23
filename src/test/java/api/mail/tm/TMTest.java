package api.mail.tm;

import org.junit.jupiter.api.Test;

public class TMTest {
    TM tm = new TM();
    @Test
    void testGetDomains() {
        System.out.println(tm.getDomains());
    }
}
