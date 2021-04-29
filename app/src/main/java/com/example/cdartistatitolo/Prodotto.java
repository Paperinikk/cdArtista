package com.example.cdartistatitolo;

public class Prodotto {
    private int id;
    private String cd;
    private String artista;
    private String anno;
    private String prezzo;

    public Prodotto(int id, String cd, String artista, String anno, String prezzo) {
        this.id = id;
        this.cd = cd;
        this.artista = artista;
        this.anno = anno;
        this.prezzo = prezzo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }
}
