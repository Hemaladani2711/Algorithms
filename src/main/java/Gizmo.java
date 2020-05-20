import org.jetbrains.annotations.NotNull;

public class Gizmo {

    private String maker;
    private boolean isElectronic;

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public boolean isElectronic() {
        return isElectronic;
    }

    public void setElectronic(boolean electronic) {
        isElectronic = electronic;
    }

    @Override
    public String toString() {
        return "Gizmo{" +
                "maker='" + maker + '\'' +
                ", isElectronic=" + isElectronic +
                '}';
    }

    @Override
    public boolean equals(Object other){
            return (this==other);
    }



}
