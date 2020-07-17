package com.company;

public class Student {
    private String ime;
    private String prezime;
    private int indeks;

    public Student() {
    }

    public Student(String ime, String prezime, int indeks) {
        this.ime = ime;
        this.prezime = prezime;
        this.indeks = indeks;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", indeks=" + indeks +
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.indeks;
        return hash;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.indeks !=other.indeks){
            return false;
        }
        return true;

    }
}
