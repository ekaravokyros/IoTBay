package Model;
import java.io.Serializable;

/**
 *
 * @author nrsmi
 */

public class Payment implements Serializable {
    private String payment_method;
    private String name_on_card;
    private String card_number;
    private String expiry_date;
    private String cvv;
    private String date_paid;

    public Payment(){
        
    }
    
    public Payment(String payment_method, String name_on_card, String card_number, String expiry_date, String cvv, String date_paid) {
        this.payment_method = payment_method;
        this.name_on_card = name_on_card;
        this.card_number = card_number;
        this.expiry_date = expiry_date;
        this.cvv = cvv;
        this.date_paid = date_paid;
    }
    
    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getName_on_card() {
        return name_on_card;
    }

    public void setName_on_card(String name_on_card) {
        this.name_on_card = name_on_card;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(String expiry_date) {
        this.expiry_date = expiry_date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getDate_paid() {
        return date_paid;
    }

    public void setDate_paid(String date_paid) {
        this.date_paid = date_paid;
    }
}