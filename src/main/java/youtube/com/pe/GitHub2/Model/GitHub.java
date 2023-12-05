package youtube.com.pe.GitHub2.Model;

import java.util.Date;

public class GitHub {
    private Integer idgit;
    private String nombregit;
    private Double preciogit;
    private Date fechagit;
    public GitHub(Integer idgit, String nombregit, Double preciogit, Date fechagit) {
        this.idgit = idgit;
        this.nombregit = nombregit;
        this.preciogit = preciogit;
        this.fechagit = fechagit;
    }
    public Integer getIdgit() {
        return idgit;
    }

    public String getNombregit() {
        return nombregit;
    }

    public Double getPreciogit() {
        return preciogit;
    }

    public Date getFechagit() {
        return fechagit;
    }

    public void setIdgit(Integer idgit) {
        this.idgit = idgit;
    }

    public void setNombregit(String nombregit) {
        this.nombregit = nombregit;
    }

    public void setPreciogit(Double preciogit) {
        this.preciogit = preciogit;
    }

    public void setFechagit(Date fechagit) {
        this.fechagit = fechagit;
    }
}