package features;


import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.XmlConfig;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;


public class soap_core_rest {

    //property instantiated
    Properties prop = new Properties();

    //TestNG annotation to run before test
    @BeforeTest

    //configurations for webservice timeout and property file
    public void configTimeOutandProperties() throws IOException {


        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\env.properties");
        prop.load(fis);

        RestAssured.config = RestAssuredConfig.config().httpClient(HttpClientConfig.httpClientConfig().
                setParam("http.connection.timeout", 15000).
                setParam("http.socket.timeout", 15000).
                setParam("http.connection-manager.timeout", 15000));
        System.out.println("Preparing connection timeout");
    }

    //TestNG annotation to run the test
    @Test

    //test of webservice for GET method with assertions
    public void RequestParametersTest() {

        //query strings as variables for tidying code
        String word = "1000000003279";
        String myEnvelope = "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:intf=\"http://intf.webservice.themis.turkcelltech.com/\">\n" +
                "    <SOAP-ENV:Header/>\n" +
                "    <SOAP-ENV:Body>\n" +
                "        <intf:receiveLegalPayment>\n" +
                "            <arg0>\n" +
                "                <application>1</application>\n" +
                "                <operationName>test</operationName>\n" +
                "                <transactionDate>11-01-2018</transactionDate>\n" +
                "                <transactionId>2000001</transactionId>\n" +
                "                <payment>\n" +
                "                    <caseId>" + word + "</caseId>\n" +
                "                    <contractRef>5342318856</contractRef>\n" +
                "                    <customerNumber>925555039</customerNumber>\n" +
                "                    <customerRef>422525413</customerRef>\n" +
                "                    <id>0</id>\n" +
                "                    <institutionId>1062</institutionId>\n" +
                "                    <invoiceId>0</invoiceId>\n" +
                "                    <opTypeId>0</opTypeId>\n" +
                "                    <paymentAccount>1</paymentAccount>\n" +
                "                    <paymentAmount>1.0</paymentAmount>\n" +
                "                    <paymentDate>2018-08-07T14:06:27.364+03:00</paymentDate>\n" +
                "                    <paymentOriginTypeId>1</paymentOriginTypeId>\n" +
                "                    <paymentPeriod>201808</paymentPeriod>\n" +
                "                    <paymentTypeId>1</paymentTypeId>\n" +
                "                    <referenceId>1264284278</referenceId>\n" +
                "                    <transactionId>3002</transactionId>\n" +
                "                </payment>\n" +
                "            </arg0>\n" +
                "        </intf:receiveLegalPayment>\n" +
                "    </SOAP-ENV:Body>\n" +
                "</SOAP-ENV:Envelope>";

        //info of test initalization can be seen on console
        System.out.println("Running test automation");

        //query string paremeters assigned to a variable with response

/*        ValidatableResponse res = given().log().all().request().contentType("text/xml; charset=UTF-8;").body(myEnvelope).
                when().post(prop.getProperty("HOST")+ "/Themis-Backend/PaymentWebService").andReturn().then().log().all().
                assertThat().
                statusCode(200).body("Envelope.Body.receiveLegalPaymentResponse.return.returnCode",equalTo("-12315"));*/

        ReceiveLegalPayment receiveLegalPayment = new ReceiveLegalPayment(
                new Arg0("1", "test", "11-01-2018", "2000001",
                new Payment("1000000003279", "5342318856", "925555039", "422525413", "0", "1062", "0", "0", "1", "1.0", "2018-08-07T14:06:27.364+03:00", "1", "201808", "1", "1264284278", "3002")));


        ValidatableResponse res2 = given().log().all().header("SOAPAction","http://10.201.83.103:7722").
                config(RestAssured.config().xmlConfig(XmlConfig.xmlConfig().with().namespaceAware(true).
                declareNamespace("intf", "http://intf.webservice.themis.turkcelltech.com/"))).
                contentType("text/xml; charset=UTF-8;").
                body(receiveLegalPayment,ObjectMapperType.JAXB).
                when().post(prop.getProperty("HOST") + "/Themis-Backend/PaymentWebService").andReturn().then().log().all().
                assertThat().
                statusCode(200);

//TODO: Loglama mekanizmasını araştımak gerekiyor


        //writes the response in a formatted way to console
        //XmlPath js = new XmlPath(res);
        //    js.prettyPrint();

        //Info for console
        System.out.println("Test has run");

    }

}

