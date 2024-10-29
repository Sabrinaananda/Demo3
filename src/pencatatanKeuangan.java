
public class pencatatanKeuangan {
    private String date;//set get
    private String description;
    private double amount;

    public pencatatanKeuangan(String date, String description, double amount) {
        this.setDate(date);
        this.setDescription(description);
        this.setAmount(amount);
    }

    public void displayRecord() { //rename jadi displayRecord
        System.out.println("Date: " + getDate() + ", Description: " + getDescription() + ", Amount: " + getAmount());
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class MainApp {//move method
}

