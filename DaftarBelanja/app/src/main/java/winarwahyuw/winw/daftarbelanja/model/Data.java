package winarwahyuw.winw.daftarbelanja.model;

public class Data {

    private String type;
    private int amount;
    private String note;
    private String date;
    private String id;

    public Data(){

    }

    public Data(String type, int amount, String note, String Date, String id){
        this.type = type;
        this.amount = amount;
        this.note = note;
        this.date = date;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
