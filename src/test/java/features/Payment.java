package features;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "payment")
public class Payment {

    private String caseId;
    private String contractRef;
    private String customerNumber;
    private String customerRef;
    private String id;
    private String institutionId;
    private String invoiceId;
    private String opTypeId;
    private String paymentAccount;
    private String paymentAmount;
    private String paymentDate;
    private String paymentOriginTypeId;
    private String paymentPeriod;
    private String paymentTypeId;
    private String referenceId;
    private String transactionId;

    public Payment() {
    }

    public Payment(String caseId, String contractRef, String customerNumber, String customerRef, String id, String institutionId, String invoiceId, String opTypeId, String paymentAccount, String paymentAmount, String paymentDate, String paymentOriginTypeId, String paymentPeriod, String paymentTypeId, String referenceId, String transactionId) {
        this.caseId = caseId;
        this.contractRef = contractRef;
        this.customerNumber = customerNumber;
        this.customerRef = customerRef;
        this.id = id;
        this.institutionId = institutionId;
        this.invoiceId = invoiceId;
        this.opTypeId = opTypeId;
        this.paymentAccount = paymentAccount;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
        this.paymentOriginTypeId = paymentOriginTypeId;
        this.paymentPeriod = paymentPeriod;
        this.paymentTypeId = paymentTypeId;
        this.referenceId = referenceId;
        this.transactionId = transactionId;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getContractRef() {
        return contractRef;
    }

    public void setContractRef(String contractRef) {
        this.contractRef = contractRef;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerRef() {
        return customerRef;
    }

    public void setCustomerRef(String customerRef) {
        this.customerRef = customerRef;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getOpTypeId() {
        return opTypeId;
    }

    public void setOpTypeId(String opTypeId) {
        this.opTypeId = opTypeId;
    }

    public String getPaymentAccount() {
        return paymentAccount;
    }

    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccount = paymentAccount;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentOriginTypeId() {
        return paymentOriginTypeId;
    }

    public void setPaymentOriginTypeId(String paymentOriginTypeId) {
        this.paymentOriginTypeId = paymentOriginTypeId;
    }

    public String getPaymentPeriod() {
        return paymentPeriod;
    }

    public void setPaymentPeriod(String paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "caseId='" + caseId + '\'' +
                ", contractRef='" + contractRef + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                ", customerRef='" + customerRef + '\'' +
                ", id='" + id + '\'' +
                ", institutionId='" + institutionId + '\'' +
                ", invoiceId='" + invoiceId + '\'' +
                ", opTypeId='" + opTypeId + '\'' +
                ", paymentAccount='" + paymentAccount + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                ", paymentDate='" + paymentDate + '\'' +
                ", paymentOriginTypeId='" + paymentOriginTypeId + '\'' +
                ", paymentPeriod='" + paymentPeriod + '\'' +
                ", paymentTypeId='" + paymentTypeId + '\'' +
                ", referenceId='" + referenceId + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }
}
