package features;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "arg0")
public class Arg0 {

    private String application;
    private String operationName;
    private String transactionDate;
    private String transactionId;
    private Payment payment;

    public Arg0() {
    }

    public Arg0(String application, String operationName, String transactionDate, String transactionId, Payment payment) {
        this.application = application;
        this.operationName = operationName;
        this.transactionDate = transactionDate;
        this.transactionId = transactionId;
        this.payment = payment;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }



    @Override
    public String toString() {
        return "Arg0{" +
                "application='" + application + '\'' +
                ", operationName='" + operationName + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", payment=" + payment +
                '}';
    }
}
