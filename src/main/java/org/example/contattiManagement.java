package org.example;
import java.util.*;
import java.util.Collections.*;
import java.util.LinkedList.*;

//import static java.lang.invoke.MethodHandleImpl.array;

public class contattiManagement {


    private List<Contatto>  c =null;

    public contattiManagement() {
        this.c = new ArrayList<Contatto>();

    }

    public String addContact (int id, String nome, String cognome) {
        try {
            c.add(new Contatto(id, nome, cognome));

        } catch (Exception e) {
            return "ko";
        }
        return "ok";
    }

    public  List<Contatto> readContact () {
       return c;

    }

    public String readContattoId(int id) {
       return c.get(id-1).getNome();

    }

    public List<Contatto> readContactNome(String nome) {
        List<Contatto>contatti=new ArrayList<Contatto>();
        for (Contatto contact:c) {
            if(contact.getNome().contentEquals(nome)) {
                contatti.add(contact);
            }
        }
        return contatti;
    }

    public String upDateContac(int id,String nome,String cognome) {
        try {
            c.get(id - 1).setNome(nome);

            c.get(id - 1).setCognome(cognome);
        }catch (Exception e) {
            return "ko";
        }
        return "ok";
    }

    public String deleteContac(int id) {
        try {
            c.remove(id - 1);
        } catch (Exception e){
            return "ko";
        }
        return "ok";

    }



    public int sizeContatto() {
        return c.size();
    }
}
