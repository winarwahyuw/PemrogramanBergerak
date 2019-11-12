package winarwahyuw.winw.mycardview;

public class DataSet {
    private String name;
    private String detail;
    private int photo;
    private int id;
    private int cardImages;
    private String cardDetail;

    public String getCardDetail() {
        return cardDetail;
    }

    public void setCardDetail(String cardDetail) {
        this.cardDetail = cardDetail;
    }

    public int getCardImages() {
        return cardImages;
    }

    public void setCardImages(int cardImages) {
        this.cardImages = cardImages;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
