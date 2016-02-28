package demo.plavatvornica.com.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Tooroop on 26-Feb-16.
 */
public class Accommodation implements Parcelable{

    private String title;

    private int featuredImage;

    private int score;

    private String address;

    private String postCode;

    private String description;

    private int[] imagesResources;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(int featuredImage) {
        this.featuredImage = featuredImage;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int[] getImagesResources() {
        return imagesResources;
    }

    public void setImagesResources(int[] imagesResources) {
        this.imagesResources = imagesResources;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeInt(this.featuredImage);
        dest.writeInt(this.score);
        dest.writeString(this.address);
        dest.writeString(this.postCode);
        dest.writeString(this.description);
        dest.writeIntArray(this.imagesResources);
    }

    public Accommodation() {
    }

    protected Accommodation(Parcel in) {
        this.title = in.readString();
        this.featuredImage = in.readInt();
        this.score = in.readInt();
        this.address = in.readString();
        this.postCode = in.readString();
        this.description = in.readString();
        this.imagesResources = in.createIntArray();
    }

    public static final Creator<Accommodation> CREATOR = new Creator<Accommodation>() {
        public Accommodation createFromParcel(Parcel source) {
            return new Accommodation(source);
        }

        public Accommodation[] newArray(int size) {
            return new Accommodation[size];
        }
    };
}
