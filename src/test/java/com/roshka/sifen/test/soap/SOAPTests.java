package com.roshka.sifen.test.soap;

import com.roshka.sifen.internal.helpers.SoapHelper;
import jakarta.xml.soap.SOAPException;
import jakarta.xml.soap.SOAPMessage;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class SOAPTests {
    private final static Logger logger = Logger.getLogger(SOAPTests.class.toString());

    //@Ignore
    @Test
    public void testBasicMessage() throws SOAPException, IOException {
        SOAPMessage soapMessage = SoapHelper.createSoapMessage();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        soapMessage.writeTo(baos);
        String s = new String(baos.toByteArray(), StandardCharsets.UTF_8);
        logger.info(s);
        assert s.contains(":Envelope");
    }


}
