package id.ac.uversrivaldo.bringup;

import android.os.Parcel;
import android.os.Parcelable;

public class Soal implements Parcelable {
    private String soal;
    private String jawaban;

    Soal(){

    }
    protected Soal(Parcel in) {
        soal = in.readString();
        jawaban = in.readString();

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(soal);
        dest.writeString(jawaban);

    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Soal> CREATOR = new Creator<Soal>() {
        @Override
        public Soal createFromParcel(Parcel in) {
            return new Soal(in);
        }

        @Override
        public Soal[] newArray(int size) {
            return new Soal[size];
        }
    };

    public String getSoal() {
        return soal;
    }

    public void setSoal(String soal) {
        this.soal = soal;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

}
