package features;

import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.path.xml.XmlPath.with;

public class soap {

    public static void main(String[] args) {

        // http://services.aonaware.com/DictService/DictService.asmx?op=Define
        // http://services.aonaware.com/DictService/DictService.asmx?wsdl

        baseURI = "http://10.201.83.103:7722" ;
        //port = 80;
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
                "                    <caseId>"+word+"</caseId>\n" +
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

        //Map<String, String> authhdrs = new HashMap<String, String>();
       // authhdrs.put("SOAPAction", "Define");
        //authhdrs.put("Content-Length", Integer.toString( myEnvelope.length() ) );
        String xml = given().request()
                .contentType("text/xml; charset=UTF-8;").body( myEnvelope )
                .when().post( "/Themis-Backend/PaymentWebService" ).andReturn().asString();

        String prettyXML = with(xml).prettyPrint();
        System.out.println( prettyXML );
    }
}