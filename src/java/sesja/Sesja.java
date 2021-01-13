/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesja;

import javax.ejb.Stateless;

/**
 *
 * @author user
 */
@Stateless
public class Sesja {

    private String login, imie, nazwisko, zalogowano, nip;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getZalogowano() {
        return zalogowano;
    }

    public void setZalogowano(String zalogowano) {
        this.zalogowano = zalogowano;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String info(Sesja sesja) {
        return " Zalogowano? " + sesja.zalogowano + "\n" + " Login " + sesja.login + "\n" + " Imię " + sesja.imie + "\n" + " Nazwisko " + sesja.nazwisko + "\n" + " NIP " + sesja.nip;
    }

}
