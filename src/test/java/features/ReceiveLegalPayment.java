package features;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "intf:receiveLegalPayment",namespace = "http://intf.webservice.themis.turkcelltech.com/")
public class ReceiveLegalPayment {

    private Arg0 arg0;

    public ReceiveLegalPayment() {
    }

    public ReceiveLegalPayment(Arg0 arg0) {
        this.arg0 = arg0;
    }

    public Arg0 getArg0() {
        return arg0;
    }

    public void setArg0(Arg0 arg0) {
        this.arg0 = arg0;
    }

    @Override
    public String toString() {
        return "ReceiveLegalPayment{" +
                "arg0=" + arg0 +
                '}';
    }
}
